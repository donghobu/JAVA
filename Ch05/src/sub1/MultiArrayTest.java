package sub1;
/*
 * 날짜 : 2020/05/04
 * 이름 : 신동호
 * 내용 : 다차원 배열 실습하기
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92}; // scores 복수형으로 작성해야 하는 rule 
		int sum = 0;
		
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		// for(int score : scores) {
		//	sum += score;
		//}
		
		System.out.println("배열 scores의 총합 : "+sum);
		// 2차원 배열
		int arr2d[][] = {{1, 2, 3, 4}, 
				         {5, 6, 7, 8},
				         {9, 10, 11, 12}};
		
		for(int a=0 ; a<arr2d.length ; a++ )  { // 행
			
			for(int b=0 ; b<arr2d[a].length ; b++ ) {
				System.out.println("배열 arr2d의 "+(a+1)+"행 "+(b+1)+"열 원소: "+arr2d[a][b]);
			}
		}
		System.out.println("배열 arr2d의 1행 1열 원소 : "+arr2d[0][0]);
		System.out.println("배열 arr2d의 1행 2열 원소 : "+arr2d[0][1]);
		System.out.println("배열 arr2d의 1행 3열 원소 : "+arr2d[0][2]);
		System.out.println("배열 arr2d의 1행 4열 원소 : "+arr2d[0][3]);
		
		System.out.println("배열 arr2d의 2행 1열 원소 : "+arr2d[1][0]);
		System.out.println("배열 arr2d의 2행 2열 원소 : "+arr2d[1][1]);
		System.out.println("배열 arr2d의 2행 3열 원소 : "+arr2d[1][2]);
		System.out.println("배열 arr2d의 2행 4열 원소 : "+arr2d[1][3]);
		
		System.out.println("배열 arr2d의 3행 1열 원소 : "+arr2d[2][0]);
		System.out.println("배열 arr2d의 3행 2열 원소 : "+arr2d[2][1]);
		System.out.println("배열 arr2d의 3행 3열 원소 : "+arr2d[2][2]);
		System.out.println("배열 arr2d의 3행 4열 원소 : "+arr2d[2][3]);
		// 3차원 배열
	}
}
