package text_collection;

public class User2 implements Comparable {
	private int id;
	private String name;
	public User2(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof User2) {
			User2 user2=(User2)o;
			if(user2.id!=this.id){
				return user2.id-this.id;
			}else {
				if (user2.name.equals(this.name)) {
					return 0;
				}
			}
			//return 1;
		}
		return 1;
	}
}
