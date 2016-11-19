package excep;



public class TextException {
	public static void main(String[] args) {
		try{
			m2();
		}catch(MyException e){
			System.out.println("this is class...");
			System.out.println(e.getMessage());
		}
	}
	public static void m()throws ClassNotFoundException{
		Class.forName("@@@@@@@");
	}
	public static void m2()throws MyException{
		if(true){
			throw new MyException();
		}
	}
	public static void m1()throws MyException{
		m2();
	}
}
