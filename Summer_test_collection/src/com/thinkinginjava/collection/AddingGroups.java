package com.thinkinginjava.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		Integer moreInts[]={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		List list=Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
		//使用Arrays.list方法产生的list对象大小固定，不能改变
		//使用list.add()方法添加对象或着使用list.delete()方法删除对象会在运行时产生一个异常
	}
}
