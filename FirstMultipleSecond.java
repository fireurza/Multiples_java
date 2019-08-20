import java.util.Scanner;

/**
 *
 * @author Aaron Kurth
 */
public class Multiple
{
    public static void main(String[] args) {
        //Getting User Input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        
        //declaring first variable, converting the user input to an int and placing the value in the variable
        int numOne = userInput.nextInt();
        System.out.println("Enter the second number: ");
        
        //declaring second variable, converting the user input to an int and placing the value in the variable
        int numTwo = userInput.nextInt();
        
        //close the user input scanner
        userInput.close();
        
        //checks if numTwo can go into numOne without a remainder. No remainder means numOne is a multiple of numTwo
        if (numOne % numTwo ==0)
        {
            System.out.format("%d is a multiple of %d%n", numOne, numTwo);
        }
        else
        {
            System.out.format("%d is not a multiple of %d%n", numOne, numTwo);
        }
    }
    
}
