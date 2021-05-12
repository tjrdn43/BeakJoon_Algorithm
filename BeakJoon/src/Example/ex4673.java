package Example;

public class ex4673 {//셀프 넘버

	public static void main(String[] args) {
		int array[] = new int [10001];
		
		for(int i = 1; i < array.length; i++){
			int dn = NotSelfNum(i);
			if(dn <= 10000){
				array[dn] = 1;
			}
		}
		
		for(int i = 1; i < array.length; i++){
			if(array[i] != 1){
				System.out.println(i);
			}
		}
	}
	
	public static int NotSelfNum(int n){
		int dn = n;
		while(n > 0){
			dn += n % 10;
			n /= 10;
		}
		return dn;
	}

}