package com.cits.form;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class BookForm implements Serializable{
	@Size(max = 30)
	@NotBlank
	private String title;
	@Size(max = 20)
	@NotBlank
	private String author;
	public boolean isEmpty() {
		return (title == null || author == null) ? true : false;
	}
}
