//Loop3.java

public class Loop3{
	public static void main(String[]args){
		int tot = 0;
		for(int i = 0; i < 1000; i++){
			System.out.println("Start");
			if (i%2 == 0){
				continue;
			}
			if (tot > 10000){
				break;
			}
			tot += i;
			System.out.println(i + " " + tot);
		}
	}
}