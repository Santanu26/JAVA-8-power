package com.shantanu.teaser;

import java.io.File;
import java.io.FileFilter;

public class File1 {
	File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
		public boolean accept(File file) {
			return file.isHidden();
		}
	});
	
	/*which is same as */
	
	File[] hiddenFiles1 = new File(".").listFiles(File :: isHidden);
}
