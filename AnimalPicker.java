import java.util.Scanner;
public class AnimalPicker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to see a dog or a cat: ");
        String answer = scanner.nextLine();
        if (answer.equals("dog"))
        {
            System.out.println("DOG ASCII ART HERE");
        }
        else if (answer.equals("cat"))
        {
            System.out.println("CAT ASCII ART HERE");
        }
    }
}