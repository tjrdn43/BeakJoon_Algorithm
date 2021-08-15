package Example;

import java.util.Scanner;

public class ex1712 {// 손익분기점

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int fc = s.nextInt(); //고정비용
		int vc = s.nextInt(); //가변비용
		int p = s.nextInt(); //가격
		int q; //수량
		if(vc >= p){
			q = -1;
		}else{
			q = fc / (p - vc) + 1;
		}
		System.out.println(q);

	}

}
