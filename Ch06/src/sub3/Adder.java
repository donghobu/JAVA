package sub3;

public class Adder {
	
	private int x; // 캡슐화
	
	Adder(int x){
		this.x = x;
	}
	
	// getter, setter 메서드
	// - 외부에서 멤버변수에 대한 직접참조가 필요할 경우 사용하는 메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void add(int x) {
		this.x = x + 50;
	} //매개변수 타입 다름 -> overload
	
	public void add(int[] arr) {
		arr[0]++;
	}
	
	public void add(Adder a1) {
		int x = a1.getX() + 40;
		a1.setX(x);
	}
	
	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
	}

}
