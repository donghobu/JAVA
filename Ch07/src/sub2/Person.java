package sub2;

public class Person {//extends Object이 생략{
		
	private String name;
	private int age;


		public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
}	
		public void hello() {
			System.out.println(name+" 입니다.");
			System.out.println(age+" 세 입니다.");
		}
}
