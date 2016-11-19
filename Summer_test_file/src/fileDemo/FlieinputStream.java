package fileDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlieinputStream {
	//使用FileInputStream对象的read()读取一个字节的数据到一个整型变量的第八位,-1是EOF
	public static void ReadByteByInte(String fileName)throws IOException{
		FileInputStream in=new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=in.read())!=-1){
			if(b<=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b&0xff)+" ");
			if(i++%8==0)System.out.println();
		}
		in.close();
	}
	//使用FileInputStream对象的read(byte[] buf)方法读取数据到缓冲数组buf
	public static void ReadByteByBytes(String fileName)throws IOException{
		FileInputStream flieinputStream=new FileInputStream(fileName);
		byte[] buf=new byte[1024];
		int length=0;
		int sub=1;
		while((length=flieinputStream.read(buf,0,buf.length))!=-1){
			for(int i=0;i<length;i++){
				if(buf[i]>=0&&buf[i]<=0xf){
					System.out.print("0");
				}
				System.out.print(Integer.toHexString(buf[i]&0xff)+" ");
				if(sub++%8==0)System.out.println();
			}
		}
		flieinputStream.close();
	}
	public static void copyFile(File srcFile,File destFile)throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件:"+srcFile+"不存在");
		}
		
		FileInputStream getIn=new FileInputStream(srcFile);
		byte[] readBuf=new byte[20*1024];
		FileOutputStream putOut=new FileOutputStream(destFile,true);
		int subLength=0;
		while((subLength=getIn.read(readBuf,0,readBuf.length))!=-1){
			putOut.write(readBuf, 0, subLength);
		}
		getIn.close();
		putOut.close();
	}
	public static void copyFilebyBuffer(File srcFile,File destFile)throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件:"+srcFile+"不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException("文件:"+srcFile+"不是一个文件");
		}
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
		int tmp;
		while((tmp=bis.read())!=-1){
			bos.write(tmp);
			bos.flush();
		}
		bis.close();
		bos.close();
	}
	public static void copyFilebyBytes(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件:"+srcFile+"不存在!");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException("文件:"+srcFile+"不是一个文件!");
		}
		FileInputStream fis=new FileInputStream(srcFile);
		FileOutputStream fos=new FileOutputStream(destFile);
		byte[] buf=new byte[8*1024];
		int subLength=0;
		while((subLength=fis.read(buf, 0, buf.length))!=-1){
			fos.write(buf, 0, subLength);
			fos.flush();
		}
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws IOException {
//		try {
//			String fileName="/Users/mac/Music/网易云音乐/周深 - 大鱼.mp3";
//			long start=System.currentTimeMillis();
//			FlieinputStream.ReadByteByInte(fileName);
//			long end=System.currentTimeMillis();
//			System.out.println();
//			System.out.println(end-start);
//			start=System.currentTimeMillis();
//			FlieinputStream.ReadByteByBytes(fileName);
//			end=System.currentTimeMillis();
//			System.out.println();
//			System.out.println(end-start);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String srcFileName="/Users/mac/Music/网易云音乐/周深 - 大鱼.mp3";
		String destFileName="/Users/mac/Desktop/周深 - 大鱼.mp3";
		File src=new File(srcFileName);
		File dest=new File(destFileName);
		long start=System.currentTimeMillis();
		FlieinputStream.copyFilebyBuffer(src, dest);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
}
