package simplecalc;

import java.util.Scanner;

public class SimpleCalc {
	
	public static int addition(int a,int b )
	{
		int c = a + b;
		return c;
	}
	
	public static int multiplication(int a,int b )
	{
		int c = a * b;
		return c;
	}
	
	public static int substraction(int a,int b )
	{
		int c;
		if (a > b) 
		{
			c = a - b;
		}
		else 
		{
			c = b -a;
		}
		return c;
	}
	
	public static int division(int a,int b )
	{
		int c;
		if (a > b) 
		{
			c = a / b;
		}
		else 
		{
			c = b / a;
		}
		return c;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		int a,b,c,choice;
		
		do {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter the first number: ");
				a = sc.nextInt();
				System.out.print("Enter the second number: ");
				b = sc.nextInt();
				c = addition(a, b);
				System.out.println("Result is: "+c);
				break;
				
			case 2:
				System.out.print("Enter the first number: ");
				a = sc.nextInt();
				System.out.print("Enter the second number: ");
				b = sc.nextInt();
				c = substraction(a, b);
				System.out.println("Result is: "+c);
				break;
				
			case 3:
				System.out.print("Enter the first number: ");
				a = sc.nextInt();
				System.out.print("Enter the second number: ");
				b = sc.nextInt();
				c = multiplication(a, b);
				System.out.println("Result is: "+c);
				break;
				
			case 4:
				System.out.print("Enter the first number: ");
				a = sc.nextInt();
				System.out.print("Enter the second number: ");
				b = sc.nextInt();
				c = division(a, b);
				System.out.println("Result is: "+c);
				break;

			default:System.out.println("Enter a valid choice!!!");
				break;
			}
			
		} while (choice != 0); 
		
		
	}

}
