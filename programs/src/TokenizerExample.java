import java.util.StringTokenizer;

public class TokenizerExample {
	public static void main(String[] args) {
		 
	    StringTokenizer st = new StringTokenizer("abc map “asdf sawd lkjd” asd “fdsw crd”"," ");  
	    while (st.hasMoreTokens()) {  
	        System.out.println(st.nextToken());  
	    }  
	}
}
