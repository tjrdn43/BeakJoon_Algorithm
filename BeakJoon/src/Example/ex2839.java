package Example;

import java.util.Scanner;

public class ex2839 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a, b, c, d;
		a = n / 5;
		b = n % 5;
		c = b / 3;
		d = b % 3;
		
		while(true){
			if(b == 0){
				System.out.println(a);
				break;
			}else if(b != 0){
				if(d == 0){
					System.out.println(a + c);
					break;
				}else if(d != 0 && a >= 1){
					a--;
					b += 5;
					if(b % 3 == 0){
						System.out.println(a + b / 3);
						break;
					}else if(a < 0 && b % 3 != 0){
						System.out.println(-1);
						break;
					}
				}else{
					System.out.println(-1);
					break;
				}
			}
		}

	}

}
