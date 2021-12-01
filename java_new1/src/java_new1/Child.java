package java_new1;

public class Child extends Parent implements Loan {

	public static void main(String[] args) {
Child ob1=new Child();
ob1.display();

Parent ob2=new Parent();
ob2.display();

Parent ob3=new Child();
ob3.display();
	}
	public void display() {
			System.out.println("child class display ");
		}
	@Override
	public void homloan() {
		
		System.err.println("homloan");
		
	}
	@Override
	public void carloan() {
		System.err.println("carloan");
		
	}
	}

