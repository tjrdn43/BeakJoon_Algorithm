package Example;

import java.util.Scanner;

public class ex2742 {

	public static void main(String[] args) {//기찍 N
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i=0; i<n; i++){
			System.out.printf("%d\n",n-i);
		}

	}

}
