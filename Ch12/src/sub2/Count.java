package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블록선언으로 스레드간 경합을 막는다.
	public void setNum() { 
		
		synchronized(this) {
		num++;
		}
	}
	

}
