package SectionD;
import java.util.Scanner;
public class Easy 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the total laps: ");
        int totalLaps = scanner.nextInt();

        scanner.close();

        int[] initialTimes = {3, 5, 7};
        int[] currentTimes = initialTimes.clone();

        int totalTime = 0;

        for (int lap = 0; lap < totalLaps; lap++) 
        {
            int runnerIndex = findRunnerIndexWithShortestTime(currentTimes);
            totalTime += currentTimes[runnerIndex];
            currentTimes[runnerIndex] += 1;
        }
        System.out.println("Total running time is " + totalTime + " minutes.");
    }

    private static int findRunnerIndexWithShortestTime(int[] currentTimes) 
    {
        int shortestTime = Integer.MAX_VALUE;
        int runnerIndex = -1;

        for (int i = 0; i < currentTimes.length; i++) 
        {
            if (currentTimes[i] < shortestTime) 
            {
                shortestTime = currentTimes[i];
                runnerIndex = i;
            }
        }
        return runnerIndex;
    }
}
