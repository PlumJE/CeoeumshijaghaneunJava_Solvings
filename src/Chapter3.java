import java.util.Scanner;

public class Chapter3 {
	public void question() {
		int money;
		
		System.out.print("금액을 입력하세요 : ");
		money = new Scanner(System.in).nextInt();
		
		System.out.println("일만원권 : "+ (money / 10000) +"장");
		money %= 10000;
		System.out.println("천원권 : "+ (money / 1000) + "장");
		money %= 1000;
		System.out.println("오백원주화 : "+ (money / 500) + "개");
		money %= 500;
		System.out.println("백원주화 : "+ (money / 100) + "개");
		money %= 100;
		System.out.println("십원주화 : "+ (money / 10) + "개");
		money %= 10;
		System.out.println("일원주화 : "+ (money % 10) + "개");
	}
}
