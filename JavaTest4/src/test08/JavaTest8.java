package test08;
/*
 * ��¥ : 2020/05/25
 * �̸� : �ŵ�ȣ
 * ���� : �ζ� ��ȣ ������ ��������
 */
public class JavaTest8 {
	public static void main(String[] args) {
		
		lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		//�ζǹ�ȣ ����
		treeSet = new TreeSet<>(lottoSet);
		
		//�ζǹ�ȣ
	}

}
