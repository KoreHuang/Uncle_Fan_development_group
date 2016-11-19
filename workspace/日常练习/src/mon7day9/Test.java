package mon7day9;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class Test {
//	public static void main(String args[]){
//		int [] numbers = {10, 20, 30, 40, 50};
//		for(Object x : numbers ){ 
//			System.out.print( x ); System.out.print(",");
//		}
//		System.out.print("\n");
//		String [] names ={"James", "Larry", "Tom", "Lacy"}; for( String name : names ) {
//		System.out.print( name );
//		System.out.print(","); }
//		} 
	public static void main(String []args){
		Date dNow=new Date(2);
		SimpleDateFormat ftDateFormat=new SimpleDateFormat("E yyyy.mm.dd hh:mm:ss a zzz");
		System.out.println("Current time is :"+ftDateFormat.format(dNow));
	}
}

