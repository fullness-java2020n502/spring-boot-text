package com.cits.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cits.value.Book;
import com.cits.value.IBookRepository;

/**
 * Mybatisを使った永続化をする実装クラス
 * @author imagepit
 */
@Repository
public class BookRepositoryMybatis implements IBookRepository{
	@Autowired BookMapper mappar;

	@Override
	public List<Book> selectAll() {
		return mappar.selectAll();
	}

	@Override
	public Book selectById(int id) {
		return mappar.selectById(id);
	}

	@Override
	public int selectMaxIdValue() {
		return mappar.selectMaxIdValue();
	}

	@Override
	public void insert(Book book) {
		mappar.insert(book);
	}

	@Override
	public void update(Book book) {
		mappar.update(book);
	}

	@Override
	public List<Book> selectAllWithCategory() {
		return mappar.selectAllWithCategory();
	}

}
