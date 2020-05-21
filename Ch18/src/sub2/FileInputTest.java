package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//예외처리 파일이 없을 수도 있으므로

/*
 * 날짜 : 2020/05/21
 * 이름 : 신동호
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018
 */
public class FileInputTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		try {
		FileInputStream fis = new FileInputStream(file);
		int value = 0;
		
		while(true) {
			
			value = fis.read();
			
			if(value == -1) {
				// 더 이상 읽어들일 데이터가 없을 경우
				break;
			}
			
			char c = (char) value;
			
			System.out.print(c);
		}
		
		//입력스트림 해제
		fis.close();
		
	} catch(Exception e) { // 만능 exception, 하지만, 세부적으로 예외를 나눠줘야할 경우엔 사용 바람직하지 않다
		e.printStackTrace();
	}
		System.out.println("\n프로그램 종료...");
	}

}
