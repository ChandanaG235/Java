package week10;
import java.util.Scanner;

public class ProductWithoutMultiplication
{
	  public static void main(String[] args) 
	  {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();
	        int product = 0;
	        for (int i = 0; i < num2; i++) 
	        {
	            product += num1;
	        }

	        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
	    }
	}
