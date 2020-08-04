-- ユーザ
INSERT INTO T_USER (ID, PASSWORD, NAME) VALUES(1, 'pass1', 'user1');
-- 書籍
INSERT INTO T_BOOK VALUES(1, 'やさしいJava', '高橋麻奈', '可', null, null, 1);
INSERT INTO T_BOOK VALUES(2, '基礎からのサーブレット/JSP', '宮本信二', '不可', '2020-08-10', '2020-08-20', 1);
INSERT INTO T_BOOK VALUES(3, '10日で覚えるJavaオブジェクト指向入門教室', '丸の内とら', '可', null, null, 1);
INSERT INTO T_BOOK VALUES(4, '坊ちゃん', '夏目漱石', '可', null, null, 2);
-- 書籍カテゴリ
INSERT INTO T_BOOK_CATEGORY VALUES(1, '技術系');
INSERT INTO T_BOOK_CATEGORY VALUES(2, '小説');
-- INSERT INTO T_BOOK_CATEGORY VALUES(3, '芸術系');
