import java.util.Scanner;
public class Main {
    public static void main(StringInterpolation[] args) {
//This is my first java program
        /*
        * This is a multiline comment
        * */

        System.out.println("I Like Pizza");
        System.out.print("Its really good");
        System.out.print("Buy me pizza");
        System.out.println("Just type SOUT to get println ");

        int age = 30;
        int year = 2025;
        double quantity = 1.5;

        System.out.println("The year is " + year);

        boolean isStudent = true;

        if(isStudent == true){
            System.out.println("I Like Pizza");
            System.out.print("Its really good");
            System.out.println("You are a student");
        }
        else {
            System.out.println("Your are not a student");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
       String name = scanner.nextLine();
        System.out.println("Hello" + name);

        System.out.println("What is your age?");
        int ages = scanner.nextInt();
        System.out.println("Your age is" + ages);

        scanner.close();


        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner2 = new Scanner(System.in);



        scanner2.close();




    }

}
