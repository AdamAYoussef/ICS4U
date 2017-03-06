//Loop2.java

public class Loop2{
	public static void main(String[]args){
		int tot = 1;
		for (int i = 1; i < 11; i ++){
			tot *= i;
			System.out.printf("%d! = %d\n", i, tot);
		}
	}
}