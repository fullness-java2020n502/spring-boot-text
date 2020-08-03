package com.cits.value;
/**
 * Bookクラスのテストクラス
 * @author imagepit
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import org.junit.jupiter.api.Test;
/**
 * Bookクラスのテストクラス
 * @author imagepit
 */
public class BookTest {
	@Test
	void 初期化テスト() {
		// テストする処理
		Book book = new Book();
		book.setId(1);
		book.setTitle("坊ちゃん");
		book.setAuthor("夏目漱石");
		book.setStatus("可");
		book.setStartDate(Date.valueOf("2020-08-01"));
		book.setEndDate(Date.valueOf("2020-08-08"));
		// 処理結果の評価
		assertEquals(1, book.getId());
		assertEquals("坊ちゃん", book.getTitle());
		assertEquals("夏目漱石", book.getAuthor());
		assertEquals("可", book.getStatus());
		assertEquals(Date.valueOf("2020-08-01"), book.getStartDate());
		assertEquals(Date.valueOf("2020-08-08"), book.getEndDate());
	}
}
