package com.cits.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cits.value.BookCategory;

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
	@Sql({"/schema.sql","/data.sql"}) // <- テスト実施前に左記のsqlを実行
	void testSelectAll() {
		assertEquals(2, repository.selectAll().size()); // 件数が2件か確認
		repository.selectAll().forEach(System.out::println); // デバッグ
	}
	/**
	 * 1件取得テスト<br>
	 * 取得件数があっているかのテスト
	 */
	@Test
	@Sql({"/schema.sql","/data.sql"})
	void testSelectById() {
		assertEquals("技術系", repository.selectById(1).getName());
		repository.selectAll().forEach(System.out::println);
	}
	/**
	 * 1件登録テスト<br>
	 * 登録後に取得件数があっているかのテスト
	 */
	@Test
	@Sql({"/schema.sql","/data.sql"})
	void testInsert() {
		repository.insert(new BookCategory(3,"雑誌"));
		assertEquals(3, repository.selectAll().size());
		repository.selectAll().forEach(System.out::println);
	}
	/**
	 * 1件更新テスト<br>
	 * - 正常に更新されているか<br>
	 * - 更新したカテゴリ名があっているか<br>
	 */
	@Test
	@Sql({"/schema.sql","/data.sql"})
	void testUpdateById() {
		assertEquals(true, repository.updateById(new BookCategory(1,"IT系")));
		assertEquals("IT系", repository.selectById(1).getName());
		repository.selectAll().forEach(System.out::println);
	}
	/**
	 * 1件削除テスト<br>
	 * - 正常に削除されているか<br>
	 * - 削除したカテゴリIDで検索したらnullが返ってくるか<br>
	 */
	@Test
	@Sql({"/schema.sql","/data.sql"})
	void testDeleteById() {
		assertEquals(true, repository.deleteById(new BookCategory(1,null)));
		assertEquals(null, repository.selectById(1));
		repository.selectAll().forEach(System.out::println);
	}


}
