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
			
			for(int b=0 ; b<arr2d[a].length ; b++ ) { // 열
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
		int arr3d[][][] = {{{1, 2, 3},
			                {4, 5, 6}, 
			                {7, 8, 9}, 
			                {10, 11, 12}},
				           {{13, 14, 15}, 
			                {16, 17, 18}, 
			                {19, 20, 21}, 
			                {22, 23, 24}},
				           {{25, 26, 27}, 
			                {28, 29, 30}, 
			                {31, 32, 33}, 
			                {34, 35, 36}}}; // 행, 열, 면
		
		System.out.println("배열 arr3d의 1면1행1열 : "+arr3d[0][0][0]);
		System.out.println("배열 arr3d의 1면3행3열 : "+arr3d[0][2][2]);
		System.out.println("배열 arr3d의 2면1행2열 : "+arr3d[1][0][1]);
		System.out.println("배열 arr3d의 2면3행3열 : "+arr3d[1][2][2]);
		System.out.println("배열 arr3d의 3면1행3열 : "+arr3d[2][0][2]);
		System.out.println("배열 arr3d의 3면4행3열 : "+arr3d[2][3][2]);
	}
}
