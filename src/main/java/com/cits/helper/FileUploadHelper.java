package com.cits.helper;
/**
 * ファイルアップロードヘルパークラス
 * @author imagepit
 */

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	/**
	 * マルチパートファイルからファイルを保存する
	 * @param file マルチパートファイル
	 * @throws IllegalStateException 例外
	 * @throws IOException I/O例外
	 */
	public void multipartToFile(MultipartFile file) throws IllegalStateException, IOException {
		String filePath = new File("src/main/webapp/img")
				.getAbsolutePath() + "/" + file.getOriginalFilename();
		File convFile = new File(filePath);
		file.transferTo(convFile);
	}
}
