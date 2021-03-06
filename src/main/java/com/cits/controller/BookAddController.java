package com.cits.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cits.form.BookForm;
import com.cits.form.BookFormValidator;
import com.cits.helper.FileUploadHelper;
import com.cits.service.BookService;
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

	// バリデータをDI
	@Autowired
	BookFormValidator bookFormValidator;
	// バリデータをこのコントローラーに登録
	@InitBinder("bookAddForm")
	public void InitBinder(WebDataBinder binder) {
		binder.addValidators(bookFormValidator);
	}

	// HttpSessionはDIで呼び出せます
	@Autowired HttpSession session;

	@Autowired FileUploadHelper fileUploadHelper;

	@PostMapping("confirm")
	public String confirm(
		// ↓ 2. バリデートする対象に@Validatedを付与
		@Validated @ModelAttribute("bookAddForm") BookForm bookAddForm,
		// ↓ 3. バリデート結果を格納するオブジェクトを引数に用意
		BindingResult result
	){
		// 4. バリデート結果の評価
		if(result.hasErrors()) return "book-add/input";
		// ファイルアップロード
		try {
			fileUploadHelper.multipartToFile(bookAddForm.getFile());
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "book-add/confirm";
	}

	@Autowired BookService bookService;

	@PostMapping("execute")
	public String Execute(
			@ModelAttribute("bookAddForm") BookForm bookForm,
			RedirectAttributes attributes
		) {
		attributes.addFlashAttribute("bookForm",bookForm);
		// ModelMapperを使ってFormからEntityに変換
		ModelMapper modelMapper = new ModelMapper();
		Book book = modelMapper.map(bookForm, Book.class);
		System.out.println("book:" + book);
		// Serviceを読んでDBに登録
		bookService.addBook(book);
		return "redirect:complete"; // <- リダイレクト（PRG）
	}
	@GetMapping("complete")
	public String complete(SessionStatus status, BookForm bookForm, Model model) {
		status.setComplete(); // <- セッションを破棄
		// session.removeAttribute("sessForm");
		// session.invalidate();
		model.addAttribute("bookForm",bookForm);
		return "book-add/complete";
	}
}
