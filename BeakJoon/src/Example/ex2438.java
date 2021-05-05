package Example;

import java.util.Scanner;

public class ex2438 {//별 찍기 - 1

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
