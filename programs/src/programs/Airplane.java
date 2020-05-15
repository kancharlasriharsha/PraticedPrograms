package programs;

import java.io.IOException;

public class Airplane {
	public Airplane() throws IOException{
		System.out.println("plane");
		throw new IOException();
	}

}
