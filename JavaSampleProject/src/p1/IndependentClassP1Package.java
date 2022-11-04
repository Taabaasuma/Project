package p1;

public class IndependentClassP1Package {
	Protection o=new Protection();
	public IndependentClassP1Package()
	{
		System.out.println("It is an Independent class COnstructor");
		//System.out.println("Private_a:"+private_a);
		System.out.println("Default_b:"+o.default_b);
		System.out.println("Protected_c:"+o.protected_c);
		System.out.println("Public_d:"+o.public_d);
	}

}
