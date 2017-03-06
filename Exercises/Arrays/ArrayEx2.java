import java.util.*;

public class ArrayEx2{
	public static void main(String []args){
		Scanner kb = new Scanner(System.in);
		String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println("Enter a line.");
		String line = kb.nextLine();
		
		line = line.replaceAll("Sunday","!@#$");
		for(int i=5; i>=0; i--){
			line = line.replaceAll(days[i],days[i+1]);
		}
		line = line.replaceAll("!@#$","Monday");
		System.out.println(line);

	}
}