package p119;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
		System.out.println("700만원");
		break;
		case "과장":
		System.out.println("500만원");
		break;
		default:
		System.out.println("300만원");
		}
	}
}
