package homework;

public enum sex {
	MALE("男"),FEMALE("女");
	private String name;
	private sex(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
