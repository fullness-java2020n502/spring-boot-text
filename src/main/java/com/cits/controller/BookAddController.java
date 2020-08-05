package com.cits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cits.value.Book;

/**
 * 書籍登録機能コントローラー
 * @author imagepit
 */
@Controller
@RequestMapping("book-add")
public class BookAddController {
	@GetMapping("input")
	public String input() {
		return "book-add/input";
	}
	@PostMapping("confirm")
	public String confirm(Book book,Model model) {
		model.addAttribute("book",book);
		return "book-add/confirm";
	}
	@PostMapping("execute")
	public String Execute() {
		// TODO DB登録処理
		return "redirect:complete"; // <- リダイレクト（PRG）
	}
	@GetMapping("complete")
	public String complete() {
		return "book-add/complete";
	}
}
