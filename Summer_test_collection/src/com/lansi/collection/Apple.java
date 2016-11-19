package com.lansi.collection;

public class Apple {
	private static long counter;
	private final long id=counter++;
	public long id(){return id;}
}
