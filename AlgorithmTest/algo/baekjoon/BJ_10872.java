package algo.baekjoon;
import java.util.Scanner;

public class BJ_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BJ_10872 algo = new BJ_10872();
		System.out.println(algo.factorial(n));
	}
	
	public int factorial(int x) {
		if(x==0) {
			return 1;
		}else {
			return x*factorial(x-1);
		}
	}
}
