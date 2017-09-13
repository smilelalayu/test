package com.hm.repay.formula;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hm.repay.model.RepayPlanResult;
import com.hm.sys.util.MathUtil;


public class NPV {
	/**
	 * 计算合同金额(折现金额)，此方法对应Excel下的npv()方法，公式 :
	 * 月还款金额/(1+月贷款利率)^期次+月还款金额/(1+月贷款利率)^期次+月还款金额/(1+月贷款利率)^期次+...
	 * 
	 * @param BigDecimal
	 *            rate 月贷款利率
	 * @param ArrayList
	 *            <BigDecimal> bdList 借款本金
	 * 
	 * @return BigDecimal 合同金额(折现金额)
	 */
	public static BigDecimal calcNPV(BigDecimal rate, List<RepayPlanResult> bdList) {
		BigDecimal npv = BigDecimal.ZERO;
		double mr = MathUtil.add(rate, BigDecimal.ONE).doubleValue();// (1+月贷款利率)
		for (int i = 0; i < bdList.size(); i++) {
			double pow = Math.pow(mr, (i + 1)); // 次方
			npv = MathUtil.add(npv, MathUtil.divRate(bdList.get(i).getMonRepAmt(), BigDecimal.valueOf(pow)));// 月还款金额/(1+月贷款利率)^次方
		}
		return MathUtil.mul(npv, BigDecimal.ONE); // 保留两位小数
	}

	public static void main(String[] args) {
		BigDecimal rate = BigDecimal.valueOf(0.011);
		ArrayList<RepayPlanResult> bdList = new ArrayList<RepayPlanResult>();
		RepayPlanResult rp = new RepayPlanResult();
		rp.setMonRepAmt(BigDecimal.valueOf(377.11));
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);
		bdList.add(rp);

		System.out.println(calcNPV(rate, bdList));

	}

}
