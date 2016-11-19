package mon7day9;

public class foreach {
	public static void printArray(Object []args){
		for(Object obj:args){
			System.out.print(obj+" ");
			System.out.println();
		}
	}
	public static void main(String []args){
		printArray(new Object[]{new Integer(23),new Float(3.14),new Double(2132.321123)});
		printArray(new Object[]{"one","two","three"});
		printArray(new Object[]{new emptyclass(),new emptyclass(),new emptyclass()});
	}
}
