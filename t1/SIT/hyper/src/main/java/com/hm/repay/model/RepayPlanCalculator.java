package com.hm.repay.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gep.core.util.InputChecker;
import com.hm.repay.formula.NPV;
import com.hm.repay.formula.PI;
import com.hm.sys.constants.SysConstants;
import com.hm.sys.util.MathUtil;

public class RepayPlanCalculator {
	/**
	 * 通过年贷款利率(等额本息)计算月贷款利率(等额本息) 公式: 月贷款利率 = (1+通过年贷款利率)^(1/12)-1
	 * 
	 * @param BigDecimal
	 *            yearRate 年贷款利率（等额本息）
	 * 
	 * @return BigDecimal 月贷款利率（等额本息）
	 */
	private static BigDecimal calcMonLoanRate(BigDecimal yearRate) {
		BigDecimal repayRate = MathUtil.add(yearRate, BigDecimal.ONE);
		double pm = Math.pow(repayRate.doubleValue(), (1.00d / 12.00d)); // 次方
		repayRate = MathUtil.sub(BigDecimal.valueOf(pm), BigDecimal.ONE);
		/**
		 * modify date:2017/1/23
		 * modify by:hewei
		 * modify readmineNu:344
		 */
		//return MathUtil.mul4Dig(repayRate, BigDecimal.ONE);
		return repayRate.multiply(BigDecimal.ONE).setScale(16, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 玖富超能咨询费、信息管理费、每月还款额计算
	 * 
	 * @param BigDecimal
	 *            principal 借款本金
	 * @param Integer
	 *            terms 借款期数
	 * @param Date
	 *            payDate 放款日期
	 * @param BigDecimal
	 *            yearRate 年贷款利率（等额本息）
	 * @param BigDecimal
	 *            totRate 月平息费率
	 * @param BigDecimal
	 *            trDiscount 月平息费率 折扣
	 * @param Boolean
	 *            pchIns 是否购买保险
	 * @param BigDecimal
	 *            insRate 保险费率
	 * @param BigDecimal
	 *            infoFeeRate 信用管理费率
	 * 
	 * @return void
	 */
	public static List<RepayPlanResult> calcICFee(BigDecimal principal, Integer terms, Date payDate, BigDecimal yearRate, BigDecimal totRate,
			BigDecimal trDiscount, Boolean pchIns, BigDecimal insRate, BigDecimal infoFeeRate) {
		BigDecimal monRate = calcMonLoanRate(yearRate); // 计算月贷款利率(等额本息)
		List<RepayPlanResult> PIList = PI.calcPI(principal, terms, totRate, trDiscount, pchIns, insRate, monRate, payDate); // 计算每月还款金额
//		BigDecimal npvAmt = NPV.calcNPV(monRate, PIList); // 计算折现金额
//		BigDecimal infoFee = MathUtil.mul(npvAmt, infoFeeRate); // 信息费
//		BigDecimal consultFee = MathUtil.sub(MathUtil.sub(npvAmt, principal), infoFee); // 咨询费
//		System.out.println("咨询服务费 每期: " + MathUtil.div(consultFee, BigDecimal.valueOf(terms)) + "\t合计: " + consultFee);
//		System.out.println("信用管理费 每期: " + MathUtil.div(infoFee, BigDecimal.valueOf(terms)) + "\t合计: " + infoFee);

		// BigDecimal totIns = BigDecimal.ZERO; //计算累计应还利息
		// BigDecimal sPri = npvAmt;
		// for (int i = 0; i < trm; i++) {
		// BigDecimal cIns = Util.mul(sPri, monRate);
		// BigDecimal cPri = Util.sub(PIList.get(0), cIns);
		// sPri = Util.sub(sPri, cPri);
		// totIns = Util.add(totIns, cIns);
		// }
//		System.out.println("合同金额: " + npvAmt);
//		System.out.println("合同月利率（等额本息）: " + monRate);
//		BigDecimal totalFee = MathUtil.sub(npvAmt, principal);
//		System.out.println("总费用: " + totalFee);
//		System.out.println("每月还款:");
//		System.out.println("期数\t还款日期\t\t月还款额（本息）\t当期利息\t当期本金");
//		for (int i = 0; i < PIList.size(); i++) {
//			System.out.println(PIList.get(i).getPeriod() + "\t" + PIList.get(i).getRepayDate() + "\t" + PIList.get(i).getMonRepAmt() + "\t\t"
//					+ PIList.get(i).getMonRepIns() + "\t" + PIList.get(i).getMonRepPri() + "\t");
//		}
		return PIList;
	}

	public static RepayPlan calcICFee(RepayPlan plan) {
		BigDecimal principal = plan.getPrincipal();
		Integer terms = plan.getTerms();
		Date payDate = plan.getPayDate();
		BigDecimal yearRate = plan.getYearRate();

		BigDecimal totRate = plan.getTotRate();
		BigDecimal trDiscount = plan.getTrDiscount();

		Boolean pchIns = plan.isPchIns();
		BigDecimal insRate = plan.getInsRate();
		BigDecimal infoFeeRate = plan.getInfoFeeRate();

		BigDecimal monRate = calcMonLoanRate(yearRate); // 计算月贷款利率(等额本息)

		List<RepayPlanResult> PIList = PI.calcPI(principal, terms, totRate, trDiscount, pchIns, insRate, monRate, payDate); // 计算每月还款金额
		BigDecimal npvAmt = NPV.calcNPV(monRate, PIList); // 计算折现金额
		BigDecimal infoFee = MathUtil.mul4Dig(MathUtil.divRate(MathUtil.divRate(MathUtil.mulRate(npvAmt, infoFeeRate), principal), BigDecimal.valueOf(terms)),
				BigDecimal.valueOf(1)); // 信息费

		BigDecimal monthlyInsFee = MathUtil.mul(principal, insRate);
		ArrayList<RepayPlanResult> mfList = new ArrayList<RepayPlanResult>();
		RepayPlanResult rp = new RepayPlanResult();
		if (pchIns) {
			rp.setMonRepAmt(monthlyInsFee);
		} else {
			rp.setMonRepAmt(BigDecimal.ZERO);
		}
		for (int i = 0; i < terms; i++) {
			mfList.add(rp);
		}
		
		BigDecimal poundageTotal = NPV.calcNPV(monRate, mfList);//手续费合计
		
		BigDecimal monthlyFee = MathUtil.div4Dig(poundageTotal, BigDecimal.valueOf(terms)); // 月均手续费

		BigDecimal consultFeeTotal = MathUtil.sub(MathUtil.sub(MathUtil.sub(npvAmt, principal), MathUtil.mul(npvAmt, infoFeeRate)), poundageTotal);//咨询服务费合计
		

			if(!InputChecker.isEmpty(plan.getBjIncomeRate())){
				BigDecimal ensureFee =null;
				if(SysConstants.BUS_PRODUCT_ID_ARRAY.equals(plan.getBusProductId())){
					 ensureFee = MathUtil.add(MathUtil.mul(npvAmt, plan.getAssureBondRate()), MathUtil.mul(poundageTotal, plan.getSettleBondRate()));
					}else{
					 ensureFee = MathUtil.mul(npvAmt, plan.getAssureBondRate());	
					}
				
				BigDecimal consultServiceFee = MathUtil.add(consultFeeTotal, MathUtil.mul(poundageTotal, new BigDecimal(0.985)));
				BigDecimal insuranceFee = MathUtil.mul(npvAmt, plan.getSafeAccruedRate());
				//BigDecimal advanceSettleFee = MathUtil.mul(npvAmt, plan.getSettleBondRate());
				//BigDecimal manageFee = MathUtil.mul(consultServiceFee, plan.getCnIncomeRate());
				BigDecimal blserviceFee =  MathUtil.div4Dig(MathUtil.mul(consultServiceFee,plan.getBlIncomeRate()),principal);
				//plan.setConsultServiceFee(MathUtil.mul(consultServiceFee,plan.getBjIncomeRate()));//咨询服务费
				plan.setConsultServiceFee(consultServiceFee);//咨询服务费
				plan.setEnsureFee(ensureFee);//保障计划专款人民币
				plan.setInsuranceFee(insuranceFee);//保险费
				//plan.setAdvanceSettleFee(advanceSettleFee);//提前结清服务费
				//plan.setManageFee(manageFee);//管理服务费
				plan.setBlserviceFee(blserviceFee);//保理服务费和预支价金比例
			}
		
		BigDecimal consultFee = MathUtil.mul4Dig(MathUtil.divRate(MathUtil.divRate(
				consultFeeTotal, principal),
				BigDecimal.valueOf(terms)), BigDecimal.valueOf(1)); // 月均咨询费率

		BigDecimal totalFee = MathUtil.sub(npvAmt, principal);
		plan.setPoundageTotal(poundageTotal);//手续费合计 
		plan.setNpvAmt(npvAmt.setScale(0, BigDecimal.ROUND_UP));
		plan.setMonRate(monRate);
		plan.setConsultFee(consultFee); // 月均资询服务费率
		plan.setInfoFeeRate(infoFeeRate);
		plan.setTotalFee(totalFee);
		plan.setInfoFee(infoFee); // 月均信用管理费率
		plan.setResults(PIList);
		plan.setMonthlyFee(MathUtil.mul(monthlyFee,BigDecimal.ONE)); // 月均手续费

		plan.setConsultFeeByMon(MathUtil.div(consultFeeTotal,BigDecimal.valueOf(terms)));//月均咨询服务费
		//plan.setCreditManageFeeByMon(MathUtil.div(MathUtil.mulRate(BigDecimal.valueOf(0.05),npvAmt),BigDecimal.valueOf(terms)));
		plan.setCreditManageFeeByMon(MathUtil.div(MathUtil.mulRate(infoFeeRate,npvAmt),BigDecimal.valueOf(terms)));
		System.out.println("合同金额: " + npvAmt);
		System.out.println("合同月利率（等额本息）: " + monRate);
		System.out.println("总费用: " + totalFee);
		System.out.println("月均咨询服务费率: " + consultFee);
		System.out.println("月均信用管理费率: " + infoFee);
		System.out.println("月均手续费: " + monthlyFee);
		System.out.println("月还款日: " + plan.getRepyDay());
		System.out.println("每月还款:");
		System.out.println("期数\t还款日期\t\t月还款额（本息）\t当期利息\t当期本金\t每月保险费用");
		for (int i = 0; i < PIList.size(); i++) {
			System.out.println(PIList.get(i).getPeriod() + "\t" + PIList.get(i).getRepayDate() + "\t" + PIList.get(i).getMonRepAmt() + "\t\t"
					+ PIList.get(i).getMonRepIns() + "\t" + PIList.get(i).getMonRepPri() + "\t" + PIList.get(i).getInsFee() + "\t");
		}

		return plan;
	}

	public static void main(String[] args) {
		/*
		 * calcICFee(BigDecimal.valueOf(1000), 10, new Date(),
		 * BigDecimal.valueOf(0.14), BigDecimal.valueOf(0.05),
		 * BigDecimal.valueOf(0.00), true, BigDecimal.valueOf(0.007),
		 * BigDecimal.valueOf(0.05));
		 */

		RepayPlan plan = new RepayPlan();
		plan.setPrincipal(BigDecimal.valueOf(4000));
		plan.setTerms(8);
		plan.setPayDate(new Date());
		plan.setYearRate(BigDecimal.valueOf(0.13));

		plan.setTotRate(BigDecimal.valueOf(0.0375));
		plan.setTrDiscount(BigDecimal.valueOf(0.00));

		plan.setPchIns(true);
		plan.setInsRate(BigDecimal.valueOf(0.007));
		plan.setInfoFeeRate(BigDecimal.valueOf(0.05));
		calcICFee(plan);

	}
}
