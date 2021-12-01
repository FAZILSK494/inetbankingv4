package java_new1;

public class marks {
	int result;

	public static void main(String[] args) {
		marks obj1=new marks(20);
		obj1.dispalyresult();
		
		
	}

	private void dispalyresult() {
		System.out.println(result);	}

	public marks(int marks) {
		result=marks;
		
	}

}
