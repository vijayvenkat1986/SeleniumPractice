import java.util.Scanner;

//2.Java Program to Swap two numbers without using third variable
public class Java_Program2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b;
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter a number");
		a = in1.nextInt();
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter a second number");
		b = in2.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of a: " +a);
		System.out.println("Value of b: " +b);
	}

}
