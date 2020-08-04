-- Mybatisの使い方
-- [x] 1. テーブルの作成
-- [x] 2. エンティティの作成
-- [x] 3. マッパーインターフェースの作成
-- [x] 4. マッパーXMLの作成
-- 書籍
drop table if exists t_book;
create table t_book(
	id integer primary key,
	title varchar(100),
	author varchar(200),
	status varchar(2),
	start_date date,
	end_date date,
	category_id integer
);
-- ユーザ
drop table if exists t_user;
create table t_user(
	id integer primary key,
	password varchar(10),
	name varchar(40)
);
-- 書籍カテゴリ
drop table if exists t_book_category;
create table t_book_category(
	id integer primary key,
	name varchar(255) not null
);