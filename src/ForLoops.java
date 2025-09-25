import java.util.Scanner;
public class ForLoops {
    public static void main(String [] args) {
    /*
    warm up
    ask the user for numbers until they put in zero
    then print the sum of their numbers
     */
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int num = s.nextInt();
        int sum = 0;
        while(num != 0) {
            sum += num;
            System.out.println("enter a number");
            num = s.nextInt();
        }
        System.out.println("the sum of your numbers is " + sum);

        //while loops are condition-based - the number of times
        //the loop runs depends on a condition being true
        //for loops are iteration-based - the number of times
        //the loop runs can be predetermined (before the loop starts)

        //parts of a for loop
        //initialization - int i = 0 - declare an int variable with a value
        //condition - i < 10 - loop runs as long as the condition is true
        //increment/advancement - i++ - after every iteration (turn) of the
        //loop, this step changes the i value so that eventually the condition
        //becomes false to stop the loop
        for (int i = 0; i < 10; i++) {
            //print() will output on the same line
            System.out.print(i + " ");
            //last number output is 9 bc when i becomes 10, the condition
            //is no longer true
        }

        System.out.println();

        //the scope of the i variable is only within the for loop
        //System.out.println(i);

        //-can keep using i as the variable name for other for loops

        //the advancement step doesn't only need to add 1
        for (int i = 0; i < 10; i += 2)
            System.out.print(i + " ");

        System.out.println();

        //count down from 20 to 15
        for (int i = 20; i > 14; i--)
            System.out.print(i + " ");

        System.out.println();

        //for loops can always be written as while loops
        int x = 20;                     //initialization
        while (x > 14) {                //condition
            System.out.print(x + " ");
            x--;                        //advancement
        }

        //while loops can't always be easily rewritten as for loops
        //-if the condition is not based on a number of times to run,
        //it's hard to know when to stop
        //ex - warm up problem

        //ask the user for a number, then a bigger number
        //calculate and output the sum of values between their two numbers
        System.out.println("give me a number");
        int num1 = s.nextInt();
        System.out.println("give me a bigger number");
        int num2 = s.nextInt();
        sum = 0;
        //i is iterating through all values [num1, num2]
        for (int i = num1; i < num2 + 1; i++)
            sum += i;
        System.out.println("sum of values between " + num1 + " and " + num2
        + " is " + sum);

        //prompt the user for a prime number
        //test and output whether it's actually prime
        //a prime number is only divisible by itself and 1
        System.out.println("give me a prime number");
        int uNum = s.nextInt();


        boolean isPrime = true;
        //test divisibility by every number [2, uNum)
        //if divisible by any of those numbers, not prime

        for (int i = 2; i < uNum; i++) {
            if (uNum % i == 0) {
                //if the number is divisible by an i value
                isPrime = false;
            }
            //don't set isPrime back to true bc once a number is
            //proven to be not prime, that status can't change
        }
        //same as isPrime == true
        if(isPrime)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");
    }
}
