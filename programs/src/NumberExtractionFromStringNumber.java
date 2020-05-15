
public class NumberExtractionFromStringNumber {
	public static void main(String[] args) {
		String inputString = "Harsha@123*chinnu";

		/* extracting number */
		for (char ch : inputString.toCharArray()) {
			if (Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
		System.out.println(" ");

		/* extracting string */
		for (char ch : inputString.toCharArray()) {
			// if (Character.isAlphabetic(ch))
			if (Character.isLetter(ch)) {
				System.out.print(ch);
			}
		}
		System.out.println(" ");
		for (char ch : inputString.toCharArray()) {
			if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}

	}

}
