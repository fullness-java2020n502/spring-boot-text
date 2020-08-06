package com.cits.value;

import java.util.List;

public interface IBookRepository {
	List<Book> selectAll();
	Book selectById(int id);
	int selectMaxIdValue();
	void insert(Book book);
	void update(Book book);
	List<Book> selectAllWithCategory();
}
