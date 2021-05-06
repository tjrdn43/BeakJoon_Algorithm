package Example;

import java.util.Scanner;

public class ex1110 {//더하기 사이클

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a = n;
		int count=0;
		
		do{
			a = (a % 10)*10 + (a / 10 + a % 10) % 10;
			count++;
		}while(a != n);
		System.out.print(count);

	}

}
