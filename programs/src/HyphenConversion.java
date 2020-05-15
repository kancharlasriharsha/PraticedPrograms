import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HyphenConversion {

	public static void main(String[] args) {
		final String regex = "(?=[A-Z][a-z])";
		final String string = "B2BNewQuoteProcess, hackerExample, OddOrEven";
		// final String subst = "_";
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(string);
		// The substituted value will be contained in the result variable
		final String result = matcher.replaceAll("_");
		System.out.println("Substitution result: " + result.toLowerCase());

		System.out.println("**************");

		String s = "NisumConsultingPvtLtd";
		// (?<!^)
		LinkedList<String> sresult = new LinkedList<String>();
		for (String w : s.split("(?=[A-Z][a-z])")) {
			sresult.add(w);
		}
		System.out.println(sresult);
		
		System.out.println("**************");
		
		
		String str = "I have a cat. I play cricket with bat. I dont like rat,"+
	            "i hate mats, now break it";
	        Pattern ptn = Pattern.compile("(cat|rat|mats|bat)");
	        String[] parts = ptn.split(str);
	        for(String p:parts){
	            System.out.println(p);
	        }
	}
}
