package com.cits.value;

import java.sql.Date;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee employee =
				new Employee(1, "高橋", Date.valueOf("2000-01-01"), 1);
		// アドレス値でなくフィールドの値が出力
		System.out.println(employee);
		System.out.println(employee.getName());
	}
}
