import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arm=0, a,d,no;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Armstrong Number: ");
        no = s.nextInt();
        d=no;
        while(no>0)
        {
        	a=no%10;
        	no=no/10;
        	arm=arm+(a*a*a);
        	
        }
        if(d==arm)
        {
        	System.out.println("ArmStrong Number");
        }
        else
        {
        	System.out.println("Not an Armstrong Number");
        }
		
	}

}
