/**
 * Jane schneider
 * 
 */
import java.util.Scanner;

public class PhoneNumber
{
	public static void main(String [] args)
	{
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter name: ");
	String name = scan.next();
	scan.nextLine();
	
	System.out.print("Enter phone number: " );
	String phoneNumber = scan.next();
	scan.nextLine();

	String areaCode = phoneNumber.substring(0,3);
	String secondThree = phoneNumber.substring(3,6);
	String lastFour = phoneNumber.substring(6,10);
	String numFormat = "(" + areaCode + ")" + secondThree + "-" + lastFour;
	
	
	System.out.printf("%-20s %s", name, numFormat);
	
	
	
	
	
	}
	
	
}
