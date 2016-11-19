package test_collection2;


public class MyList {

	
	private Object [] obj = new Object[10];
	private int size;
	
	public int size() {
		return size;
	}

	public boolean add(Object e) {
		
		obj[size++] = e;
		
		return true;
	}
	
	public Object get(int index) {
		return obj[index];
	}

	
	public Object set(int index, Object element) {
		
		
		return null;
	}

	
	public void add(int index, Object element) {
		for(int i= size;i>index;i--){
			obj[i] = obj[i-1];
		}
		obj[index] = element;
		size++;
	}
	
	public boolean isEmpty() {
		
		return size==0;
	}

	public boolean contains(Object o) {
		
		
		return indexOf(o)>=0;
	}

	

	
	public Object[] toArray() {
		Object [] array = new Object[size];
		System.arraycopy(obj,0,array, 0,size);
		return array;
	}

	
	

	
	public boolean remove(Object o) {
		
		int index = -1;
		for(int i=0;i<size;i++){
			if(o.equals(obj[i])){
				index = i;
				break;
			}
		}
		for(int i = index;i<size;i++){
			obj[i] = obj[i+1];
		}
		
		
		
		return false;
	}

	public void clear() {
		for(int i=0;i<size;i++){
			obj[i] = null;
		}
		size = 0;
	}

	

	
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int indexOf(Object o) {
		for(int i=0;i<size;i++){
			if(obj[i].equals(o)){
				return i;
			}
		}
		return -1;
	}

	
	public int lastIndexOf(Object o) {
		for(int i=size-1;i>=0;i--){
			if(obj[i].equals(o)){
				return i;
			}
		}
		
		return -1;
	}

	
}
