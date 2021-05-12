package Example;

import java.util.Arrays;
import java.util.Scanner;

public class ex1546 {//평균

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] score = new int[n];
		
		int sum = 0;
		for(int i = 0; i < n; i++){
			score[i] = s.nextInt();
			sum += score[i];
		}
		Arrays.sort(score);
		double avg = (double) sum / score[n-1] * 100 / n;
		System.out.print(avg);

	}

}
