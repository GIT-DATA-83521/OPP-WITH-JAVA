import java.util.Scanner;

public class QueB
{

	public static void main(String[] args) 
	{
		double num1;
		double num2;
		
		System.out.println("Enter the 1st num : ");

		Scanner sc =new Scanner (System.in);
		
		if(sc.hasNextDouble() && !sc.hasNextInt())
			
		{	num1=sc.nextDouble();		
			System.out.println("Enter the 2nd num : ");
			if(sc.hasNextDouble() && !sc.hasNextInt())
			{	num2=sc.nextDouble();
				double average=(num1+num2)/2;
			System.out.println("Average of Two number is : "+average);
			}
			else
			{
			System.out.println("Entered Second number is not Double.");	
			}
	   	}
		else
		{
			System.out.println("Entered First number is not Double.");
		}
		
	}

}
