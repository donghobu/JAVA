package test08;
/*
 * 날짜 : 2020/05/25
 * 이름 : 신동호
 * 내용 : 로또 번호 생성기 연습문제
 */
public class JavaTest8 {
	public static void main(String[] args) {
		
		lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		//로또번호 정렬
		treeSet = new TreeSet<>(lottoSet);
		
		//로또번호
	}

}
