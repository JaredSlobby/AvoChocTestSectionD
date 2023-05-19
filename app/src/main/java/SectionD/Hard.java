package SectionD;
import java.util.Scanner;
public class Hard 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        String froogonRepresentation = getFroogonRepresentation(number);

        System.out.println("Output: " + froogonRepresentation);

        scanner.close();
    }

    public static String getFroogonRepresentation(int number) 
    {
        StringBuilder froogon = new StringBuilder();
        int factorial = 1;
        int index = 1;
        //Calculating the Frogoon representation of the number
        while (number > 0) 
        {
            // Extract the current digit by taking modulo of the number
            // with the factorial multiplied by the index
            int digit = (number % (factorial * (index + 1))) / factorial;
            froogon.insert(0, digit + " ");
            // Subtract the digit from the number to proceed to the next iteration
            number -= digit * factorial;
            // Update the factorial and index for the next iteration
            factorial *= (index + 1);
            index++;
        }
        return froogon.reverse().toString().trim();
    }
}
