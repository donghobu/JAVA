package sub1;
/*
 * ��¥ : 2020/05/04
 * �̸� : �ŵ�ȣ
 * ���� : �ڹ� �迭 ���� �ǽ��ϱ�
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// ����
		int num1 = 1, num2 = 2,  num3 = 3, num4 = 4, num5 = 5;
		
		// �迭
		int nums[] = {1, 2, 3, 4, 5};

	
		System.out.println("�迭 nums�� 1��° ���� :"+nums[0]);
		System.out.println("�迭 nums�� 2��° ���� :"+nums[1]);
		System.out.println("�迭 nums�� 3��° ���� :"+nums[2]);
		System.out.println("�迭 nums�� 4��° ���� :"+nums[3]);
		System.out.println("�迭 nums�� 5��° ���� :"+nums[4]);
		
		// �迭 ���� ���
		for(int i=0 ; i<5 ; i++) {
			System.out.println("�迭 nums�� "+(i+1)+"��° ���� : "+nums[i]);
		}
		
		// �迭�� ����
		System.out.println("�迭 nums�� ������ ���� : "+nums.length);
		
		// Ȯ�ι���
		String p1 = "������";
		String p2 = "������";
		String p3 = "�庸��";
		String p4 = "������";
		String p5 = "�̼���";
		
		String []people = {p1, p2, p3, p4, p5};
		
		// �迭�� �ݺ���
		for(String person : people) {
			
			System.out.print(person+", ");
		}

	}
}