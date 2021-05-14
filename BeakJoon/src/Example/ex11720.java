package Example;

import java.util.Scanner;

public class ex11720 {//숫자의 합

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		String str = s.next();
		
		int sum = 0;
		for (int i = 0; i < n; i++){
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);

	}

}
