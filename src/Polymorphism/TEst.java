package Polymorphism;

public class TEst {
	
	public void m1(String s)
	{
		System.out.println("m1 String");
	}
	
	public void m1(StringBuffer b)
	{
		System.out.println("m1 double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TEst tEst=new TEst();
		tEst.m1("");

	}

}
