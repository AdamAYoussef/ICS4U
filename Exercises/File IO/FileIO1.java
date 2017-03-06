//FileIO1.java

import java.io.*;
import java.util.*;

public class FileIO1{
	public static void main(String[]args)throws IOException{
		Scanner inFile = new Scanner(new BufferedReader(new FileReader("names.txt")));
		
		while(inFile.hasNextLine()){
			String line = inFile.nextLine();
			System.out.println("Hello " + line);
		}
		inFile.close();
	}
}