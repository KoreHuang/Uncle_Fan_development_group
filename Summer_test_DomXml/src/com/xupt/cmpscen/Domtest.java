package com.xupt.cmpscen;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Domtest {
	public static void main(String[] args) {
		//创建一个DocumentBuilderFactory对陈象，接受新实例
		DocumentBuilderFactory dbt=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbt.newDocumentBuilder();
			//通过documentbuilder的parse方法产生文档对象
			Document dom=dBuilder.parse("bookstore.xml");
			//获取所有book节点的集合
			NodeList booklist=dom.getElementsByTagName("book");
			System.out.println("共有"+booklist.getLength()+"本书");
			//遍历每个book节点,也可以使用for-each方法遍历
			for(int i=0;i<booklist.getLength();i++){
				System.out.println("===================="+"下面开始遍历第"+(i+1)+"本书的信息====================");
				//使用nodelist的item(i)方法获取i节点
				Node bookNode=booklist.item(i);
				//遍历book节点的所有属性
				NamedNodeMap attris=bookNode.getAttributes();
				System.out.println("第"+(i+1)+"本书共有"+attris.getLength()+"个属性");
				for (int j = 0; j < attris.getLength(); j++) {
					Node attri=attris.item(j);
					System.out.println("第"+(j+1)+"个属性的属性名:"+attri.getNodeName()+"---值为:"+attri.getNodeValue());
				}
				NodeList  bookSublist=bookNode.getChildNodes();
				System.out.println("~~~第"+(i+1)+"本书共有:"+(bookSublist.getLength())+"个节点~~~");
				int nodeCounter=0;
				for (int j = 0; j < bookSublist.getLength(); j++) {
					if(bookSublist.item(j).getNodeType()==Node.ELEMENT_NODE){
						System.out.print("--------第"+(++nodeCounter)+"个节点是:"+bookSublist.item(j).getNodeName());
						System.out.println(":"+bookSublist.item(j).getFirstChild().getNodeValue());
						//也可以设置成bookSublist.item(j).getTextContent();方法获取book子标签中的内容，不过需要注意其子节点中是否还有复杂的子目录
						
					}
					
				}
				
			}
		} 
		catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
