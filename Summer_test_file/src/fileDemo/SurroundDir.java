package fileDemo;

import java.io.File;

public class SurroundDir {
	public static void orderDir(File dir){
		if (dir.isFile()) {
			System.out.println(dir.getAbsolutePath());
		}
		if (dir.isDirectory()&&dir.length()>0) {
			File []listDirs=dir.listFiles();
			for (File file : listDirs) {
				orderDir(file);
			}
		}
		
	}
}
