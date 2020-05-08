package p125;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class WhilePrintFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100){
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 :" +sum);
	}

}
