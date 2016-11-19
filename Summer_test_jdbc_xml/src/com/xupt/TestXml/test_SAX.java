package com.xupt.TestXml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class test_SAX {
	public static void main(String[] args) {
		ConnectInfo cif = null;
		SAXParserFactory spFactory = SAXParserFactory.newInstance();
		try {
			SAXParser nsp = spFactory.newSAXParser();
			ConnectHandler cthConnectHandler=new ConnectHandler();
			nsp.parse("jdbc.xml", cthConnectHandler);
			cif = cthConnectHandler.getCif();
//			System.out.println(cif.getDriver());
//			System.out.println(cif.getUri());
//			System.out.println(cif.getUserName());
//			System.out.println(cif.getPassWord());
//			System.out.println(cif.getCharacterSet());			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Statement stat=null;
		Connection cnn=null;
		ResultSet rSet=null;
		try{
			Class.forName(cif.getDriver().trim());
			cnn=DriverManager.getConnection(cif.getUri()+"?user="+cif.getUserName()+"&password="+cif.getPassWord()+"&"+cif.getCharacterSet()+"&"+cif.getCharacterEncoding());
			stat=cnn.createStatement();
			rSet = stat.executeQuery("select * from course");
			while (rSet.next()) {
				System.out.println(rSet.getString(1)+" "+rSet.getString(2)+" "+rSet.getString(3));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				rSet.close();
			} catch (Exception e2) {
			}
			try {
				stat.close();
			} catch (Exception e2) {
			}
			try {
				cnn.close();
			} catch (Exception e2) {
			}
		}
	}
}
