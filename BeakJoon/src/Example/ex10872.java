package Example;

import java.util.Scanner;

public class ex10872 {//팩토리얼

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(fact(a));

	}
	
	static int fact(int a){
		int n = 1;
		for(int i = 1; i <= a; i++){
			n *= i;
		}
		return n;
	}

}
