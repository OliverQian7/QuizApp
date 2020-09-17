
package quizapp;

import java.util.Scanner;

/**
 *
 * @author Oliver Qian
 */
public class QuizApp {

    public static void main(String[] args) {
       int score = 0;
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("Which team won the 2020 Champions League?");
        String answer1 = kboard.nextLine();
        if (answer1.equals ("Bayern Munich")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
        //Questions 2 through 5
         System.out.println("Who scored the only goal in that final?");
        String answer2 = kboard.nextLine();
        if (answer2.equals ("Kingsly Coman")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
         System.out.println("What team did Bayern beat in the final?");
        String answer3 = kboard.nextLine();
        if (answer3.equals ("PSG")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
         System.out.println("Who was Bayern's top scorer in the 2020 Champions League?");
        String answer4 = kboard.nextLine();
        if (answer4.equals ("Robert Lewandowski")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
         System.out.println("Which team did Bayern beat 8-2 on the way to the final?");
        String answer5 = kboard.nextLine();
        if (answer5.equals ("Barcelona")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
        //Tell user their score
        System.out.println("Your final score is "+score+".");
    }
    
}
