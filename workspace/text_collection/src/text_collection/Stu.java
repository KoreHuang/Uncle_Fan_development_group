package text_collection;

import java.io.Serializable;

public class Stu  implements Serializable {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private  int id;
		private  String name;
		private  String sex;
		public Stu(int id,String name,String sex) {
			// TODO Auto-generated constructor stub
			this.id=id;
			this.name=name;
			this.sex=sex;
		}
		public void showInfo() {
			System.out.println("Id:"+id+" Name:"+name+" Sex:"+sex);
		}
	
}
