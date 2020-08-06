package com.cits.form;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BookForm implements Serializable{
	// 1. バリデーション（単項目）をするためにはフィールドの上にバリデーションのアノテーションを付与
	@Size(max = 10)// 文字数を10桁
	@NotBlank // nullや空白は許可しない
	private String title;
	@Size(max = 8)
	@NotBlank
	private String author;
}
