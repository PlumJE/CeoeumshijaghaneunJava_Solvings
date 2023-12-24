public class Chapter9 {
	public void question() {
		int a = 10, b = 20;
		double x = 10.0, y = 20.0;
		
		System.out.println(a + "과 " + b + "중 큰 값은 " + max(a, b));
		System.out.println(x + "과 " + y + "중 큰 값은 " + max(x, y));
	}
	public int max(int a, int b) {
		return (a > b) ? a : b;
	}
	public double max(double a, double b) {
		return (a > b) ? a : b;
	}
}
