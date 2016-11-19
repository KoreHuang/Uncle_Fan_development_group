package com.imooc.handler;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.imooc.entity.Book;



public class SAXhandler extends DefaultHandler {
	private int bookIndex;
	private String labelText = null;
	private Book book;
	private  ArrayList<Book> bookList=new ArrayList<Book>();
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	@Override//用来遍历xml文件的开始标签
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		//开始遍历book标签
		if(qName.equals("book")){
			book=new Book();
			System.out.println("================开始遍历"+(++bookIndex)+"本书的内容================");
			/* 
			 * 已知book标签下存在名为id的属性，获取id值的方法
			 * String idValString=attributes.getValue("id");
			 * System.out.println("属性名:id"+"--属性值:"+idValString);
			 */
			//不知道book标签下存在几个属性,则按照一下方式遍历
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("属性名:"+attributes.getQName(i)+"--属性值:"+attributes.getValue(i));
				if(attributes.getQName(i).equals("id")){
					book.setId(attributes.getValue(i));
				}
			}
		}else if(!qName.equals("book")&&!qName.equals("bookstore")){
			System.out.print("---"+qName+":");
		}
	}
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		labelText =new String(ch,start,length);
		if (!labelText .trim().equals(""))
			System.out.println(labelText );
	}
	@Override	//用来标识解析开始
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX解析开始!");
	}
	
	@Override //用来遍历xml文件的结束标签
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(qName.equals("book")){
			//在一本书的结束遍历位置，将其加入到容器中
			bookList.add(book);
			book=null;
			System.out.println("================结束遍历"+bookIndex+"本书的内容================");
		}
		else if (qName.equals("name")) {
			book.setName(labelText);
		}
		else if (qName.equals("price")) {
			book.setPrice(labelText);
		}else if (qName.equals("language")) {
			book.setLangua(labelText);
		}else if(qName.equals("author")) {
			book.setAuthor(labelText);
		}else if(qName.equals("year")){
			book.setYear(labelText);
		}
	}
	
	@Override 	//用来标识解析结束
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX解析结束!");
	}
	
}
