import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int factorial=1;
		int i=1;
		while(i<=n)
		{
			factorial*=i;
			i++;
		}
		System.out.println("The factorial of "+n+" is "+factorial);
	}
}



