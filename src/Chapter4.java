public class Chapter4 {
	public void question() {
		for (int i = 1; i < 10; i += 3) {
			for (int k = 0; k < 3; ++k)
				System.out.print((i + k) + "단\t");
			System.out.print("\n");
			for (int j = 1; j < 10; ++j) {
				for (int k = 0; k < 3; ++k)
					System.out.print((i + k) + " * " + j + " = " + ((i + k) * j) + "\t");
				System.out.print("\n");
			}
		}
	}
}
