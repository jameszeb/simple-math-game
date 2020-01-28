

import java.util.Scanner;//imported library scanner

public class SimpleMathGame {
    public static void main(String[] args) {
        int x = (int) (19 * Math.random()+1);//rng 1-20
        int y = (int) (19 * Math.random()+1);//rng 1-20
        Scanner s = new Scanner(System.in);// scanner object initialized
        System.out.print("Enter your name: ");//asks for name
        String userName = s.nextLine();//assigned name as value to String
        System.out.println("Welcome " + userName + "! Please answer the following questions: ");//welcome statement
        int counter = 0;//counter initialized

        System.out.println(x + " + " + y + " = ");// x+y
        if (s.nextInt() == x + y) {//if else statements with counter if correct
            System.out.println("Correct!");
            counter++;//counter adds
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + (x + y));
        }

        System.out.println(x + " * " + y + " = ");// ****** multiplication
        if (s.nextInt() == x * y) {// if answer == rng * rng
            System.out.println("Correct!");
            counter++;

        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + (x * y));
        }

        System.out.println(x + " / " + y + " = ");//    //// divide
        if (s.nextInt() == x / y) {
            System.out.println("Correct!");
            counter++;

        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + (x / y));
        }

        System.out.println(x + " % " + y + " = "); // modulus %%% remainder
        if (s.nextInt() == x % y) {
            System.out.println("Correct!");
            counter++;

        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + (x % y));
        }

        System.out.println("You got " + counter + " correct answers");//counter adds up correct answers.

        double percentage = 100 * counter / 4; // double used to add decimal to the answer for percentage
        System.out.println("That's " + percentage + "%!");

    }

}