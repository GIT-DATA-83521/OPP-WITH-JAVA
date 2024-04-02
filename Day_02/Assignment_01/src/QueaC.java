import java.util.Scanner;

public class QueaC {

	public static void main(String[] args)
	{
		
		int choice;
		
		double bill =0;
		Scanner sc = new Scanner(System.in);

		do
		   {
			System.out.println("1 - Idli");
			System.out.println("2 - Poha");
			System.out.println("3 - Samosa");
			System.out.println("4 - Vada");
			System.out.println("5 - Rava");
			System.out.println("6 - Sandwitch");
			System.out.println("7 - Bhaji");
			System.out.println("8 - Eggs");
			System.out.println("9 - Tea");
			System.out.println("10 - Coffee");
			System.out.println("11- Calculate Bill");
			System.out.println("Enter The Choice ");
			//Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();
			switch (choice)
			{
			case 1:
			{
				double price =20;
				System.out.println("The Price of Idli is 20 ");
				int quant;
				System.out.print("enter the Quantity : ");
				quant=sc.nextInt();
				bill= bill+(quant*price);
			}
			break;	
			
			case 2:
			{
				double price =20;
				System.out.println("The Price of Poha is 20 ");
				int quant;
				System.out.print("enter the Quantity : ");
				quant=sc.nextInt();
				bill= bill+(quant*price);
			}	
			break;
			
			case 3:
			{
				double price =25;
				System.out.println("The Price of Samosa is 25 ");
				int quant;
				System.out.print("enter the Quantity : ");
				quant=sc.nextInt();
				bill= bill+(quant*price);
			}
			break;
			
		case 4:
		{
			double price =25;
			System.out.println("The Price of Vada is 25 ");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
		
		case 5:
		{
			double price =15;
			System.out.println("The Price of Rava is 15");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
		
		case 6:
		{
			double price =30;
			System.out.println("The Price of Sandwitch is 30 ");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
		
		case 7:
		{
			double price =15;
			System.out.println("The Price of Bhaji is 15 ");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
			
		case 8:
		{
			double price =30;
			System.out.println("The Price of Eggs is 30 ");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
		
		case 9:
		{
			double price =10;
			System.out.println("The Price of Tea is 10 ");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
		
		case 10:
		{
			double price =15;
			System.out.println("The Price of Coffee is 15 ");
			int quant;
			System.out.print("enter the Quantity : ");
			quant=sc.nextInt();
			bill= bill+(quant*price);
		}
		break;
		
		case 11:
		{
			System.out.println("The Total Bill is : "+bill);
			choice =0;
		}
		break;
		
		
		}
			
			
	}
		
		while(choice!=0);
		
	}
}


