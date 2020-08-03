package com.cits.value;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 書籍テーブルのValueクラス
 * @author imagepit
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private int id;
	private String title;
	private String author;
	private String status;
	private Date startDate;
	private Date endDate;
}
