import java.io.*;
import java.util.*;

class Fibonaci{
	public static void main(String args[]){
		//Taking input from the console
			System.out.println("Enter number");
			int number = Integer.parseInt(System.console().readLine());

			System.out.println("Fibonacci:");
			for (int i = 0; i < number; i++) {
				System.out.println(fibonacci(i));
			}
	}

	public static int fibonacci(int n){ //recursive method to find fibonacci series

		if (n <= 1){
			return n;
		}
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}