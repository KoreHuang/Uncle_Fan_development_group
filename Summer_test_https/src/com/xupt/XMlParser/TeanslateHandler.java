package com.xupt.XMlParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TeanslateHandler extends DefaultHandler {
	private String labelText=null;
	
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("开始解析translatedFile....");
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("结束解析translatedFile....");
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		super.endElement(uri, localName, qName);
		if(qName.equals("query")){
			System.out.println("原文本:"+labelText);
		}if(qName.equals("paragraph")){
			System.out.println("翻译之后的文本是:"+labelText);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		super.characters(ch, start, length);
		labelText=new String(ch,start,length);
	}
}
