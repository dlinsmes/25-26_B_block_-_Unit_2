import java.util.Scanner;
public class Conditionals {
    public static void main(String [] args) {


        //simulate flipping a coin and print the result
        //of heads or tails

        //random number - 1 or 2 - 1 is heads, 2 is tails
        int r = (int)(Math.random() * 2) + 1;

        //conditional statement (if statement)
        //when the condition is true, run the code inside
        //the curly braces
        if (r == 1) {
            System.out.println("heads");
        }
        //the else clause runs when the preceding if condition
        //isn't true
        else {
            System.out.println("tails");
        }

        //else clauses are optional - if you don't have one, there's no different
        //branch of code that would run when the if condition isn't true
        //-any code NOT in an if or else will always run sequentially

        //s is just a variable name - call it what you want
        Scanner s = new Scanner(System.in);

        //prompt the user for 3 different numbers, output the largest of the 3
        System.out.println("enter 3 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = 0;

        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("biggest is " + max);


        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        else {
            //the else is only dependent on the if statement immediately above it
            //-that means regardless of whether a is the largest,
            //max will get set depending on b > a && b > c
            max = c;
        }
        System.out.println("biggest is " + max);


        if (a > b && a > c) {
            max = a;
        }
        //else if allows additional conditions and branches to be checked
        //-only the first condition that's true will trigger its branch of code to run
        //-no other following conditions/branches will check or run
        else if (b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("biggest is " + max);

        //when the code to run inside an if/else is only one line,
        //curly braces aren't necessary
        if (a > b && a > c)
            max = a;

        //this is considered outside and after the if-statement
        //and will always run
            System.out.println("blah");

        //switching from numerical to text input
        s.nextLine();

        String realPW = "12345";
        System.out.println("enter your password");
        String userPW = s.nextLine();

        if (userPW.equals(realPW))
            System.out.println("wow good job i'm so proud of you do you want a coookie??");
        //a string's length is how many characters are in it - int
        //use == bc the length is a number
        else if (userPW.length() == 0)
            System.out.println("you didn't type anything dummy");
        else if (userPW.length() == realPW.length())
            System.out.println("closer but still WRONG");
        else
            System.out.println("WRONG you dumdum");

        System.out.println("enter a number between 10 and 20");
        int uNum = s.nextInt();

        //nested conditionals - if statements can go inside other if statements
        if (uNum > 10) {

            //this will only check when the outer condition (uNum > 10) is true
            if (uNum < 20) {
                System.out.println("your number is between 10 and 20");

            }
            else {
                System.out.println("greater than or equal to 20");
            }
        }
        //runs when uNum > 10 is false
        else {
            System.out.println("less than or equal to 10");
        }

    }
}
