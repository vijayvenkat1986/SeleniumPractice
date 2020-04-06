import java.util.Scanner;

//3. Write a java program to find Prime number
public class Java_Program3 {

	public static void main(String[] args) 
	{
		int no,i;
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter any number");
		no = in1.nextInt();
		
		if(no==1)
		{
			System.out.println("The Smallest prime number is 2");
		}
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Not Prime");
				break;
			}
		}
		if(no==i)
		{
			System.out.println("Prime");
		}
		
	}

}
