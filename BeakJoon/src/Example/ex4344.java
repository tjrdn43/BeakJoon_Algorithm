package Example;

import java.util.Scanner;

public class ex4344 {//평균은 넘겠지

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		int i = 0;
		double[] percent = new double[c];
		while(i < c){
			int n = s.nextInt();
			int[] array = new int[n];
			int sum = 0;
			int j = 0;
			for (j = 0; j < n; j++){
				array[j] = s.nextInt();
				sum += array[j];
			}
			double avg = (double)sum/array.length;
			int count = 0;
			for (j = 0; j < n; j++){
			    if(array[j] > avg){
				   count++;
			    }
			}
			percent[i] = (double)count / n ;
			i++;
		}
		for (int k = 0; k < c; k++){
			System.out.printf("%.3f%%\n",percent[k]*100);
		}

	}

}
