package com.cits.value;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.Test;

/**
 * Employeeクラスのテストクラス
 * @author imagepit
 */
public class EmployeeTest {
	/**
	 * 初期化（インスタンス化）のテスト
	 */
	@Test
	void testInit() {
		// テストとして確認したい処理
		Employee employee = new Employee(1, "高橋", Date.valueOf("2000-01-01"), 1);
		// テスト対象の処理結果を評価するコードを追加
		assertEquals(1, employee.getId());
		assertEquals("高橋", employee.getName());
		assertEquals(Date.valueOf("2000-01-01"), employee.getBirthday());
		assertEquals(1, employee.getDeptNo());
	}
}
