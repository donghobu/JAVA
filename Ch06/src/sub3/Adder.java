package sub3;

public class Adder {
	
	private int x; // 캡슐화
	
	Adder(int x){
		this.x = x;
	}
	
	public void add(int x) {} //매개변수 타입 다름 -> overload
	public void add(int[] arr) {}
	public void add(Adder a1) {}
	public void addNew(Adder a2) {}

}
