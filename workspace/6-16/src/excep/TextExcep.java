package excep;


public class TextExcep {
	public static void main(String[] args){
		try{
		System.out.println(2/0);
		System.out.println("Terminal printal instruction!");
		String string=null;
		System.out.println(string.toString());
		}catch(ArithmeticException e){
			System.out.println("Zero cannot to be divisor!");
		}
		catch (NullPointerException e) {
			System.out.println("Cannot covert null!");
		}
		m2(0);
	}
	public static void m2(int t)  {
		try{
			Class.forName("ddddddd.....");
		}
		catch(ClassNotFoundException e){
			System.out.println("No class...");
		}
		try{
			System.out.println(1/t);
		}catch(ArithmeticException e){
			System.out.println("Zero cannot to be divisor..." );
			return;
		}
		finally {
			System.out.println("I'm finally...");
		}
	}
}
 