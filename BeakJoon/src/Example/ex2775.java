package Example;

import java.util.Scanner;

public class ex2775 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int Test = s.nextInt();
		
		for(int i = 0; i < Test; i++){
			int k = s.nextInt();
			int n = s.nextInt();
			System.out.println(house(k,n));
		}
		s.close();

	}
	private static int house(int k, int n){
		if(n == 0){
			return 0;
		}else if(k == 0){
			return n;
		}else{
			return house(k, n - 1) + house(k - 1, n);
		}
	}


}
