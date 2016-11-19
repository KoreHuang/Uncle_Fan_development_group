package fileDemo;

import java.io.File;

public class test_main {
	public static void main(String[] args) {
		File file=new File("/Users/mac/Desktop/test");
		SurroundDir.orderDir(file);
	}
}
