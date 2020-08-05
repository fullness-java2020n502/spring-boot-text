package com.cits.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cits.value.Book;

import lombok.Data;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BookRepositoryTest {
	@Autowired BookRepository repository;
	@Test
	void 全件取得の確認() {
		repository.selectAll().forEach(System.out::println);
	}
	@Test
	void 一件取得の確認() {
		Book book = repository.selectById(1);
		assertEquals("高橋麻奈", book.getAuthor());
	}
	@Test
	void 主キーの最大値を取得() {
		// assertEquals(4, repository.selectMaxIdValue());
	}
	@Test
	@Sql({"/schema.sql","/data.sql"})
	void 登録確認() {
		repository.insert(new Book(repository.selectMaxIdValue(), "タイトル1", "著者1", "可"));
		assertEquals(5, repository.selectAll().size());
	}
	@Test
	@Sql({"/schema.sql","/data.sql"})
	void 更新確認() {
		Book book = new Book(1, "やさしいJava2", "高橋2", "不可");
		repository.update(book);
		assertEquals("高橋2", repository.selectById(1).getAuthor());
	}
	@Test
	void testSelectAllWithCategory() {
		repository.selectAllWithCategory()
			.forEach(System.out::println);
	}
}
