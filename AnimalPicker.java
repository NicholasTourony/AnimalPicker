import java.util.Scanner;
public class AnimalPicker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean correctInput = true;
        do
        {
            System.out.print("Would you like to see a dog, a cat, a fish, or a shark? ");
            String answer = scanner.nextLine();

            if (answer.equals("dog"))
            {
                System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/\n");
                correctInput = true;
            }
            else if (answer.equals("cat"))
            {
                System.out.println(" /\\_/\\\n( o.o )\n > ^ <");
                correctInput = true;
            }
            else if (answer.equals("fish"))
            {
                System.out.println(".            ,\n           .:/\n.      ,,///;,   ,;/\n  .   o:::::::;;///\n     >::::::::;;\\\\\\\n       \'\'\\\\\\\\\\\'\" \';\\\n          \';\\");
                correctInput = true;
            }
            else if (answer.equals("shark"))
            {
                System.out.println("      .            \r\n\\_____)\\_____\r\n/--v____ __`<         \r\n        )/           \r\n        '");
                correctInput = true;
            }
            else
            {
                System.out.println("Error: you must enter \"dog\" or \"cat\"");
                correctInput = false;
            }
        } while (!correctInput);
        scanner.close();
    }
}