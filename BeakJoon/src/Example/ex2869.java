package Example;

import java.util.Scanner;

public class ex2869 { //달팽이는 올라가고 싶다

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int v = s.nextInt();
		
		int day = Snail(a, b, v);
	     System.out.println(day);
	}
	
	public static int Snail(int a, int b, int v) {
	      
		  int day=0;
	      day=(v-b)/(a-b);
	      if((v-b)%(a-b)!=0)
	          day++;

	      return day;

	}

}
