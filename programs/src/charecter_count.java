import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class charecter_count {
	public static void main(String[] args) {

		/* using hashMap */
		String string = "Ramadevi";
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		char[] charArr = string.toCharArray();
		for(char c: charArr) {
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			}else hashmap.put(c, 1);
		}
		System.out.println(string+":"+hashmap);

		/* using map */
		String s = "HARSHA";
		Map<Character, Integer> freqs = new HashMap<>();
		for (char ch : s.toCharArray()) {
			freqs.merge(ch, 1, Integer::sum);
		}
		System.out.println(s + ": " + freqs);

		/* using java 8 */
		String st = "harsha";
		Map<Character, Integer> frequencies = st.chars().boxed()
				.collect(Collectors.toMap(k -> Character.valueOf((char) k.intValue()), v -> 1, Integer::sum));
		System.out.println(st + ": " + frequencies);

		/* sequenctial countusing for loop */
		//printRLE("harsha");
	}

	/* using for loop */
	private static void printRLE(String s) {
		for (int i = 0; i < s.length(); i++) {
			// Counting occurrences of s[i]
			int count = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(s.charAt(i) + "" + count + " ");
		}
		System.out.println();

	}

}
