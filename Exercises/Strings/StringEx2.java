//StringEx2.java

import java.util.*;

public class StringEx2{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter line:");
		String line = kb.nextLine();
		int mid = line.length() / 2;
		//String words1 = line.substring(0, mid);
		//String words2 = line.substring(line.mid);
		for(int i = 0; i < mid; i++){
			System.out.print("" + line.charAt(i) + line.charAt(i + mid));
		}
		if (line.length()%2 == 1){
			System.out.print(line.charAt(line.length()-1));
		}
	}
}