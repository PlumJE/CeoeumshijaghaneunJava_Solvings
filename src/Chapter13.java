import java.util.Scanner;
import java.io.*;

public class Chapter13 {
	public void question(String src, String dest) {
		try {
			File srcFile = new File(src);
			File destFile = new File(dest);
			
			if (!srcFile.exists()) {
				System.out.println("소스파일이 존재하지 않습니다");
				return;
			}
			
			if (destFile.exists()) {
				String choice;
				System.out.println("타겟파일이 이미 존재합니다\n덮어쓰기를 수행하시겠습니까?(y/n)");
				while (true) {
					choice = new Scanner(System.in).next();
					if (choice.equalsIgnoreCase("y"))
						break;
					if (choice.equalsIgnoreCase("n"))
						return;
					System.out.print("Y 또는 N로 입력하세요 : ");
				}
			}
			
			System.out.println("소스파일은 : " + src);
			System.out.println("타겟파일은 : " + dest);
			
			FileInputStream fis = new FileInputStream(srcFile);
			FileOutputStream fos = new FileOutputStream(destFile);
			int i;
			while ((i = fis.read()) != -1)
				fos.write(i);
			System.out.println("복사가 종료되었습니다");
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
	}
	public void question() {
		System.out.println("매개변수로 소스파일과 타겟파일을 지정하세요");
	}
}
