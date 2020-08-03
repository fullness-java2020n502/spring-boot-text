package com.cits.repository;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cits.value.Book;

/**
 * 書籍テーブル（保管庫）アクセスインターフェース
 * @author imagepit
 */
@Mapper
public interface BookRepository {
	@Select("select id, title, author, status, start_date as startDate, end_date as endDate from t_book")
	List<Book> selectAll();
	@Select("select id, title, author, status, start_date as startDate, end_date as endDate from t_book where id = #{id}")
	Book selectById(int id);
	@Select("select coalesce(max(id))+1 from t_book")
	int selectMaxIdValue();
	@Insert("insert into t_book values(#{id},#{title},#{author},#{status},#{startDate},#{endDate})")
	void insert(Book book);
	@Update("update t_book set title = #{title}, author = #{author}, status = #{status}, start_date = #{startDate}, end_date = #{endDate} where id = #{id}")
	void update(Book book);
}
