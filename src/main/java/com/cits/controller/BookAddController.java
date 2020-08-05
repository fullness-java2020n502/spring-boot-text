package com.cits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 書籍登録機能コントローラー
 * @author imagepit
 */
@Controller
@RequestMapping("book-add") // 「http://localhost:8080/book-add」のURLでリクエストされたら呼ばれる
public class BookAddController {
	@GetMapping("input") //  「http://localhost:8080/book-add/input」のURLでGETリクエストされたら呼ばれる
	public String input() {
		return "book-add/input"; // 「resource/templetes/book-add/input.html」のViewでレスポンス
	}
	@PostMapping("confirm") // 「http://localhost:8080/book-add/confirm」のURLでPOSTリクエストされたら呼ばれる
	public String confirm() {
		return "book-add/confirm";// 「resource/templetes/book-add/confirm.html」のViewでレスポンス
	}
	@PostMapping("complete") // 「http://localhost:8080/book-add/complete」のURLでPOSTリクエストされたら呼ばれる
	public String complete() {
		return "book-add/complete";// 「resource/templetes/book-add/complete.html」のViewでレスポンス
	}
}
