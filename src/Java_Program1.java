import java.util.Scanner;

//1. Java Program to Find Odd or Even number
public class Java_Program1 {

	public static void main(String[] args) 
	{
	    int no;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter any number:");
	    no = s.nextInt();
	    if(no%2==0)
	    {
	    	System.out.println("The Number is Even Number");
	    }
	    else{
	    	System.out.println("The Number is Odd Number");
	    }

	}

}
