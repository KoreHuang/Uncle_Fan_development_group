package night;

public class Bird extends Animal{
	public void sound(){
		System.out.println("Jiu jiu jiu");
	}
	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.sound();
		a1=new Cat();
		a1.sound();
		a1=new Bird();
		a1.sound();
	}
}
