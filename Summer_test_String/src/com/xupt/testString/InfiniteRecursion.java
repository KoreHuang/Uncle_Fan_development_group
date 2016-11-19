package com.xupt.testString;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	@Override
	public String toString() {
		// 此处如果才用return "InfiniteRecursion adress:"+this;方法，会出现无限递归的情况，应该避免;
		return "InfiniteRecursion adress:"+super.toString()+"\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
			System.out.println(v);
		}
	}
	
}
