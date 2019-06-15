
import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        // add 3 numbers, sum them and print the result
        int num1, num2, num3, sum; //declare the numbers and sum
        num1=0;
        num2=0;
        num3=0;
        sum=0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("....Welcome....");


        System.out.println("User Enter First Number");
        num1=keyboard.nextInt();
        System.out.println("User Enter Second Number");
        num2=keyboard.nextInt();
        System.out.println("User Enter Third Number");
        num3=keyboard.nextInt();

        sum= num1 + num2 + num3;

        System.out.println("The sum of three number is: "+sum);

    }
}
