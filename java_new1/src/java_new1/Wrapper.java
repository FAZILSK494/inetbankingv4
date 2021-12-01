package java_new1;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a="100.32";
	double a1=Double.parseDouble(a);
	String b="200";
	double b1=Double.parseDouble(b);
	double result=a1+b1;
System.out.println(a1+b1);
if(result==300){
	System.out.println("pass");
}
else {System.out.println("fails");
}
}
}
