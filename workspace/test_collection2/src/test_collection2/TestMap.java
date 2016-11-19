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
		//����һ��User�������id,name,sex���ԡ�
		//����һ���û���Ϣ:��ʽ�磺1001,С��,�� ��ÿ����һ���û���Ϣ������Ϣ������User������,
		//�����ö��󱣴���һ��list���С���������������ֵ�����ļ��С�
		//���ԶԴ����ļ������ݽ����޸ģ�ɾ��������
		//�޸��磺1001,С��
		//ɾ���磺1001
		
	}
	
	
}
