package 수행평가;
/*
 * 날짜 : 2020/05/08
 * 이름 : 신동호
 * 내용 : 라이브러리 활용하기
 */
public class diamond {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1 ; i<=9 ; i++) {
			if(i <= 5)
				count++;
			else
				count--;
			
			for(int j=1 ; j<=5-count ; j++) {
				System.out.print(" ");
			}
			for(int k=1 ; k<=2*count-1 ; k++) {
				System.out.print("*");
				}
			System.out.print("\n");
			}
	}
}
