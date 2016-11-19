package com.imooc.saxtest;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.imooc.entity.Book;
import com.imooc.handler.SAXhandler;

public class SAXtest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建SAX程序分析器工厂对象SAXParserFactory
		SAXParserFactory spf=SAXParserFactory.newInstance();
		try {
			//创建xml文档解析器对象,用来解析XML文档对象
			SAXParser sp=spf.newSAXParser();
			//(SAXPArser).parse()解析开始需要XML文档的路径uri,和一个重写的DefaultHandler对象进行解析
			SAXhandler sh=new SAXhandler();
			sp.parse("bookstore.xml", sh);
			System.out.println("~!~!~!~!~1~:共有"+sh.getBookList().size()+"本书");
			for(Book book : sh.getBookList()){
				System.out.println(book.getId());
				System.out.println(book.getName());
				System.out.println(book.getAuthor());
				System.out.println(book.getYear());
				System.out.println(book.getPrice());
				System.out.println(book.getLangua());
				System.out.println("--------finish-------");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
