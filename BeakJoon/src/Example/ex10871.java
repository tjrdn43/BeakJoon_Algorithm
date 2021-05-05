package Example;

import java.util.Scanner;

public class ex10871 {//X보다 작은 수

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int x = s.nextInt();
		
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++){
			array[i] = s.nextInt();
		}
		for (int i = 0 ; i < array.length; i++){
			if(array[i] < x){
				System.out.print(array[i]+" ");
			}
		}

	}

}
