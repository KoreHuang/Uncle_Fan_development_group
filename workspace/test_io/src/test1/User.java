package test1;

import java.io.Serializable;

public class User implements Serializable{
	
	private transient int id;
	private String name;
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
