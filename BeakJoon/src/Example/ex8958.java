package Example;

import java.util.Scanner;

public class ex8958 {//OX퀴즈

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		String[] result = new String[c];
		for (int i = 0; i < c; i++){
			int count = 0;
			int sum = 0;
			result[i] = s.next();
			for(int j = 0; j < result[i].length(); j++){
				if(result[i].charAt(j) == 'O'){ //문자열내의 해당위치(j번째) 문자를 반환하는 메소드
					sum += ++count;
				}else if(result[i].charAt(j) == 'X'){
					count = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
