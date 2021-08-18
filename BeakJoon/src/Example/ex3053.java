package Example;

import java.util.Scanner;

public class ex3053 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int r = s.nextInt();
		double pi = 3.141593;
		double euclidArea, texiArea;
		
		euclidArea = r*r*pi;
		texiArea = 2*r*r;
		
		System.out.println(euclidArea);
		System.out.println(texiArea);

	}

}
