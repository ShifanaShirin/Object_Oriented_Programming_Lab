import java.util.Scanner;
public class SumOfNumbers
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of first "+n+" numbers is "+sum);
	}
}

