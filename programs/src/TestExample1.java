import java.util.Scanner;

public class TestExample1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] tokens = new String[s.nextInt() * 2];
		s.nextLine();
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = s.nextLine();
		}
		for (int i = 0; i < tokens.length; i = i + 2) {
			String s1 = tokens[i];
			String s2 = tokens[i + 1];
			System.out.println(s1);
			System.out.println(s2);
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) == s2.charAt(j))
					System.out.print(".");
				else
					System.out.print("*");
			}
			System.out.println();
			System.out.println();
		}

	}
}
