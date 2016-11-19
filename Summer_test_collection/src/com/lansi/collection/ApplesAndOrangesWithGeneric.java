package com.lansi.collection;

import java.util.ArrayList;

public class ApplesAndOrangesWithGeneric {
	public static void main(String[] args) {
		//创建一个ArrayList容器对象用来保存Apple对象,使用<Apple>泛型
		ArrayList<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
		}
		for(int i=0;i<apples.size();i++){
			System.out.println(apples.get(i).id());
		}
		for (Apple apple : apples) {
			System.out.println(apple.id());
		}
	}
}
