import java.util.*;
import java.io.*;
import java.lang.*;

public class PalindromeRemover {

	public static String PalindromeCreator(String str) {
		// ex: kjjjhjjj   if you remove 'k' then it will be a palindrome
		int n = 0, k = 0;
		char[] s = str.toCharArray();
		char[] revtemp = new char[s.length];
		char[] temp = s;
		int i = s.length;
		boolean b = true;
		while (n < 2) {
			char[] ch = new char[s.length];
			for (int l = n + 1; l < s.length; l++) {
				ch[k] = s[l];
				k++;
			}
			k = 0;
			for (int j = ch.length - 1 - (n + 1); j >= 0; j--) {

				revtemp[k] = ch[j];
				k++;
			}
			k = 0;
			for (int p = 0; p <= revtemp.length - 1; p++) {
				if (ch[p] != revtemp[p]) {
					b = false;
					break;
				}

			}
			n++;
			if (b) {
				return Character.toString(s[n]);
			} else {
				return "Not possible";
			}

		}
		System.out.println(revtemp);

		return str;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(PalindromeCreator(s.nextLine()));
	}

}