package com.cits.value;
import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * 書籍テーブルのValueクラス（Formクラスとしても流用）
 * @author imagepit
 */
@Data
@NoArgsConstructor
public class Book implements Serializable {
	private Integer id;
	private String title;
	private String author;
	private String status;
	private Date startDate;
	private Date endDate;
	private BookCategory category; // 「1」の関係を持っているエンティティを追加
}
