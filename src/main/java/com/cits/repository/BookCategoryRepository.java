package com.cits.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cits.value.BookCategory;

/**
 * 書籍カテゴリ マッパーインターフェース
 * @author imagepit
 */
@Mapper
public interface BookCategoryRepository {
	/**
	 * 全件取得
	 * @return 書籍カテゴリリスト
	 */
	List<BookCategory> selectAll();
	/**
	 * 1件取得
	 * @param id カテゴリID
	 * @return 書籍カテゴリ
	 */
	BookCategory selectById(int id);
	/**
	 * 1件登録
	 * @param bookCategory 書籍カテゴリ
	 * @return 更新結果(true: 成功, false: 失敗)
	 */
	Boolean insert(BookCategory bookCategory);
	/**
	 * 1件更新
	 * @param bookCategory 書籍カテゴリ
	 * @return 更新結果(true: 成功, false: 失敗)
	 */
	Boolean updateById(BookCategory bookCategory);
	/**
	 * 1件削除
	 * @param bookCategory 書籍カテゴリ
	 * @return 更新結果(true: 成功, false: 失敗)
	 */
	Boolean deleteById(BookCategory bookCategory);
}
