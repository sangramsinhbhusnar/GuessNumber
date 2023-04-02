//Task 2: Program to Guess the Number Game.
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int guess_answer;
        int guess_number;
        char ch = 'N';
        int max = 100;
        int count = 0;

        boolean state = false;

        // Scanner class to input the number
        Scanner sc = new Scanner(System.in);

        // Random class to select the random number from 1 to 100
        Random r = new Random();
        guess_answer = r.nextInt(max) + 1;
        System.out.println(guess_answer);

        // It will show the Tips Of the Guess the Number Game
        System.out.println("****** Guess The Number ******");
        System.out.println("Tips :\n ");
        System.out.println("1.You Have only 5 Trials.");
        System.out.println("2.You have Gess the number in 5 trials.");
        System.out.println("3.Number is Between 1 and 100.");

        System.err.println("\n \n \n To, Play PRESS (Y)");
        ch = sc.next().charAt(0);

        // Main Logic using if and while loop
        if (ch == 'Y' || ch == 'y') {
            while (count < 5 && state == false) {
                System.out.println("Enter the Number: ");
                guess_number = sc.nextInt();
                count += 1;

                if (guess_number < guess_answer)
					{ // To Check the number is small
                    System.out.println("Number Enterd is Small !!");
                } else if (guess_number > guess_answer) { // To Check the number is large
                    System.out.println("Number Entered is Large !!");
                } 
else 
				{
                    System.out.println("Congactulation, You Win !!");
                    state = true;
                }
            }
            if (count == 5 && state == false) {
                System.out.println("Sorry, You Fail \n Please, Try Again !!");
            }
        }

        sc.close(); // scanner close
    }

}