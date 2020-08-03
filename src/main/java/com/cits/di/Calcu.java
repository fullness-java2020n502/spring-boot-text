package com.cits.di;

import org.springframework.stereotype.Component;

/**
 * 計算クラス（DI対象）
 * @author imagepit
 */
@Component
public class Calcu {
	/**
	 * 足し算処理
	 * @param x 足される数
	 * @param y 足す数
	 * @return 足し算結果
	 */
	public int add(int x, int y) {
		return x + y;
	}
}
