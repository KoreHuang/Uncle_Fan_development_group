package excep;



public abstract class Drink {
	public abstract void taste();
	public static Drink getDrink(int drinkType) throws DrinkNotFoundException {
			switch(drinkType){
				case 1:return new Milk(); 
				case 2:return new Coffee();
				case 3:return new Beer();
				default :throw new DrinkNotFoundException();
				
			}
		}
}
