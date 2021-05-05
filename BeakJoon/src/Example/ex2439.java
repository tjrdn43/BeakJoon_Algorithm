package Example;

import java.util.Scanner;

public class ex2439 {//별 찍기 - 2

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < n; j++){
				if(j<n-i){
				System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
