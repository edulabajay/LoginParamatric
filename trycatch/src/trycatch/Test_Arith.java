package trycatch;

public class Test_Arith {

	public static void main(String[] args) {
		Test_Arith test = new Test_Arith();
		test.divide(10, 0);  // This will cause an ArithmeticException
	}

	public void divide(int a, int b) {

		try {
			int result = a / b;  // This might throw ArithmeticException if b is 0
			System.out.println("Result: " + result);
			
		} catch(ArithmeticException e) {

			System.out.println("can not divided by zero");
		}finally {

			System.out.println("exception is successfully caught");
		}

	}

}
