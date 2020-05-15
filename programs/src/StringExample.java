import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StringExample {
	public static void main(String[] args) {
		
		String s = "ATCCGCTTAGAGGGATT";
		

		
int val = 10;
if((val>10 ? val++: --val)<10) {
	System.out.print("mac");
}if(val<10) {
	System.out.print("PC");
}

System.out.println("****************************");
String ses = new String("Alice,nod,SMith");
ses = ses.replaceAll(",",":");
System.out.print(ses);

System.out.println("****************************");
		
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "HELLO";
		
		System.out.println(s1.equals(s2) +""+s2.equals(s3)+ ""+(s1 == s2));
		if(s1 == s3.intern())
			{System.out.println("equals");
			}else {
				System.out.println("not");
			}
		
		System.out.println("****************************");
		
		//String s = "GeeksforGeeks";
		String se =  "GeeksforGeeks"+"harsha";
        // Prints the String. 
        System.out.println("String s = " + s);
        System.out.println("String se = " + se);
  
        // Declare String using new operator 
        String ss = new String("GeeksforGeeks"); 
  
        // Prints the String. 
        System.out.println("String ss = " + ss); 
        System.out.println(s==se);
        System.out.println(s==ss);
        System.out.println(s==ss.intern());
        System.out.println(s.equals(ss));
        
        
        System.out.println("****************************");
        
        String st[]= {"wood","teak","pine"};
        Stream<String> t = Arrays.stream(st);
        
	}
	
	

	
	

}
