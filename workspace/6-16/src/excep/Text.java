package excep;


import java.util.Scanner;

public class Text {
	public static void main(String[] args)  {
		Drink d1=new Milk();
		Drink D2=new Coffee();
		Drink d3=new Beer();
		System.out.println("Drink:");
		Scanner scanner=new Scanner(System.in);
		while (scanner.hasNext()){
			try{
			Drink newDrink=Drink.getDrink(scanner.nextInt());
			newDrink.taste();
			}catch(DrinkNotFoundException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
