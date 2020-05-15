import java.util.Iterator;
import java.util.Scanner;

public class CapitalizeFirstLetter {
	public static void main(String[] args) {
		String input = "harsha is a good boy";
        String output = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        System.out.println(output);
        
        System.out.println("**************************************");
        
        String upper_case_line = ""; 
        String str = "NISUM COUNSLUTING";
        Scanner lineScan = new Scanner(str);
        
        while(lineScan.hasNext()) {
           String word = lineScan.next(); 
           upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
        System.out.println(upper_case_line);
        
        System.out.println("**************************************");
        
        String s = "nisum consulting private limited";
		StringBuilder result = new StringBuilder(s.length());
		System.out.println(result);
		String words[] = s.split("\\ "); 
		for (int i = 0; i < words.length; i++)
		{		
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
		System.out.println(result);
		
		
		
	}

}
