package text_collection;

import java.util.Set;
import java.util.TreeSet;

public class TextTreeSet {
	public static void main(String[] args) {
		Set<User2> set=new TreeSet<User2>();
		User2 u1=new User2(1001, "a");
		User2 user2=new User2(1002, "b");
		set.add(u1);
		set.add(user2);
		System.out.println(set.size());
		User2 u3=new User2(1001, "a");
		set.add(u3);
		System.out.println(set.size());
	}
}
