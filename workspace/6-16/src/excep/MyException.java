package excep;

public class MyException extends Exception {
	@Override
	public String getMessage(){
		return "this is my exception";
	}
}
