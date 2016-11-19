package com.xupt.XMlParser;


import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MySAXPaser {
	String outPutUrl;
	public MySAXPaser(String url){
		outPutUrl=url;
	}
	public static void parse(String name){
		SAXParserFactory spf=SAXParserFactory.newInstance();
		try {
			
			SAXParser sp=spf.newSAXParser();
			TeanslateHandler transHandler=new TeanslateHandler();
			sp.parse("tanslatedFile.xml", transHandler);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		parse("");
	}
}
