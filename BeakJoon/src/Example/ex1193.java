package Example;

import java.util.Scanner;

public class ex1193 { //분수찾기

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int temp = n;
		int a = 2;
		int numerator , denominator; //분자 , 분모
		while(true){
			if(n == 1){
				System.out.println("1/1");
				break;
			}else if(temp - 2 < a){
				if(a % 2 == 0){
					numerator = n - a*(a-1)/2;
					denominator = a+1-numerator;
					System.out.println(numerator + "/" + denominator);
					break;
				}else{
					denominator = n - a*(a-1)/2;
					numerator = a+1-denominator;
					System.out.println(numerator + "/" + denominator);
					break;
				}
			}else{
				temp -= a;
				a++;
			}
		}


	}

}
