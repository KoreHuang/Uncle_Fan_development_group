package com.xupt.map;

import java.util.HashMap;
import java.util.Map;

public class testMap {
	public static void main(String[] args) {
		Map< String,String > map = new HashMap< String , String >();
		map.put("chen", "god");
		map.put("li", " evil");
		map.put("wu","sada");
		System.out.println(map.get("chen"));
	}
}
