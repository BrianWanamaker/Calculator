import java.util.Scanner;

public class Calculator{

    public static void main(String[]args)
    {
        System.out.println("Enter two whole numbers");
        System.out.println("Number 1:");
        Scanner in = new Scanner(System.in);
        int numOne = in.nextInt();
        System.out.println("Number 2:");
        int numTwo = in.nextInt();
        System.out.println(numOne + "+" + numTwo + " = " + (numOne+numTwo));
    }
}