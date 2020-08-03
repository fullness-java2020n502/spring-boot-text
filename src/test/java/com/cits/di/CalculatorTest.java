package com.cits.di;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CalculatorTest {
	@Autowired
	Calculator subCalculator; // 引き算用のもの
	@Autowired
	Calculator addCalculator; // 足し算用のもの
	@Test
	void インターフェース依存の確認() {
		assertEquals(7, addCalculator.executeCalculation(5, 2));
		assertEquals(3, subCalculator.executeCalculation(5, 2));
	}
}
