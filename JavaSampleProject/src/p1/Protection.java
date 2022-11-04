package p1;

public class Protection {
	private int private_a=100;
	int default_b=200;
	protected int protected_c=300;
	public int public_d=400;
	
	public Protection()
	{
		System.out.println("It is an Protection class COnstructor");
		System.out.println("Private_a:"+private_a);
		System.out.println("Default_b:"+default_b);
		System.out.println("Protected_c:"+protected_c);
		System.out.println("Public_d:"+public_d);
	}
	public static void main(String[] args) {
		

	}

}
