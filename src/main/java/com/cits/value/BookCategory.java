package com.cits.value;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 書籍カテゴリのエンティティ
 * @author imagepit
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor // <-必須の引数を決められるコンストラクタ
public class BookCategory implements Serializable{
	private final Integer id; // <- 必須の引数
	private final String name; // <- 必須の引数
	private List<Book> books; // 「書籍カテゴリ」と「書籍」は「1 対 多」の関係したフィールド
}
