package sub1;
/*
 * ��¥ : 2020/05/19
 * �̸� : �ŵ�ȣ
 * ���� : ������(Thread) �ǽ��ϱ� ���� p576
 * 
 * Thread
 *  - �ϳ��� ���μ������� ����Ǵ� ���� �帧(Thread.exe ����)
 *  - ���α׷��� ����� �� �����Ǵ� ���� �帧
 *  - Thread Ŭ������ ��ӹ޾� start() �޼���� ���꽺���� ����
 */
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		
		// �񵿱�(Asyncronize) ������� ����
		
		sub1.start(); // run - subThread �� main thread ����
		
		sub2.start(); // start - subThread�� main thread ���� MultiThread
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Main Thread ����...");
		}
		
		System.out.println("Main Thread ����...");
	}

}
