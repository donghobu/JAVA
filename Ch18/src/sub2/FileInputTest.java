package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//����ó�� ������ ���� ���� �����Ƿ�

/*
 * ��¥ : 2020/05/21
 * �̸� : �ŵ�ȣ
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
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
				// �� �̻� �о���� �����Ͱ� ���� ���
				break;
			}
			
			char c = (char) value;
			
			System.out.print(c);
		}
		
		//�Է½�Ʈ�� ����
		fis.close();
		
	} catch(Exception e) { // ���� exception, ������, ���������� ���ܸ� ��������� ��쿣 ��� �ٶ������� �ʴ�
		e.printStackTrace();
	}
		System.out.println("\n���α׷� ����...");
	}

}
