import java.util.function.Function;

import javax.swing.undo.CannotUndoException;

public class Reverse extends custom{

	public Reverse(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		custom c = new custom("harsha");
		try {
		int in = 0;
		
		int a = 2;
		int sum = a%in;
		throw c;
		}catch (custom e) {
			e.getMessage();
		}
		catch (Exception e) {
			e.getMessage();
		}
		String s = "H A R S H A";
		String s1 = "";
		for(int i = s.length()-1; i>=0;i--)
		{
		s1=s1+s.substring(i,i+1);
		}
		System.out.print(s1);
	}
	
	Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();

}
