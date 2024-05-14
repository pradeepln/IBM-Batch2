
class Engineer extends Employee{
	public Engineer(int id,String name) {
		super(id,name);
		System.out.println("inside engineer const...");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		new Engineer(1, "hari");

	}

}
