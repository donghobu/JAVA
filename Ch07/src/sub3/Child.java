package sub3;

public class Child extends Parent{
	
	/*
	부모클래스 method1에서 final선언을 했으므로  Override를 할 수 없다.
	
	
	public void method1() {
		System.out.println("Child - method1...");
	}
	*/
	@Override
	public void method2() {
		System.out.println("Child - method2...");
	}
	@Override
	public void method3(int a) {
		System.out.println("Child - method3...");

}
}
