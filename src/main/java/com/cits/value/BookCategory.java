package com.cits.value;

import java.io.Serializable;

import lombok.Data;

/**
 * 書籍カテゴリのエンティティ
 * @author imagepit
 */
@Data
public class BookCategory implements Serializable{
	private Integer id;
	private String name;
}
