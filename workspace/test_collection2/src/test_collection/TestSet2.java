package test_collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet2 {
	public static void main(String[] args) {
		Set<User> set = new HashSet<User>();
		User u1 = new User(1001, "小黄");
		User u2 = new User(1002,"小象");
		
		set.add(u1);
		set.add(u2);
		
		System.out.println(set.size());
		User u3 = new User(1001, "小明");
		set.add(u3);
		System.out.println(set.size());
		User u4 = new User(1001, "小黄");
		set.add(u4);
		System.out.println(set.size());
	}
}
