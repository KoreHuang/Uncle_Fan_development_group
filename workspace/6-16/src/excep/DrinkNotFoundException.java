package excep;

public class DrinkNotFoundException extends Exception{
	@Override
	public String getMessage(){
			return "No fount this tasty drink";
	}
}
