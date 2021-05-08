package Example;

import java.util.Scanner;

public class ex2577 {//숫자의 개수

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int result = a * b * c;  //3개 입력 숫자들의 곱
		
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < array.length; i++){
			int count = 0;
			int temp = result;  //임시 계산용
			
			while(temp > 0){
				if(temp % 10 == array[i]){
					count++;
				}
				temp = temp / 10;  //자리수 올림
			}
			System.out.println(count);
		}

	}

}
