package algo.baekjoon;
import java.util.Scanner;

public class BJ_10870_Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(fibo(N));
	}
	
	static int fibo(int x) {
		if(x==0) return 0;
		if(x==1) return 1;
		return fibo(x-1)+fibo(x-2);
	}

}
