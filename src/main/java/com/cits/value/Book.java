package com.cits.value;
import java.sql.Date;
import lombok.Data;

/**
 * 書籍テーブルのValueクラス
 * @author imagepit
 */
@Data
public class Book {
	private int id;
	private String title;
	private String author;
	private String status;
	private Date startDate;
	private Date endDate;
}
