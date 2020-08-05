package com.cits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.cits.form.BookForm;
import com.cits.value.Book;

/**
 * 書籍登録機能コントローラー
 * @author imagepit
 */
@Controller
@RequestMapping("book-add")
@SessionAttributes("bookAddForm") // <- bookAddFormという名前のmodel属性名がセッションスコープになる
public class BookAddController {
	// modelオブジェクトの初期化
	@ModelAttribute("bookAddForm")
	public BookForm initBook() {
		return new BookForm();
	}
	@GetMapping("input")
	public String input() {
		return "book-add/input";
	}
	@PostMapping("confirm")
	public String confirm(@ModelAttribute("bookAddForm") BookForm book,Model model) {
		return "book-add/confirm";
	}
	@PostMapping("execute")
	public String Execute() {
		// TODO DB登録処理
		return "redirect:complete"; // <- リダイレクト（PRG）
	}
	@GetMapping("complete")
	public String complete(SessionStatus status) {
		status.setComplete(); // <- セッションを破棄
		return "book-add/complete";
	}
}
