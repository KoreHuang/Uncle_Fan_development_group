package test_collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("a","aa");
		map.put("b","bb");
		map.put("c","cc");
		map.put("d","dd");
		
		System.out.println(map.size());
		
		map.put("d", "dddd");
		System.out.println(map.size());
		System.out.println(map.get("d"));
		
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(map.get(s));
		}
		System.out.println("-----------------------");
		Set<Entry<String, Object>> sen = map.entrySet();
		for (Entry<String, Object> entry : sen) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//定义一个User类该类有id,name,sex属性。
		//输入一组用户信息:格式如：1001,小明,男 ，每输入一个用户信息将该信息保存至User对象中,
		//并将该对象保存至一个list当中。将集合数据序列值磁盘文件中。
		//可以对磁盘文件的数据进行修改，删除操作。
		//修改如：1001,小红
		//删除如：1001
		
	}
	
	
}
