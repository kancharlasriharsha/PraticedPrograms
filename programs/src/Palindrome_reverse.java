import java.util.stream.IntStream;

public class Palindrome_reverse {

	public static void main(String[] args) {
		String originalString = "HARSHA";
		
		/* without using inbuilt function */
		String reversedString = ""; 
	    for (int i = originalString.length() - 1; i >= 0; i--)
	        reversedString = reversedString + originalString.charAt(i);
	    System.out.println("reverse of a string is :"+ reversedString);
	    if(originalString.equals(reversedString)) 
	    	System.out.println(reversedString+ " is palidrome ");
	    else System.out.println(reversedString+ " is not palidrome ");
	    
		
		/* using stringBuffer */
		String reverse = new StringBuffer(originalString).reverse().toString();
		System.out.println("reverse of a string is :"+ reverse);
		if (originalString.equals(reverse)) System.out.println(reverse +" is palindrome");
		else System.out.println(reverse +" is not palindrome");
		
		
		
		/* using stringBuilder */
		String reversedStringg = new StringBuilder(originalString).reverse().toString();
		System.out.println("reverse of a string is :"+ reversedStringg);
        if (originalString.equals(reversedStringg))
        	System.out.println(reversedStringg+ " is palidrome ");
        else System.out.println(reversedStringg+ "is not a palidrome ");
        
        
        /* using StringUtils 
         * 
        String reversedString = StringUtils.reverse(originalString);
        System.out.println("reverse of a string is :"+ reversedString);
         if(originalString.equals(reversedString))
        	 System.out.println(reversedString+ " is a palindrome");
        	 else System.out.println(reversedString+ "is not a palidrome ");   */
        
	
    
    
    /* Java 8 */
    System.out.println("Is radar a Palindrome? - " + isPalindrome("RADAR"));
    
}

	public static boolean isPalindrome(String originalString) {
        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, tempString.length() / 2)
            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
    }
}
