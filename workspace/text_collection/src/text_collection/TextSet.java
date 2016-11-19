package text_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TextSet {
	public static void main(String[] args) {
		Set set=new HashSet();	//创建一个hash集合
		Set set2=new HashSet();
		
		set.add("a");			//将字符a加入集合中
		set.add(false);			//将false加入集合中
		set.add(1);	
		set.add(3.14);
		set2.addAll(set);
		System.out.println(set.size());		//打印集合的大小
		//set.toArray();
		for (Object object : set) {
			System.out.println(object);
		}									//foreach循环遍历集合
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}									//迭代器遍历集合
		System.out.println(set.contains(3.14));
		System.out.println(set.isEmpty());
		set.clear();							//清空集合
		System.out.println(set.isEmpty()+"\r\n"+set.size()+"\n____-------______");
		for (Object object : set2) {
			System.out.println(object);
		}			
		Iterator iterator2=set2.iterator();
		while (iterator2.hasNext()) {
			iterator2.next();
			iterator2.remove();
		}				//迭代器清空集合
		System.out.println(set2.contains(3.14));   //contains检查集合中是否包含形参对象
		System.out.println(set2.isEmpty());						
		System.out.println(set2.isEmpty()+"\r\n"+set.size());
	}
}
