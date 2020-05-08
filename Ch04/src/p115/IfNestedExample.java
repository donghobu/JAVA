package p115;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: "+score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		} else {
				if(score>=85) {
					grade = "B+";
				}else {
					grade = "B";
				}
			}
		System.out.println("학점: " + grade);
	}
}
