import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no,i,first=0,second=1,next;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=s.nextInt();
		
		for(i=0;i<no;i++)
		{
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
		}

	}

}
