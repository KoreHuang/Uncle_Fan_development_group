package com.xupt.TestXml;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ConnectHandler extends DefaultHandler {
	private ConnectInfo cif;
	public ConnectInfo getCif() {
		return cif;
	}
	private String infoValue=null;
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("开始解析jdbcXML文件...");
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("结束解析jdbcXML文件...");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if(qName.equals("jdbc")){
			cif = new ConnectInfo();
		}else if (!qName.equals("jdbc")) {
			System.out.print("----"+qName+":");
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(qName.equals("driver")){
			cif.setDriver(infoValue);
		}else if (qName.equals("user")) {
			cif.setUserName(infoValue);
		}else if (qName.equals("pass")) {
			cif.setPassWord(infoValue);
		}else if(qName.equals("url")) {
			cif.setUri(infoValue);
		}else if(qName.equals("characterSet")){
			cif.setCharacterSet(infoValue);
		}else if(qName.equals("characterEncoding")) {
			cif.setCharacterEncoding(infoValue);
		}

	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		infoValue = new String(ch, start, length);
		if(!infoValue.trim().equals("")){
			System.out.println(infoValue);
		}
	}
}
