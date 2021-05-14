package Example;

import java.util.Scanner;

public class ex10809 {//알파벳 찾기

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		for(char c = 'a'; c <= 'z'; c++){
			//indexOf 해당 문자가 처음으로 등장하는 위치를 리턴
			//만약 해당 문자가 문자열에 없으면 -1을 리턴한다.
			System.out.print(str.indexOf(c)+" ");
		}

	}

}
