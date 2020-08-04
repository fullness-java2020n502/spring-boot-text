package com.cits.value;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 書籍カテゴリのエンティティ
 * @author imagepit
 */
@Data
//@AllArgsConstructor
public class BookCategory implements Serializable{
	private Integer id;
	private String name;
	private List<Book> books; // 「書籍カテゴリ」と「書籍」は「1 対 多」の関係したフィールド
	// コンストラクタ
	public BookCategory(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
}
