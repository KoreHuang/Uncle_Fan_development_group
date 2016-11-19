package com.xupt.testYouDaoApi;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;


public class Translator {
	public static void main(String[] args) {
		new TranslateThread().start();
	}
}
class TranslateThread extends Thread{
	@Override
	public void run()  {
		String textString="감사합니다";
		try {
			URL url=new URL("http://fanyi.youdao.com/openapi.do?keyfrom=xup132&key=748031907&type=data&doctype=xml&version=1.1&q="+textString);
			URLConnection uConnection = url.openConnection();
			InputStream is = uConnection.getInputStream();
			InputStreamReader isr =new InputStreamReader(is);
			BufferedReader bReader=new BufferedReader(isr);
			
			String line="";
			StringBuilder sBuilder=new StringBuilder();
			while ((line=bReader.readLine())!=null) {
				
				sBuilder.append(line);
				
			}
			
			bReader.close();
			isr.close();
			is.close();
			FileOutputStream fos = new FileOutputStream("tanslatedFile.xml");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			//System.out.println(sBuilder);
			osw.write(sBuilder.toString());
			osw.flush();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}