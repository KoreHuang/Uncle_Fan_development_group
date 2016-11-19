package night;

public class Play {
	String name;
	static{
		System.out.println("I'm static...");
	}
	{
		System.out.println("I'm not static"+name);
	}
	public void playSound(Dog dog){
		dog.sound();
	}
	public void playSound(Cat cat){
		cat.sound();
	}
	public void playSound(Bird bird){
		bird.sound();
	}
	public void playSound(Pig pig){
		pig.sound();
	}
	public static void main(String[] args) {
		Play button=new Play();
		button.playSound(new Dog());
		button.playSound(new Bird());
		button.playSound(new Cat());
		button.playSound(new Pig());
	}
}
