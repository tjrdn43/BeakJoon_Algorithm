package Example;

import java.util.Scanner;

public class ex2884 { //알람시계
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int m = s.nextInt();

		if (m < 45) {
			m += 15;
			h--;
			if (h < 0) {
				h += 24;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}

	}

}
