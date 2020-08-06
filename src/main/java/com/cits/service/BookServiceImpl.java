package com.cits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cits.value.Book;
import com.cits.value.IBookRepository;

/**
 * 書籍管理（追加、更新、削除）サービス実装クラス
 * @author imagepit
 */
@Service
@Transactional
public class BookServiceImpl implements BookService{
	@Qualifier("bookRepositoryMybatis")
	@Autowired IBookRepository bookRepository;
	// @Autowired BookRepository bookRepository;
	@Override
	public void addBook(Book book) {
		bookRepository.insert(book);
	}
}
