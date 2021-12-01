package java_new1;

public class Student {

	public static void main(String[] args) {
		Student obj1=new Student(20);
		obj1.dispalyresult();
		
	}

	private void dispalyresult() {
		// TODO Auto-generated method stub
		
	}

	public Student() {
		System.out.println("welcome to school" );
	}
	public Student(int rank) {
		System.out.println("welcome to school  "  +  rank);
	}
	
	public Student(String schoolName, int rank) {
		System.out.println("welcome to school " + schoolName +"  " + schoolName);
	}
}
