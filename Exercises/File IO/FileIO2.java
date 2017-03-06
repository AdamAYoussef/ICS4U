//FileIO2.java

import java.io.*;
import java.util.*;

public class FileIO2{
	public static void main(String[]args){
		try{
			Scanner in = new Scanner(new BufferedReader(new FileReader("ages.txt")));
			while(in.hasNextLine()){
				String name = in.nextLine();
				int age = Integer.parseInt(in.nextLine());
				System.out.printf("%s is %d. ", name, age); 
			}
			in.close();
		}
		catch(IOException ex){
			System.out.println("Um, dude, ages.txt?");
		}
	}
}

/*line-based vs. token based
 *
 *this is a test \n
 *45 \n
 *
 *token - skip over whitespace, read token.
 *line-based - no skipping. read up tp and including \n.
 */ 