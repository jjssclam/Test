public class Fibonacci {
	
	// Call this with "Fibonacci.Fibonacci(1,1);"
	
	public static long last_one;
	public static long last_two;
	
	public static void Fibonacci(long num1, long num2) {
		
		System.out.println(num2);
		try {
			Thread.sleep(10);
		} catch(Exception e) {}
		Fibonacci(num2,num1+num2);
		
	}
	
}