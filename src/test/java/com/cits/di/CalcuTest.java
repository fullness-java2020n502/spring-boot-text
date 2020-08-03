package com.cits.di;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Calcuクラスのテストクラス
 * @author imagepit
 */
// Spring Frameworｋを起動してテストを実行したい場合は
// 下記アノテーションをテストクラスに付与する
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CalcuTest {
	// インスタンス化されたものを代入する場合は
	// その対象の上に@Autowiredをつける
	@Autowired
	Calcu calcu;
	// ↑Spring Frameworkが起動するとインスタンスを代入

	@Test
	void DIされているかの確認() {
		assertEquals(3, calcu.add(1, 2));
	}
}
