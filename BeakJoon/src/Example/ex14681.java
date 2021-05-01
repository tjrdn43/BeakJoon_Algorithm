package Example;

import java.util.Scanner;

public class ex14681 { //사분면 고르기

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int y = s.nextInt();

		if (x > 0) {
			if (y > 0) {
				System.out.println("1");
			} else if (y < 0) {
				System.out.println("4");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("2");
			} else if (y < 0) {
				System.out.println("3");
			}
		}

	}

}
