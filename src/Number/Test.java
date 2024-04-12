package Number;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		System.out.println(test.fib(6));

	}
	
	public int fib(int n) {
		if(n<=1) 
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}
