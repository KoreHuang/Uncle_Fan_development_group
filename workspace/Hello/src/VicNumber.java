public class VicNumber{
	/*******************字段声明区*******************/
		int count;
	/**********************************************/
	
	/***************方法实现区***********************/
	public VicNumber() {
		// TODO Auto-generated constructor stub
		count=0;
	}
	public void showVicNum(){
		for(int i=1000;i<10000;i++){
			if(isVicNum(i)){
				count++;
				System.out.println(i);
			}
		} 
	}
	boolean isVicNum(int num){
		int [] subNum=new int[4];
		subNum[0]=num/1000;
		subNum[1]=num/100%10;
		subNum[2]=num%100/10;
		subNum[3]=num%10;
		int highT,lowT;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(i!=k&&i!=j&&j!=k){
						highT=subNum[i]*10+subNum[j];
						lowT=subNum[k]*10+subNum[6-i-j-k];
						if(highT*lowT==num)return true;
					}
				}
			}
		}
		return false;
	}
	public void show(){
		System.out.println(count);
	}
	/****************定义主方法********************/
	public static void main(String []arg){
		VicNumber obj=new VicNumber();
		obj.show();
		obj.showVicNum();
		obj.show();
	}
}
