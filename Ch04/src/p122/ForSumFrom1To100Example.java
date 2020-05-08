package p122;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1-100 합 : "+sum);
	}

}
