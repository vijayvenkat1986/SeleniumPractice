import java.util.Scanner;

//4. Java Program to Find Factorial on Number
public class Factorial {

	public static void main(String[] args) 
	{
	   int no, fact=1;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter any number");
	   no = s.nextInt();
	   
	   for(int i=1;i<=no;i++)
	   {
		   fact=fact*i;
	   }
	   
		System.out.println("Factorial number is :" +fact);

	}

}
