package throw_throws;

public class Example_Throw {


		    public static void main(String[] args) {
		        Example_Throw checker = new Example_Throw();
		        checker.processAge(20); // Example age less than 18
		    }

		    public void processAge(int age) {
		        try {
		            checkAge(age);  // This may throw an IllegalArgumentException
		        } catch (IllegalArgumentException e) {
		            System.out.println("Caught an exception: " + e.getMessage());
		        }
		    }

		    public void checkAge(int age) {
		        if (age < 18) {
		            throw new IllegalArgumentException("Age must be 18 or older.");
		        }
		        System.out.println("Access granted.");
		    }
}



/*

Example:


public void checkAge(int age) {
    if (age < 18) {
        throw new IllegalArgumentException("Age must be 18 or older.");
    }
    System.out.println("Access granted.");
}
Explanation:

If age is less than 18, the method will throw an IllegalArgumentException.
The program will stop executing at the point where the exception is thrown unless it's caught by a try-catch block.


*/