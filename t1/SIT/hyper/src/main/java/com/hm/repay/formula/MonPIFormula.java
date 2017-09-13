package com.hm.repay.formula;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hm.sys.util.MathUtil;

//按期等额本息计算公式
public class MonPIFormula {
	// 计算等额本息
	private static BigDecimal calcMonPerPI(BigDecimal amt, BigDecimal rate, Integer trm) {
		BigDecimal monPI = BigDecimal.ZERO;
		// BigDecimal repayRate = Util.add(rate, BigDecimal.ONE);
		// repayRate = Util.mulRate(repayRate.pow(trm), BigDecimal.ONE);

		BigDecimal repayRate = MathUtil.add(rate, BigDecimal.ONE);
		// System.out.println(Math.round((1.00d/12.00d)*10000d)/10000d);
		//double pm = Math.round(Math.pow(repayRate.doubleValue(), (1.00d / 12.00d)) * 10000d) / 10000d;
		double pm = Math.pow(repayRate.doubleValue(), (1.00d / 12.00d));
		// System.out.println(pm);
		repayRate = MathUtil.sub(BigDecimal.valueOf(pm), BigDecimal.ONE);
		System.out.println(repayRate);
		
		monPI = MathUtil.mulRate(amt, rate);
		monPI = MathUtil.mulRate(monPI, repayRate);
		monPI = MathUtil.div(monPI, MathUtil.sub(repayRate, BigDecimal.ONE));
		return monPI;
	}

	// 计算按期等额[0]应收本息, [1]应收本金, [2]应收利息, [3]剩余本金, [4]累计本金, [5]累计利息
	public static List<BigDecimal[]> calcPIList(BigDecimal amt, BigDecimal rate, Integer trm) {
		List<BigDecimal[]> retList = new ArrayList<BigDecimal[]>();
		rate = MathUtil.divRate(rate, BigDecimal.valueOf(100));
		BigDecimal monPerPI = calcMonPerPI(amt, rate, trm);
		BigDecimal totP = BigDecimal.ZERO;// 累计应收本金
		BigDecimal totI = BigDecimal.ZERO;// 累计应收利息

		BigDecimal totPI0 = BigDecimal.ZERO; // 总应收本息
		BigDecimal totPI2 = BigDecimal.ZERO; // 总应收利息
		BigDecimal totPI3 = BigDecimal.ZERO; // 总剩余本金
		BigDecimal totPI4 = BigDecimal.ZERO; // 总累计本金
		for (int i = 0; i < trm; i++) {
			BigDecimal[] pi = new BigDecimal[6];

			if (i != trm - 1) {
				BigDecimal inst = MathUtil.mul(MathUtil.sub(amt, totP), rate);
				BigDecimal pri = MathUtil.mul(MathUtil.sub(monPerPI, inst), BigDecimal.ONE);
				totP = MathUtil.add(totP, pri);
				totI = MathUtil.add(totI, inst);

				pi[0] = MathUtil.mul(monPerPI, BigDecimal.ONE);
				pi[1] = MathUtil.mul(pri, BigDecimal.ONE);
				pi[2] = MathUtil.mul(inst, BigDecimal.ONE);
				pi[3] = MathUtil.mul(MathUtil.sub(amt, totP), BigDecimal.ONE);
				pi[4] = MathUtil.mul(totP, BigDecimal.ONE);
				pi[5] = MathUtil.mul(totI, BigDecimal.ONE);
			} else {
				BigDecimal inst = MathUtil.mulRate(MathUtil.sub(amt, totP), rate);
				BigDecimal pri = MathUtil.sub(amt, totP);
				totP = MathUtil.add(totP, pri);
				totI = MathUtil.add(totI, inst);

				pi[1] = MathUtil.mul(pri, BigDecimal.ONE);
				pi[2] = MathUtil.mul(inst, BigDecimal.ONE);
				pi[0] = MathUtil.mul(MathUtil.add(pi[1], pi[2]), BigDecimal.ONE);
				pi[3] = MathUtil.mul(MathUtil.sub(amt, totP), BigDecimal.ONE);
				pi[4] = MathUtil.mul(totP, BigDecimal.ONE);
				pi[5] = MathUtil.mul(totI, BigDecimal.ONE);
			}
			retList.add(pi);
			totPI0 = MathUtil.add(totPI0, pi[0]);
			totPI2 = MathUtil.add(totPI2, pi[2]);
			totPI3 = MathUtil.add(totPI3, pi[3]);
			totPI4 = MathUtil.add(totPI4, pi[4]);
		}
		BigDecimal[] pi = new BigDecimal[6];
		pi[0] = MathUtil.mul(totPI0, BigDecimal.ONE);
		pi[1] = MathUtil.mul(totP, BigDecimal.ONE);
		pi[2] = MathUtil.mul(totPI2, BigDecimal.ONE);
		pi[3] = MathUtil.mul(totPI3, BigDecimal.ONE);
		pi[4] = MathUtil.mul(totPI4, BigDecimal.ONE);
		pi[5] = MathUtil.mul(totI, BigDecimal.ONE);
		retList.add(pi);

		return retList;
	}

	public static void main(String[] args) {
		List<BigDecimal[]> list = MonPIFormula.calcPIList(BigDecimal.valueOf(1000), BigDecimal.valueOf(18), 3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "\t" + list.get(i)[0] + "\t" + list.get(i)[1] + "\t" + list.get(i)[2] + "\t" + list.get(i)[3] + "\t" + list.get(i)[4]
					+ "\t" + list.get(i)[5]);
		}
	}
}