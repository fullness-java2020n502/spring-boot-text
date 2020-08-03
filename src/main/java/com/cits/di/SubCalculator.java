package com.cits.di;

import org.springframework.stereotype.Component;

/**
 * 引き算クラス
 * @author imagepit
 */
@Component
public class SubCalculator implements Calculator{
	@Override
	public int executeCalculation(int x, int y) {
		return x - y;
	}
}
