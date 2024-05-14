
public class StringConcatDemo {

	public static void main(String[] args) {
		String lit = "abcd";
		
		System.out.println(12 + 14); // + is arithmetic add, 
		
		System.out.println("12" + 14); // when either side of + is a string,the other side is converted into string, + is treated as concat
		System.out.println(12 + "14");
		
		
		//"12" + 14 =====> "12".concat(String.valueOf(14))
		

	}

}
