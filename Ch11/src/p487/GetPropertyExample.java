package p487;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userName = System.getProperty("user.home");
		
		System.out.println("운영체제 이름 : "+osName);
	}

}
