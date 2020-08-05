package com.cits.controller;
/**
 * 書籍貸し出し機能コントローラー
 * @author imagepit
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cits.repository.BookRepository;

@Controller
@RequestMapping("book-rent")
public class BookRentController {
	@Autowired BookRepository bookRepository;
	@GetMapping("{no}") // http://localhost:8080/book-rent/3
	public String input(
		@PathVariable Integer no,
		Model model
	) {
		model.addAttribute("book", bookRepository.selectById(no));
		return "book-rent/input";
	}
}
