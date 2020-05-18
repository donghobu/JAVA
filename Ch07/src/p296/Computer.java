package p296;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areCircle() ½ÇÇà");
		return Math.PI * r * r;
	}

}
