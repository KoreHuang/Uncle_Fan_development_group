package text_string;
import java.io.File;
public class TestFile {
	public static void main(String[] args) {
		File file = new File("/Users/mac/Desktop/demo");
		//File f = new File("/Users/mac/Desktop/demo");
		//获取当前文件对象的名称
		System.out.println(file.getName());
		//判断当前文件对象是否是一个目录
		System.out.println(file.isDirectory());
		//判断当前文件对象是否是一个普通文件
		System.out.println(file.isFile());
		//判断当前文件是否存在
		System.out.println(file.exists());
		//得到当前文件对象下所有子文件的名称
		String[] s = file.list();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("-------------------");
		//得到当前文件对象下所有子文件对象
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
		File f1 = new File("/Users/mac/Desktop/demo/c/b/a");
		//创建当前对象指定的目录
		f1.mkdirs();
		try {
			File f2 = new File("/Users/mac/Desktop/demo/a.txt");
			//创建一个普通文件
			f2.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
