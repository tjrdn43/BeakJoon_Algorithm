package Example;

import java.util.Scanner;

public class ex2675 {//문자열 반복

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
               int R = s.nextInt();
			String str = s.next();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
