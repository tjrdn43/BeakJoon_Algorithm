package Example;

import java.util.Scanner;

public class ex11021 {// A + B - 7

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] aa = new int[n];
		int[] bb = new int[n];
		for(int i = 0; i < n; i++){
			aa[i] = s.nextInt();
			bb[i] = s.nextInt();	
		}
		for(int j = 0; j < n; j++){
			System.out.printf("Case #%d: %d\n",j+1,aa[j]+bb[j]);
		}

	}

}
