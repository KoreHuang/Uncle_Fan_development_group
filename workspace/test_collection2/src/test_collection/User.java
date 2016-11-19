package test_collection;

import java.util.Random;

public class User {
	
	private int id;
	private String name;
	
	public User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj instanceof User){
			User u = (User)obj;
			if(u.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}
	
	
	
	


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
