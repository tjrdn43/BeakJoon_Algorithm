package Example;

import java.util.Arrays;
import java.util.Scanner;

public class ex10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i<array.length; i++){
			array[i] = s.nextInt();
		}
		
		Arrays.sort(array);
		System.out.print(array[0]+" "+array[n-1]);

	}

}
