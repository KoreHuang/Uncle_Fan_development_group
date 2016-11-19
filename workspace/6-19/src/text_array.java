import java.util.Random;

import javax.naming.InitialContext;
public class text_array {
	public static void main(String[] args) {
		double a[]=new double[5] ;
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}		
		for(int i=0;i<5;i++){
			a[i]= Math.random();
		}
		System.out.println("*************************");
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
		System.out.println("*************************");
		double [][] b=new double[3][4];
		for(int i = 0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j]=Math.random();
			}
		}
		for(int i = 0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.println(b[i][j]);
			}
		}

		int a1[]={11,44,88,99,77};
		int b1[]={22,66,101,120,111};
		int[] c=new int [a1.length+b1.length];
		for(int i=0;i<a1.length;i++){
			c[i]=a1[i];
		}
		for(int j=0;j<b1.length;j++){
			c[a1.length+j]=b1[j];
		}
		System.out.println("*************************");
		for(int i=c.length-1;i>0;i--){
			System.out.println(c[i]);
		}
		System.out.println("*************************");
		
		int key[]=new int [5];
		getRandom(key,5,c.length);
		for(int i=0;i<5;i++){
			System.out.println(key[i]);
		}
		System.out.println("*************************");
		for (int i = 0; i < 5; i++) {
			System.out.println(c[key[i]]);
		}
	}
	public static void getRandom(int a[],int num,int range){
		Random on=new Random();
		int t=on.nextInt(range);
		a[0]=t;
		int i=1,j;
		while(i<num){
			t=on.nextInt(range);
			for(j=0 ;j<i;j++){
				if(a[j]==t) break;
			}
			if(j==i){
				a[i++]=t;
			}
		}

	}
}
