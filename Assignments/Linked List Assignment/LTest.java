//LTest.java

public class LTest {
	public static void main(String[] args) {
		LList nums = new LList();
		nums.push(23);
		nums.push(17);
		nums.push(23);
		nums.push(20);
		nums.push(23);
		nums.push(36);
		nums.push(54);
		System.out.println(nums);
		nums.removeDuplicates();
		System.out.println(nums);
		System.out.println(nums.clone());
	}
}

