package com.cits.value;


import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 社員クラス
 * @author imagepit
 */
@Data // toString()もオーバーライドしてくれている
@AllArgsConstructor // 全部のフィールドを引数にしたコンストラクタ
public class Employee {
	private int id;
	private String name;
	private Date birthday;
	private int deptNo;
}
