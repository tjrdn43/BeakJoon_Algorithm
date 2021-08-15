package Example;

import java.util.Scanner;

public class ex2292 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int temp = n;
		int a = 1;
		
		while(true){
			if(n == 1){
				System.out.println(1);
				break;
			}else if(temp - 2 < 6 * a){
				System.out.println(a+1);
				break;
			}else{
				temp = temp - 6 * a;
				a++;
			}
		}

	}

}
