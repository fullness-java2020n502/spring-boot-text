package com.cits.service;

import com.cits.value.Book;

/**
 * 書籍管理（追加、更新、削除）サービスインターフェース
 * @author imagepit
 */
public interface BookService {
	/**
	 * 書籍登録機能
	 * @param book
	 */
	void addBook(Book book);
}
