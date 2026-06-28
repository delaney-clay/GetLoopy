import java.util.Random;
import java.util.Scanner;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
import static java.lang.System.out;

public class DieRoller
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        boolean done = false;
        String trash = "";
        String continuePlay = "";

        do
        {
            int die1 = 0;
            int die2 = 1;
            int die3 = 2;
            int sum = die1 + die2 + die3;
            int roll = 0;
            System.out.println("Roll\t\tDie 1\tDie 2\tDie 3\tSum");
            System.out.println("-------------------------------------------");

            while(die1 != die2 || die2 != die3)
            {
                roll++;
                die1 = generator.nextInt(6)+1;
                die2 = generator.nextInt(6)+1;
                die3 = generator.nextInt(6)+1;
                sum = die1 + die2 + die3;

                System.out.printf("Roll: %1d %7d %7d %7d %7d\n", roll, die1, die2, die3, sum);
            }
            System.out.print("Would you like to continue? [Y/N]: ");
            continuePlay = in.nextLine();
            do
            {
                done = false;
                if(continuePlay.equalsIgnoreCase("Y"))
                {
                    done = false;
                }
                else if(continuePlay.equalsIgnoreCase("N"))
                {
                    done = true;
                }
                else
                {
                    System.out.print("Invalid input. Please enter Y or N. ");
                    continuePlay = in.nextLine();
                    done = false;
                    continue;
                }
                done = true;
            }while (!done);
        }while (!continuePlay.equalsIgnoreCase("N"));
    }
}
