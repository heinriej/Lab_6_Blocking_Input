import java.util.Scanner;

public class Rectangle_Info
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal1 = 0;
        double diagonal2 = 0;
        boolean rectangleDone = false;
        boolean widthDone = false;
        boolean heightDone = false;
        String trash = "";

        do
        {
            do
            {
                System.out.print("Enter the width of the rectangle: ");
                    if (in.hasNextDouble())
                    {
                        width = in.nextDouble();
                        in.nextLine();
                        widthDone = true;
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You entered " + trash + " try again!");
                    }
            }while(!widthDone);

            do
            {
                System.out.print("Enter the height of the rectangle: ");
                if (in.hasNextDouble())
                {
                    height = in.nextDouble();
                    in.nextLine();
                    heightDone = true;
                    rectangleDone = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " try again!");
                }
            }while(!heightDone);
        }while(!rectangleDone);

        area = width * height;
        perimeter = (width + height) * 2;
        diagonal1 = (width * width) + (height * height);
        diagonal2 = Math.sqrt(diagonal1);
        System.out.println("The area of your rectangle is " + area);
        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The diagonal of your rectangle is " + diagonal2);
    }
}
