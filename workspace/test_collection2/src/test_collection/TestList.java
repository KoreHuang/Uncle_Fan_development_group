package test_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestList {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add(3.14);
		list.add(12);
		list.add(2);
		System.out.println(list.size());
		list.add(3, 23);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-------------------");
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------");
		Object o1 = list.remove(2);
		System.out.println(o1);
		System.out.println(list.remove(3.14));
		System.out.println(list.indexOf(2));
		System.out.println(list.lastIndexOf("a"));
		System.out.println("--------------------");
		String s = "abc";
		List<String> list2 = new ArrayList<String>();
		list2.add("d");
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("e");
		for (String s1 : list2) {
			System.out.println(s1.toUpperCase());
		}
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}
	
	
}
