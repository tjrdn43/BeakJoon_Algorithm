package Example;

import java.util.Scanner;

public class ex10870 {//피보나치 수 5

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(fibo(a));

	}
	static int fibo(int a){
		if (a == 0){
			return 0;
		}else if(a == 1){
			return 1;
		}else{
			return fibo(a-2)+fibo(a-1);
		}
	}

}
