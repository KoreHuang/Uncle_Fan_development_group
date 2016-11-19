package test_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	
	
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("a");
		set.add(false);
		set.add(1);
		set.add(3.14);
		
		System.out.println(set.size());
		Object[] obj = set.toArray();
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println("-----------------");
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------");
		
		for (Object at : set) {
			System.out.println(at);
		}
		System.out.println("-----------------------");
		
		System.out.println(set.contains(3.14));
		System.out.println(set.isEmpty());
		System.out.println("-----------------------");
		//set.clear();
		System.out.println(set.size());
		set.remove(3.14);
		System.out.println(set.size());
		Iterator it1 = set.iterator();
		while(it1.hasNext()){
			it1.next();
			it1.remove();
		}
	}
	
	
}
