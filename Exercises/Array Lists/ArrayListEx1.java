//ArrayListEx1.java
//collections.shuffle(names);

import java.util.*;

public class ArrayListEx1{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		ArrayList<String>names = new ArrayList<String>();
		int num;
		System.out.println("# of prizes");
		num = Integer.parseInt(kb.nextLine());
		
		while(true){
			System.out.println("Enter name (done to exit): ");
			String name = kb.nextLine();
			if(name.equals("done")){
				break;
			}
			names.add(name);
		}
		Collections.shuffle(names);
		for(int i = 0; i < num && i < names.size(); i++){
			System.out.printf("%s wins!", names.get(i));
			kb.nextLine();
		}
	}
}