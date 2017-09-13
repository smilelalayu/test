package com.hm.repay.formula;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.hm.repay.model.RepayPlanResult;
import com.hm.sys.util.MathUtil;

public class PI {
	/**
	 * 生成每月还款金额
	 * 
	 * @param BigDecimal
	 *            pri 借款本金
	 * @param Integer
	 *            trm 借款本金
	 * @param BigDecimal
	 *            rate 月平息费率
	 * @param BigDecimal
	 *            discount 月平息费率 折扣
	 * @param Boolean
	 *            pchIns 是否购买保险
	 * @param BigDecimal
	 *            insRate 保险费率
	 * @param BigDecimal
	 *            monRate 借款月利率
	 * 
	 * @return ArrayList<BigDecimal> 还款计划列表，目前方法没做最后一笔兜底计算
	 */
	public static ArrayList<RepayPlanResult> calcPI(BigDecimal pri, Integer trm, BigDecimal rate, BigDecimal discount, Boolean pchIns, BigDecimal insRate,
			BigDecimal monRate, Date rpyDate) {
		BigDecimal p = MathUtil.divRate(pri, BigDecimal.valueOf(trm)); // 计算本金
		rate = MathUtil.mulRate(rate, MathUtil.sub(BigDecimal.ONE, discount)); // 折扣
		// 公式:
		// rate*(1-discount)
		BigDecimal i = MathUtil.mulRate(pri, rate); // 计算利息
		BigDecimal insFee = BigDecimal.ZERO;
		if (pchIns) {
			insFee = MathUtil.mulRate(pri, insRate); // 计算保险费率
		}
		ArrayList<RepayPlanResult> piList = new ArrayList<RepayPlanResult>();
		BigDecimal ctAmt = MathUtil.add(MathUtil.add(p, i), insFee); // 计算当期应还

		// Date rpyDate = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		if (null != rpyDate)
			gc.setTime(rpyDate);
		/*gc.add(2, 1);
		if (gc.get(Calendar.DATE) >= 29) {
			gc.set(Calendar.DATE, 1);
			gc.add(2, 1);
		}*/
		for (int j = 0; j < trm; j++) {
			RepayPlanResult rp = new RepayPlanResult();
			rp.setPeriod(j + 1); // 还款期次
			rp.setMonRepAmt(MathUtil.mul(ctAmt, BigDecimal.ONE)); // 还款金额
			if (j != 0) {
				gc.add(2, 1);
			}
			rp.setRepayDate(gc.getTime());
			rp.setInsFee(MathUtil.mul(insFee,BigDecimal.ONE));//保险费率
			piList.add(rp); // 如需要考虑最后一期兜底情况可于此处进行改造
		}

		// 每月还款利息和本金需要通过NPV计算合同金额
		BigDecimal npvAmt = NPV.calcNPV(monRate, piList); // 计算折现金额
		for (int k = 0; k < trm; k++) {
			piList.get(k).setMonRepIns(MathUtil.mul(npvAmt, monRate)); // 设置每月利息
			piList.get(k).setMonRepPri(MathUtil.mul(MathUtil.sub(ctAmt, piList.get(k).getMonRepIns()), BigDecimal.ONE)); // 每月本金=合同金额-每月利息
			npvAmt = MathUtil.sub(npvAmt, piList.get(k).getMonRepPri());
		}

		return piList;
	}

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());
		gc.add(Calendar.DATE, 3);
		ArrayList<RepayPlanResult> piList = calcPI(BigDecimal.valueOf(3500), 15, BigDecimal.valueOf(0.03408), BigDecimal.valueOf(0.00), true,
				BigDecimal.valueOf(0.007), BigDecimal.valueOf(0.011), new Date(gc.getTimeInMillis()));
		for (int i = 0; i < piList.size(); i++) {
			System.out.println(piList.get(i).getPeriod() + "\t" + piList.get(i).getRepayDate() + "\t" + piList.get(i).getMonRepAmt() + "\t"
					+ piList.get(i).getMonRepIns() + "\t" + piList.get(i).getMonRepPri() + "\t");
		}
	}
}
