package Example;

import java.util.Scanner;

public class ex2753 { //윤년

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int year = s.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		} else {
			System.out.print("0");
		}

	}

}
