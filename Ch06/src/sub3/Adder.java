package sub3;

public class Adder {
	
	private int x; // ĸ��ȭ
	
	Adder(int x){
		this.x = x;
	}
	
	public void add(int x) {} //�Ű����� Ÿ�� �ٸ� -> overload
	public void add(int[] arr) {}
	public void add(Adder a1) {}
	public void addNew(Adder a2) {}

}
