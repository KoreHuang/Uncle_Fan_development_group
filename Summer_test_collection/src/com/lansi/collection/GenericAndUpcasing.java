package com.lansi.collection;

import java.util.ArrayList;

public class GenericAndUpcasing {
	public static void main(String[] args) {
		ArrayList<Apple> apples =new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple apple : apples) {
			System.out.println(apple);
		}
	}
}
