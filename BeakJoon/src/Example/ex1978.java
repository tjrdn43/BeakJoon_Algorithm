package Example;

import java.util.Scanner;

public class ex1978 {//소수찾기

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = s.nextInt();
		}
		int countPrimeNum = n;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 1){
				countPrimeNum--;
			}else{
				int count = 0;
				for(int j = 1; j < arr[i]; j++){
					if(arr[i] % j == 0){
						++count;
					}
					if(count == 2){
						countPrimeNum--;
						break;
					}
				}
			}
		}
		System.out.println(countPrimeNum);

	}

}
