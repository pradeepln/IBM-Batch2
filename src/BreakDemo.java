
public class BreakDemo {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		l1:while(true) {
			
			System.out.println("some processing of i "+i);
			
			
			for(int j=0;j<99;j++) {
				System.out.println("Some nested processing with i "+i+" j "+j);
				
				if(j == 3) {
					break l1;
				}
				System.out.println("more.....");
			}
			
			if(i == 7) {
				System.out.println("Reached lucky num, breaking out now...");
				break;
			}
			
			System.out.println("some further processing of "+i);
			i++;
		}
		
		System.out.println("After all looping ....");

	}

}
