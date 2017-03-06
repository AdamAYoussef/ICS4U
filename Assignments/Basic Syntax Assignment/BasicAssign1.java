/*BasicAssign1
 *Adam Youssef
 *This program takes a string from the user and
 *and prints it in the form of a hollow square
*/

import java.util.*;

public class BasicAssign1{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a line");
		String line = kb.nextLine();
		System.out.println(line + line.charAt(0)); //prints top line
		int len = line.length();
		
		//prints middle lines
		for(int i = 1; i < len; i++){
			System.out.print(line.charAt(len - i));
			for(int j = 1; j < len; j++){
				System.out.print(" ");
			}
			System.out.println(line.charAt(i));
		}
		
		//prints bottom line
		System.out.print(line.charAt(0));
		for(int h = len - 1; h > -1; h--){
			System.out.print(line.charAt(h));
		}
	}
}