package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) throws Exception {
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/sdh";
		String user = "sdh";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql = "DELETE FROM `USER1` WHERE ('J101','��ö','010-1231-2121',52)";
		String sql1 = "DELETE FROM `USER1` WHERE ('J102','��öȣ','010-1231-2222',55)";
		
		stmt.executeUpdate(sql);
		stmt.executeUpdate(sql1);
		
		// 5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)
		
		// 6�ܰ� - �����ͺ��̽� ����(����)
		conn.close();
		
		System.out.println("DELETE �Ϸ�...");
	}

}
