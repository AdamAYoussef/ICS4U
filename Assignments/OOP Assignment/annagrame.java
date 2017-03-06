public class annagrame{
	public static void main(String[] args){
		anagram("","word");
	}
	
	
	public static void anagram(String picked,String left){
		if(!left.equals("")){
			for(int i=0; i<left.length(); i++){
				char let = left.charAt(i);
				String newleft=left.substring(0,i) + left.substring(i+1);
				anagram(picked+let,newleft);
			}
		
		}else{
			System.out.println(picked);
		}
	}
}

