package com.thinkinginjava.collection;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
	public static void main(String[] args) {
		//创建10个包装整型对象添加到容器collection中，并逐个访问
		Collection<Integer> collection=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			collection.add(i);
		}
		for(Integer i : collection){
			System.out.println(i);
		}
	}
}
