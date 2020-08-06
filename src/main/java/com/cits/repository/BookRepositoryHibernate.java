package com.cits.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cits.value.Book;
import com.cits.value.IBookRepository;

@Repository
public class BookRepositoryHibernate implements IBookRepository{
	@Override
	public List<Book> selectAll() {
		// TODO Hibernateを使ったCRUD処理
		return null;
	}

	@Override
	public Book selectById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int selectMaxIdValue() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void insert(Book book) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void update(Book book) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<Book> selectAllWithCategory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
