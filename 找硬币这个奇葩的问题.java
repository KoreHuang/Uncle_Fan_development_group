package mon7day9;

import java.util.Scanner;
//最少找钱币问题
//minCost=min{cost[i-autom[0...n]]+1}
public class ReturnMoney {
	private static Scanner scanner;
	public static void main(String[] args) {
		int[] coinAutomValue={1,3,5,10,20,50};
		scanner = new Scanner(System.in);
		int requestMonValue=scanner.nextInt();
		solve(requestMonValue, coinAutomValue);
	}
	private static void solve(int v,int []autom){
		int tmp[]=new int[v+1];
		int minCoin;
		for(int i=1;i<tmp.length;i++){
			tmp[i]=minCoin=i;//每个面值的币种都可以以i个一元组成
			for (int j = 0; j < autom.length; j++) {
				if(autom[j]<=i){
					minCoin=minCoin>(tmp[i-autom[j]]+1)?	(tmp[i-autom[j]]+1):minCoin;
				}
			}
			tmp[i]=minCoin;
		}
		for (int i : tmp) {
			System.out.println(i);
		}
	}
}
