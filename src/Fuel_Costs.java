import java.util.Scanner;

public class Fuel_Costs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double galsInTank = 0;
        double milesPerG = 0;
        double pricePerG = 0;
        String trash = "";
        boolean doneGal = false;
        boolean doneSec1 = false;
        boolean doneSec2 = false;
        boolean doneSec3 = false;

        do
        {
            do
            {
                System.out.print("Enter the number of gallons in your tank: ");
                if (in.hasNextDouble())
                {
                    galsInTank = in.nextDouble();
                    in.nextLine();
                    doneSec1 = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " try again!");
                }
            }while (!doneSec1);

            do
            {
                System.out.print("Enter your miles per gallon: ");
                if (in.hasNextDouble())
                {
                    milesPerG = in.nextDouble();
                    in.nextLine();
                    doneSec2 = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " try again!");
                }
            }while (!doneSec2);

            do
            {
                System.out.print("Enter the price per gallon: ");
                if (in.hasNextDouble())
                {
                    pricePerG = in.nextDouble();
                    in.nextLine();
                    doneSec3 = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " try again!");
                }
            }while (!doneSec3);
            

        }while(!doneGal);
    }
}
