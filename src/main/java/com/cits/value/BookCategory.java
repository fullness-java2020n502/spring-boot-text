package com.cits.value;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 書籍カテゴリのエンティティ
 * @author imagepit
 */
@Data
@AllArgsConstructor
public class BookCategory implements Serializable{
	private Integer id;
	private String name;
}
