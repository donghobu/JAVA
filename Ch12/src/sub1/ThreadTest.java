package sub1;
/*
 * 날짜 : 2020/05/19
 * 이름 : 신동호
 * 내용 : 스레드(Thread) 실습하기 교재 p576
 * 
 * Thread
 *  - 하나의 프로세스에서 실행되는 실행 흐름(Thread.exe 생성)
 *  - 프로그램이 실행될 때 생성되는 실행 흐름
 *  - Thread 클래스를 상속받아 start() 메서드로 서브스레드 실행
 */
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		
		// 비동기(Asyncronize) 방식으로 실행
		
		sub1.start(); // run - subThread 후 main thread 실행
		
		sub2.start(); // start - subThread와 main thread 같이 MultiThread
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
		}
		
		System.out.println("Main Thread 종료...");
	}

}
