import java.util.Scanner;
public class WhileLoops {

    public static void main(String [] args) {
      /*
      warm up
    Generate random [1,10]
    -when even set word to apple
    -when odd set word to potato
    -when more than 5 add s to end of word
    -when more than 8 add "many " to front of word
    print number and word
     */
        int r = (int)(Math.random() * 10 + 1);
        String word = "fdsafdsaf";
        if (r % 2 == 0)
            word = "apple";
        else
            word = "potato";

        if (r > 5)
            word += "s";
        if (r > 8)
            word = "many " + word;
        System.out.println(r + " " + word);

        //loops let us repeat lines of code
        //while loops are like repeating if statements in that
        //they run the designated code when the condition is true
        //-after each loop iteration (turn) the condition checks again
        //to determine whether the looped code runs again

        int x = 0;

        while (x < 5) {
            System.out.println(x);

            //adds 1 to x
            x++;
        }
        //the last number printed is 4 bc after that, x increments
        //to 5, but then the condition is no longer true
        System.out.println("outside the loop x is " + x);

         x = 0;
         while (x < 5) {
             x++;

             //when x starts at 4 and increments to 5, the body
             //of the loop still runs (prints 5) before the condition
             //gets checked again

             System.out.println(x);
         }
         //this prints 1-5

        //infinite loops - bad
        x = 0;
//        while (x < 5)
//            System.out.println(x);

        //it's important to make sure that the loop can eventually terminate
        //by including a line that will eventually make the condition false

        //any code after an infinite loop would never get reached

        System.out.println("hi");

        //typically use while loops when you can't determine how many
        //times it needs to iterate

        //count how many times we need to generate a random number [1,50]
        //until we get 38

        int count = 0;
        int rand = 0;
        while (rand != 38) {
            count++;
            rand = (int)(Math.random() * 50 + 1);
        }
        System.out.println("it took " + count + " tries to get to 38");

        Scanner s = new Scanner(System.in);
        //continue prompting the user for numbers 1, 2, or 3 and keep going if they
        //do it correctly,
        //-stop if they put in any other number

        System.out.println("enter 1 or 2 or 3");
        int num = s.nextInt();
        while (num == 1 || num == 2 || num == 3) {
            System.out.println("enter 1 or 2 or 3");
            num = s.nextInt();
        }
        System.out.println("done");


        //don't do - while(true) and break will get deductions
        System.out.println("enter 1 or 2 or 3");
        num = s.nextInt();
        while (true) {
            if (num == 1 || num == 2 || num == 3) {
                System.out.println("enter 1 or 2 or 3");
                num = s.nextInt();
            }
            else
                break; //immediately exits the loop
        }
    }
}
