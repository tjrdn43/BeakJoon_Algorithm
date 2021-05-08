package Example;

import java.util.Scanner;

public class ex2562 {//최댓값

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] array = new int[9];
		int max = 0;
		int index = 0;

		for(int i = 0; i < 9; i++){
			array[i] = s.nextInt();
			if(array[i] > max){
				max = array[i];
				index = i+1;
			}
		}
		s.close();
		System.out.println(max);
		System.out.println(index);
	}

}
