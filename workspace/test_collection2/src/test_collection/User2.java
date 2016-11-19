package test_collection;
public class User2 implements Comparable{
	
	private int id;
	private String name;
	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof User2){
			User2 u2 = (User2) o;
			if(u2.id != this.id){
				return u2.id - this.id;
			}else{
				if(u2.name.equals(this.name)){
					return 0;
				}
			}
		}
		return 1;
	}
	
	
	
	
}
