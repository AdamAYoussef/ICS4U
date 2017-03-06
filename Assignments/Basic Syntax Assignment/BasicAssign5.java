/*BasicAssign5.java
 *Adam Youssef
 *This program takes a product code and sees if
 *it is valid or not based on the given rules
 */ 
 
import java.util.*;

public class BasicAssign5{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter code: ");
		String line = kb.nextLine();
		int[]outNums = new int[6]; //holds 6 numbers in first part of code
		String out = ""; //used for parsing string to integers
		int count = 0; //counts how many numbers are in first part of code
		int tot = 0; //what the second part of the code should equal
		for(char ch: line.toCharArray()){ //checks to see what parts of code are numbers
			if (Character.isDigit(ch)){
				out += ch;
				outNums[count] += Integer.parseInt(out); //changes string to integers
				count += 1;
			}
			if (count > 6 and ch == ' '){ //checks if there are more than 6 numbers in first part of code 
				System.out.println("Invalid");
			}	
		}	
		for(int i = 0; i < 5; i+= 2){ // multiplies numbers together to equal second part of code
			tot += outNums[i] * outNums[i + 1];
		}
		System.out.println(tot);	
	}
}