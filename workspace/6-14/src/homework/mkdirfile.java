package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class mkdirfile {	
	//创建文件夹到指定路径
	public static void m_mkdirs(File fp,String absPath,String currentPath){
		fp=new File(absPath+currentPath);
		fp.mkdir();
	}
	//创建文件到指定路径
	public static void m_mkfile(File fp,String absPath,String fileName) {
		fp=new File(absPath+"/"+fileName);
		try{
		fp.createNewFile();
		}catch(Exception e){
			System.out.println("Creat file fail!...");
		}
	}
	//复制文件夹
	public static void copyFile(File oldFile,String path) {
		try{
			File newFile=new File(path+oldFile.getName());
		if(oldFile.isFile()){
			FileInputStream fiStream=new FileInputStream(oldFile);
			FileOutputStream fileOutputStream=new FileOutputStream(newFile);
			int t=0;
			while((t=fiStream.read())!=-1){
				fileOutputStream.write(t);
			}
			
			return;
		}
		newFile.mkdirs();
		File [] files=oldFile.listFiles();
		for(File file:files){
			copyFile(file, path+oldFile.getName()+"/");
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//读取文件夹中的所有文件
	public static void readFileName(File fp){
		System.out.println(fp.getName());
		
		File []files=fp.listFiles();
		if (files==null) {
			//System.out.println("-----------------------------------");
			return;
		}
		if(fp.isDirectory()){
			System.out.println("Current path is a dir :include "+files.length+"items");
			System.out.println("@@@@@@@@File@@@@@@@@@");
		}
		for(int i=0;i<files.length;i++){
			readFileName(files[i]);
		}
		System.out.println("-----------------------------------");
	}
	//主程序入口
	public static void main(String[] args) {
		File file=new File("/Users/mac/Desktop/demo/a");
//		System.out.println(file.getName());//获取文件夹的名称
//		System.out.println(file.exists()); //判断文件是否存在
//		System.out.println(file.getAbsolutePath());//输入文件的绝对路径，值为字符串
//		System.out.println("current path is a dir? :"+file.isDirectory());//判断该路径包含的内容是否为文件目录
//		System.out.println("surrent path is a file? :"+file.isFile());    //判断该路径包含的内容是否为文件
//		String[] s = file.list();			//获取该文件目录的所有目录项，使之构成一个文件目录数组
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
//		System.out.println("-------------------");
//	    String absPath="/Users/mac/Desktop/demo/a";
//		String currentPath="/b";
//		File f1 = new File(absPath+currentPath);
//		f1.mkdirs();						//创建新文件目录
//		//copyFile(file, "/Users/mac/Desktop/");
//		m_mkdirs(file, absPath, currentPath);
//		currentPath="/c";
//		m_mkdirs(file, absPath, currentPath);
//		currentPath="/d";
//		m_mkdirs(file, absPath, currentPath);
//		String fileName="n.txt";
//		m_mkfile(file, absPath+"/b", fileName);
//		fileName="m.txt";
//		m_mkfile(file, absPath+"/c", fileName);
		//readFileName(file);
		copyFile(file, "/Users/mac/Desktop/");
	}
}
