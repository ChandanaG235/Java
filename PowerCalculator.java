package week10;
import java.util.Scanner;
public class PowerCalculator
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= X;
        }
        System.out.println(X + " raised to the power of " + n + " is: " + result);
    }
}
