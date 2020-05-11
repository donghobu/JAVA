package sub4;
/*
 * 날짜 : 2020/05/11
 * 이름 : 신동호
 * 내용 : 교재 p.236 클래스변수(정적변수), 클래스메서드(정적메서드), 실습하기 
 */
public class StaticTest {
	public static void main(String[] args) {
		// 선언  -> 생성 -> 실행 -> 리턴
		
		// 메모리 고정 할당 영역(Method Area)에 이미 Increment의 add(); 메서드가
		// 정의되어 있기 때문에 객체 생성없이 바로 호출 가능
		Increment.add();
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
	}

}
