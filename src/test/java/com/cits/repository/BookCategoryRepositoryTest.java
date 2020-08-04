package com.cits.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 書籍カテゴリリポジトリのテストクラス
 * @author imagepit
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BookCategoryRepositoryTest {
	/** 書籍カテゴリリポジトリ */
	@Autowired BookCategoryRepository repository;
	/**
	 * 全件取得テスト<br>
	 * 取得件数があっているかのテスト
	 */
	@Test
	void testSelectAll() {
		assertEquals(2, repository.selectAll().size()); // 件数が2件か確認
		repository.selectAll().forEach(System.out::println); // デバッグ
	}
}
