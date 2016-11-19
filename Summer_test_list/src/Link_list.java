public class Link_list <Item> {
	class node{
		Item data;
		node next;
	}
	private node head;
	private int size=0;
	private boolean tag=true;
	public node getHead(){
		return head;
	}
	public void insertNode(Item Elem){
		node temp=new node();
		temp.data=Elem;
		temp.next=head.next;
		head.next=temp;
		size++;
	}
	
	public void creatListPre(Item []data){
		if (tag) {
			head=new node();
			head.data=data[0];
			head.next=null;
			size++;
			for(int i=1;i<data.length;i++){
				insertNode(data[i]);
			}
			tag=false;
		}
	
	}
	public void creatListTail(Item []data){
		if(tag){
			head=new node();
			head.data=data[0];
			head.next=null;
			node tail=head;
			for(int i=1;i<data.length;i++){
				tail=tail.next=new node();
				tail.data=data[i];
				tail.next=null;
				size++;
			}
			tag=false;
		}
	}
	public  void  visitNode(node w) {
		System.out.println(w.data);
	}
}
