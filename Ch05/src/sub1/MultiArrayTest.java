package sub1;
/*
 * ��¥ : 2020/05/04
 * �̸� : �ŵ�ȣ
 * ���� : ������ �迭 �ǽ��ϱ�
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		
		// 1���� �迭
		int[] scores = {80, 60, 78, 62, 92}; // scores ���������� �ۼ��ؾ� �ϴ� rule 
		int sum = 0;
		
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		// for(int score : scores) {
		//	sum += score;
		//}
		
		System.out.println("�迭 scores�� ���� : "+sum);
		// 2���� �迭
		int arr2d[][] = {{1, 2, 3, 4}, 
				         {5, 6, 7, 8},
				         {9, 10, 11, 12}};
		
		for(int a=0 ; a<arr2d.length ; a++ )  { // ��
			
			for(int b=0 ; b<arr2d[a].length ; b++ ) {
				System.out.println("�迭 arr2d�� "+(a+1)+"�� "+(b+1)+"�� ����: "+arr2d[a][b]);
			}
		}
		System.out.println("�迭 arr2d�� 1�� 1�� ���� : "+arr2d[0][0]);
		System.out.println("�迭 arr2d�� 1�� 2�� ���� : "+arr2d[0][1]);
		System.out.println("�迭 arr2d�� 1�� 3�� ���� : "+arr2d[0][2]);
		System.out.println("�迭 arr2d�� 1�� 4�� ���� : "+arr2d[0][3]);
		
		System.out.println("�迭 arr2d�� 2�� 1�� ���� : "+arr2d[1][0]);
		System.out.println("�迭 arr2d�� 2�� 2�� ���� : "+arr2d[1][1]);
		System.out.println("�迭 arr2d�� 2�� 3�� ���� : "+arr2d[1][2]);
		System.out.println("�迭 arr2d�� 2�� 4�� ���� : "+arr2d[1][3]);
		
		System.out.println("�迭 arr2d�� 3�� 1�� ���� : "+arr2d[2][0]);
		System.out.println("�迭 arr2d�� 3�� 2�� ���� : "+arr2d[2][1]);
		System.out.println("�迭 arr2d�� 3�� 3�� ���� : "+arr2d[2][2]);
		System.out.println("�迭 arr2d�� 3�� 4�� ���� : "+arr2d[2][3]);
		// 3���� �迭
	}
}
