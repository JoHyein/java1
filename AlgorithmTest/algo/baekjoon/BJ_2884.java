package algo.baekjoon;
import java.util.*;

public class BJ_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); //½Ã°£
		int M = sc.nextInt(); //ºÐ
		
		if(M<45){
			if(H==0) {
				H=23;
			}else{
				H--;
			}
			M=60+M-45;
		}else {
			M=M-45;
		}
		System.out.println(H + " "+ M);
		
	}
}
