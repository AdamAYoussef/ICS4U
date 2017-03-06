//String2.java

public class String2{
	public static void main(String[]args){
		String name = "Adam Youssef";
		char let = 'A';
		if (let == 'A'){
			System.out.println("Eh");
		}
		let = (char)(let + 2);
		System.out.println(let);
		for (int i = 0; i < name.length(); i++){
			let = name.charAt(i);
			System.out.println((char)(let + 5));
		}
		//System.out.println("\n" + name.substring(2, 5));
		System.out.println("\n" + name.substring(6));
	}
}