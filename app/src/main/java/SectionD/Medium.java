/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SectionD;

public class Medium 
{  
    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }

        for (int i = 2; i * i <= number; i++) 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int limit = 2000000;
        long sum = 0;

        for (int i = 2; i < limit; i++) 
        {
            if (isPrime(i)) 
            {
                sum += i;
            }
        }
        System.out.println("The sum of all prime numbers below 2,000,000 is: " + sum);
    }
}
