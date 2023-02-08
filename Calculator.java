import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Calculator{

    public static void main(String[]args)
    {
        System.out.println("Enter two whole numbers");
        System.out.println("Number 1:");
        Scanner in = new Scanner(System.in);
        float numOne = in.nextFloat();
        System.out.println("Number 2:");
        float numTwo = in.nextFloat();
        System.out.println("Would you like to perform 'addition', 'subtraction', 'multiplication', or 'division' ?");
        in.nextLine();
        String input = in.nextLine();   

        if(input.toLowerCase().equals("addition"))
        {
            System.out.println(numOne + "+" + numTwo + " = " + (numOne+numTwo));
        }
        else if(input.toLowerCase().equals("subtraction"))
        {
            System.out.println(numOne + "-" + numTwo + " = " + (numOne-numTwo));
        }
        else if(input.toLowerCase().equals("multiplication"))
        {
            System.out.println(numOne + "*" + numTwo + " = " + (numOne*numTwo));
        }
        else if(input.toLowerCase().equals("division"))
        {
            System.out.println(numOne + "/" + numTwo + " = " + (numOne/numTwo));
        }
        else
        {
            System.out.println("Invalid input,Please try again!");
        }
        

    }
}