import java.util.Scanner;
public class NestedLoops {
    /*
    warm up
    -with a loop, prompt the user for 5 numbers
    -output the biggest and smallest user numbers
     */
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        //for the initial value of biggest, start with a small number
        //so that the user's inputs should all be bigger than this
        //initial value

        //integer min value is the smallest number an integer variable
        //can hold
        int biggest = Integer.MIN_VALUE;

        //opposite for smallest - start with a big value
        //max value is the largest number an int can hold
        int smallest = Integer.MAX_VALUE;
//        for(int i = 0; i < 5; i++) {
//            System.out.println("give me number");
//            int num = s.nextInt();
//            //if the new input is larger than the old biggest value
//            //update biggest to hold the new largest number
//            if (num > biggest) {
//                biggest = num;
//            }
//            if (num < smallest) {
//                smallest = num;
//            }
//        }
//        System.out.println("biggest is " + biggest);
//        System.out.println("smallest is " + smallest);


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //if you go beyond the range of min or max, the values wrap around
        //to the opposite end
        System.out.println("min value minus 1: " + (Integer.MIN_VALUE - 1));
        System.out.println("max value plus 1: " + (Integer.MAX_VALUE + 1));


        //nested loops
        //loops can go in other loops

        int count = 0;

        for (int i = 0; i < 5; i++) {

            //every iteration of the i loop will make the full
            //j loop run (j = 0 through j < 10)
            for(int j = 0; j < 10; j++) {
                count++;
                System.out.println(count + " - potato, i: " + i + ", j: " + j);
            }
        }

        //outer loop controls how many horizontal rows
        for (int i = 0; i < 4; i++) {

            //inner loop controls the number of elements per row
            for (int j = 0; j < 8; j++) {
                System.out.print("x");
            }
            //println() adds a line break between horizontal rows
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            //the length of each row depends on the changing i value
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 10; i > 0; i--) {
            //rows get smaller since i is now decrementing
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println();
        //goal: get the same output shape as the previous loops
        //but with an incrementing outer loop
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("x");
            }
            System.out.println();
        }









    }
}
