package Example;

import java.util.Scanner;

public class ex3052 {//나머지

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0; i < 10; i++){
			array[i] = s.nextInt()%42; //10개를 입력받고 42로 나눈값을 배열에 넣는다.
			
		}
		int count = 0;
		for(int i = 0; i < 10; i++){
			int hi = 0;
			for(int j = i+1; j < 10; j++){ //초기 비교는 i = 0, j = 1일 때이다.
				if(array[i] == array[j]){  //자신이 뒷 번호 숫자와 같은지 비교
					hi++;
				}
			}
			if(hi == 0){  //같은 값이 없을때 카운트해준다.
				count++;
			}
		}
		System.out.println(count);

	}

}
