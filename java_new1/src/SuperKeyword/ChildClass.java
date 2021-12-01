package SuperKeyword;

public class ChildClass extends BaseClass {
	int int_rate=10;
	public static void main(String[] args) {
		ChildClass obj1=new ChildClass();
		System.out.println(obj1.int_rate);
		obj1.rbi();
	}
	public void SMIR()
	{
		System.out.println("im childclass");
	}
		
	
	public void rbi() {
		super.SMIR();
		System.out.println(super.int_rate);
	}

}
