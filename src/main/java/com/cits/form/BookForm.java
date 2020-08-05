package com.cits.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookForm implements Serializable{
	private String title;
	private String author;
}
