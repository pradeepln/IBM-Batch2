
public class OddEvenFinder {

	public static void main(String[] args) {
		String arg1 = args[0];
		
		
		int num = Integer.parseInt(arg1);
		
		if(isEven(num)) {
			System.out.println(num+" is even.");
		}else {
			System.out.println(num+" is odd.");
		}

	}

	
	public static boolean isEven(int aNum) {
		return aNum % 2 == 0;
	}
}
