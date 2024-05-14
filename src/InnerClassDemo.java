
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outerObj = new Outer();
		Outer.Inner innerObj = outerObj.getInner();
		
		innerObj.incrementOuter();

	}

}


class Outer{
	
	private int outerI = 20;
	
	public Inner getInner() {
		return new Inner();
	}
	
	class Inner{
		private int innerI = 23;
		
		public void incrementOuter() {
			outerI++;
			System.out.println(outerI);
		}
	}
	
}