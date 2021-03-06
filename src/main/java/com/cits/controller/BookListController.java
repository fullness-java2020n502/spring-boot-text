package com.cits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cits.repository.BookRepository;

@Controller
@RequestMapping("book-list")
public class BookListController {
	@Autowired BookRepository bookRepository;
	@GetMapping
	public String bookList(Model model) {
		model.addAttribute(
				"bookList",
				bookRepository.selectAllWithCategory()
		);
		return "book-list/index";
	}
}
