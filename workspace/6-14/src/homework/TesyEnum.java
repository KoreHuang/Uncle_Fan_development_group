package homework;

import java.util.Scanner;

public class TesyEnum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		while (scanner.hasNext()) {
//			String s=scanner.next();
//			try{
//				sex s1=sex.valueOf(s);
//				System.out.println("输入的性别是:"+s1.getName());
//			}catch(Exception e){
//				System.out.println("输入有误，请重新输入......");
//			}
//		}
		String s=scanner.next();
		try{
		sex s1=sex.valueOf(s);
		switch (s1) {
		case MALE:
			System.out.println("男");
			break;
			case FEMALE:
				System.out.println("女");
				break;
		default:
			break;
		}
		}catch(Exception e){
			System.out.println("输入有误...");
		}
	}
}
