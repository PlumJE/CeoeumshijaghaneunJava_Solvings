import java.util.*;

public class Chapter12 {
	public void question1() {
		String[] args;
		Scanner in = new Scanner(System.in);
		
		System.out.print("실행 시 매개 변수 : ");
		args = in.nextLine().split(" ");
		
		System.out.println("실행결과\n=사용자 입력 데이터=");
		for (String s : args)
			System.out.print(s + " ");
		
		Arrays.sort(args);
		System.out.println("\n\n= 정렬후 데이터 =");
		for (String s : args)
			System.out.print(s + " ");
		System.out.print("\n");
	}
	public void question2(String args) {
		String[] strArr = args.split(" ");
		
		for (String s : strArr)
			System.out.print(s);
		System.out.print("\n");
		
		System.out.println(strArr[strArr.length - 1] + strArr[0] + strArr[strArr.length - 1]);
		
		for (String s : strArr)
			System.out.println(s);
	}
}
