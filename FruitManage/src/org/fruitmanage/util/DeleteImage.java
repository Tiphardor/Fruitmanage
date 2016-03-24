package org.fruitmanage.util;

import java.io.File;

public class DeleteImage {
	public static void Delete(String deleteFileFileName,String targetDirectory){
		File target = new File(targetDirectory, deleteFileFileName);
		if (target.exists()) {
			target.delete();
		}
	}
}
