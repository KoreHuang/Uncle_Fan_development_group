package mon7day9;

public class flxbArgs {
	public static void printArray(Object ... args){
		for(Object obj:args){
			System.out.print(obj+"");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printArray(new Object[]{new Integer(34),new Double(3.14),new Float(2.111212)});
		printArray(new Object[]{"one","two","three"});
		printArray(new Object[]{new emptyclass(),new emptyclass(),new emptyclass()});
	}
}
