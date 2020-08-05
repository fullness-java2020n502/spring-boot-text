package com.cits.value;
import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 書籍テーブルのValueクラス（Formクラスとしても流用）
 * @author imagepit
 */
@Data
//@AllArgsConstructor
@RequiredArgsConstructor
public class Book implements Serializable {
	private final Integer id;
	private final String title;
	private final String author;
	private final String status;
	private Date startDate;
	private Date endDate;
	private BookCategory category; // 「1」の関係を持っているエンティティを追加
}
