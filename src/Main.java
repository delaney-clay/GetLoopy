import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        for(int c = 0; c < 31; c++)
        {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for(int c = 30; c >= 0; c--)
        {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for(int c = 0; c < 19; c += 3)
        {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for(int c = 10; c >= 0; c -= 2)
        {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for(int row = 1; row <= 5; row ++)
        {
            for(int column = 1; column <= 5; column++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}