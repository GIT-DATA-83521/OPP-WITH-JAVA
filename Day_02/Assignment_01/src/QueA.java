import java.util.Scanner;

public class QueA {
	public static void main(String[]args) {
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		
		String n1=Integer.toBinaryString(num);	
		
		String n2=Integer.toHexString(num);	
		
		String n3=Integer.toOctalString(num);	
		
		System.out.println("The Octal Form of number "+num+"  is  "+n1);
		System.out.println("The binary Form of number "+num+"  is  "+n2);
		System.out.println("The Hexa Form of number "+num+"  is  "+n3);

		
		
	}

}
