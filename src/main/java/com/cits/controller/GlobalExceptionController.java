package com.cits.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * アプリケーション全体で例外を補足するコントローラー
 * @author imagepit
 */
@ControllerAdvice
public class GlobalExceptionController {
	@ExceptionHandler
	public ModelAndView globalException(Exception e,Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", e.getMessage());
		modelAndView.setViewName("error");
		modelAndView.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		return modelAndView;
	}
}
