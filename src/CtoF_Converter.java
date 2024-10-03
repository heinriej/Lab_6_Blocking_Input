import java.util.Scanner;

public class CtoF_Converter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        boolean doneTemp = false;
        String trash = "";


        do
        {
            System.out.print("Enter your temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = (celsius * 1.8) + 32;
                doneTemp = true;
                System.out.println("Your temperature in Fahrenheit is " + fahrenheit);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " try again!");
            }

        }while(!doneTemp);
    }
}