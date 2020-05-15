
public class charecter_count_in_sequence {
	public static void main(String[] args) {
		String s = "harsha";

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(s.charAt(i) + "" + count + " ");
		}
	}
}
