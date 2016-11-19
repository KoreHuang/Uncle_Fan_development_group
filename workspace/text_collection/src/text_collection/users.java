package text_collection;

public class users {
	private int id;
	private String name;
	public users(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public  int  getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof users){
			users u=(users)obj;
			if(u.name.equals(this.name)) return true;
		}
		return false;
	}
}
