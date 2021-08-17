package Example;

import java.util.Scanner;

public class ex10250 { //ACM 호텔

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int Test = s.nextInt();
		int hArray[] = new int[Test]; //높이
		int wArray[] = new int[Test]; //폭
		int nArray[] = new int[Test]; //n번째 손님
		int result[] = new int[Test];
		for(int i = 0; i < Test; i++){
			hArray[i] = s.nextInt();
			wArray[i] = s.nextInt();
			nArray[i] = s.nextInt();
		}
		int floorArray[] = new int[Test];
		int roomNumArray[] = new int[Test];
		for(int i = 0; i < Test; i++){
			floorArray[i] = nArray[i] % hArray[i];
			roomNumArray[i] = nArray[i]/hArray[i];
			if(floorArray[i] == 0){
				result[i] = hArray[i]*100 + roomNumArray[i];
			}else{
				result[i] = floorArray[i]*100 + roomNumArray[i] + 1;
			}
			
			System.out.println(result[i]);
		}

	}

}
