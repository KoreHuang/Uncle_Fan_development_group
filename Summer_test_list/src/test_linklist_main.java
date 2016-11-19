
public class test_linklist_main {
	public static void main(String[] args) {
		Link_list<Integer> list=new Link_list<Integer>();
		Integer data[]={3,2,5,7,8,5,6,4};
		list.creatListTail(data);
		Link_list<Integer>.node tempNode=list.getHead();
		while(tempNode!=null){
			list.visitNode(tempNode);
			tempNode=tempNode.next;
		}
	}
}
