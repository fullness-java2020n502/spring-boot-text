package com.cits.di;
/**
 * 計算処理インターフェース
 * @author imagepit
 */
public interface Calculator {
	/**
	 * 計算実行メソッド
	 * @param x 変数x
	 * @param y 変数y
	 * @return 計算結果
	 */
	int executeCalculation(int x, int y);
}
