package test_collection;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {
	
	public static void main(String[] args) {
		Set<User2> set = new TreeSet<User2>();
		
		User2 u1 = new User2(1001, "小黄");
		User2 u2 = new User2(1002, "小明");
		
		
		set.add(u1);
		set.add(u2);
		System.out.println(set.size());
		
		User2 u3 = new User2(1001,"小花");
		set.add(u3);
		System.out.println(set.size());
		
		User2 u4 = new User2(1002,"小明");
		set.add(u4);
		System.out.println(set.size());
		
	}
	
	
}
