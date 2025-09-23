import java.util.Scanner;
public class ValidationLoops {
    /*
    An apple costs $5, a banana costs $10
    -ask the user whether they want an apple or banana
    -if they input the wrong item, continue asking them
    until they put in something correct
    -after a valid input is received, print the cost of the item
     */
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("apple or banana?");
        String choice = s.nextLine();
        //want to continue asking when the input is invalid
        //valid: choice.equals("apple") || choice.equals("banana")
        //invalid: !( choice.equals("apple") || choice.equals("banana") )
        //demorgan equaivalent: !choice.equals("apple") && !choice.equals("banana")
        while(!( choice.equals("apple") || choice.equals("banana") ) ) {
            System.out.println("wrong thing you dummy");
            System.out.println("apple or banana?");

            //important - update choice so that the condition will
            //eventually evaluate to false
            choice = s.nextLine();
        }

        //choice is guaranteed to be apple or banana after the loop
        if (choice.equals("apple"))
            System.out.println("$5");
        else
            System.out.println("$10");

        System.out.println("how many do you want? Enter a number between 1 and 10");
        int num = s.nextInt();
        //works:  num < 1 || num > 10
        while( !(num >= 1 && num <= 10) ) {
            System.out.println("wrong number");
            System.out.println("how many do you want? Enter a number between 1 and 10");
            num = s.nextInt();
        }
        //print the total cost for the quantity of their chosen item
        if (choice.equals("apple"))
            System.out.println(num + " apples costs $" + 5*num);
        else
            System.out.println(num + " bananas costs $" + 10*num);
    }
}
