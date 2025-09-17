import java.util.Scanner;
public class VariableScope {
    public static void main(String [] args) {
        //warm up
        //prompt for two numbers
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a number");
        int num1 = s.nextInt();
        System.out.println("Enter another number");
        int num2 = s.nextInt();

        //prompt for a word
        s.nextLine();
        System.out.println("Enter a word");
        String word = s.nextLine();

        //can compare the word length to both nums to make sure
        //it's smaller than both

        //in order to use smallest and biggest for later comparisons,
        //need to declare them outside of the if statements
        int smallest = num2;
        int biggest = num1;

        if (num2 > num1) {
            smallest = num1;
            biggest = num2;
        }

        //declare r before the if statements in order to use
        //its value after all the if statements
        int r = 0;

        //-if the word size is smaller than the smaller num,
        if (word.length() < smallest) {
            //generate an even number 2-10

            //generate [1,5], then multiply by 2
            r = (int)(Math.random() * 5 + 1) * 2;
        }
        //-if the word size is bigger than the bigger num,
        if (word.length() > biggest) {
            //generate an odd number 1-9

            //generate even [0,4], multiply by 2, then add 1
            r = (int)(Math.random() * 5) * 2 + 1;
        }
        //-if the word size is between (inclusive) the two nums,
        if (word.length() <= biggest && word.length() >= smallest) {
            //generate a negative num
            r = -(int)(Math.random() * 10 + 1);
        }
        //print the generated number
        System.out.println(r);

        //variable scope - a variable is only accessible in the
        //location where it's declared

        //since b is declared in main(), it can be accessed
        //anywhere after the declaration in main(), including
        //inside any if/else statements
        int b = 20;

        if (num1 < 10) {
            //since a is declared in this if-statement, it doesn't
            //exist outside of the if statement
            int a = 8;
            System.out.println(a);
            System.out.println(b);

            int c = 30;
            System.out.println(c);
        }

        else {
            //a exists in the if, but not the else
            //System.out.println(a);

            //this is a different int c from the one in the if
            int c = 40;
            System.out.println(c);
        }


        //the var a does not exist outside of the if
        //System.out.println(a);

        //since b is declared in main(), you can use it inside
        //main(), including after any if/else statements
        System.out.println(b);


    }
}
