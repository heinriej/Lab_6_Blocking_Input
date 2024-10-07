import java.util.Random;
import java.util.Scanner;

public class High_Or_Low
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int guess = 0;
        boolean doneGuess = false;
        boolean doneCorrect = false;
        String trash = "";

        do
        {
            System.out.print("Guess the random number [1-10]: ");
            if (in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();
                if (guess > val & guess <= 10)
                {
                    System.out.println("Your guess " + guess + " was too high! The correct number was " + val);
                    doneCorrect = true;
                    doneGuess = true;
                }
                else if (guess < val & guess >= 1)
                {
                    System.out.println("Your guess " + guess + " was too low! The correct number was " + val);
                    doneCorrect = true;
                    doneGuess = true;
                }
                else if (guess >= 11 || guess <= -1)
                {
                    System.out.println("Your guess " + guess + " is not in bounds!");
                }
                else
                {
                    System.out.println("Your guess " + guess + " was correct! The correct number was " + val);
                    doneCorrect = true;
                    doneGuess = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " try again!");
            }
        }while(!doneGuess);

    }
}
