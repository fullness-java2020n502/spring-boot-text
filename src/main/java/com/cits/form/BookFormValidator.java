package com.cits.form;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 書籍登録機能のフォームバリデータクラス
 * @author imagepit
 */
@Component
public class BookFormValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return BookForm.class.isAssignableFrom(clazz);
	}
	@Override
	public void validate(Object target, Errors errors) {
		BookForm form = (BookForm)target;
		if(form.getTitle().length() < 4
				&& form.getAuthor().length() < 4
		) {
			// errors.reject("bookAddForm.titleAndAuthorError");
			// フィールドのエラーとして表示したい
			errors.rejectValue("title", "bookAddForm.titleAndAuthorError");
			errors.rejectValue("author", "bookAddForm.titleAndAuthorError");
		}
	}

}
