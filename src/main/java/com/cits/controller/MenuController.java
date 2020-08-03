package com.cits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cits.repository.BookRepository;

/**
 * メニュー画面用のコントローラークラス
 * @author imagepit
 */
@Controller
@RequestMapping("menu") // http://localhost:8080/menuで呼ばれるクラス
public class MenuController {
	@GetMapping() // GETのメソッドの場合
	public String menu(Model model) {
		model.addAttribute("message","こんにちは！！");
		return "menu";
	}
}
