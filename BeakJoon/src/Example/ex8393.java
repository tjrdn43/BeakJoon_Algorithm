package Example;

import java.util.Scanner;

public class ex8393 {//합

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=n ; i++){
			sum +=i;
		}
		System.out.println(sum);

	}

}
