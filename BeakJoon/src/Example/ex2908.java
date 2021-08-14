package Example;

import java.util.Scanner;

public class ex2908 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str1 = s.next();
		String str2 = s.next();

		String temp = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp += str1.charAt(i);
		}
		str1 = temp;

		temp = "";
		for (int i = str2.length() - 1; i >= 0; i--) {
			temp += str2.charAt(i);
		}
		str2 = temp;

		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);

		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}

	}

}
