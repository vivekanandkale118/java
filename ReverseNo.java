import java.util.Scanner;
public class ReverseNo{
	public static void main(String args[])
	{
		int num,rev=0,rem=0;
		System.out.println("Enter a 3 digit number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Revese number is" +rev);
	}
}
	
