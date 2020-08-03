package com.cits.di;

import org.springframework.stereotype.Component;

/**
 * 足し算クラス
 * @author imagepit
 */
@Component
public class AddCalculator implements Calculator {
	@Override
	public int executeCalculation(int x, int y) {
		return x + y;
	}
}
