
package quizapp;

import java.util.Scanner;

/**
 *
 * @author Oliver Qian
 */
public class QuizApp {

    public static void main(String[] args) {
       double score = 0;
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("Which team won the 2020 Champions League?");
        String answer1 = kboard.nextLine();
        if (answer1.trim().equalsIgnoreCase("Bayern Munich")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else if (answer1.equals ("Spurs")) {
            score=score+6;
            System.out.println("Wrong, but I like that answer.");
        }
        else {
            System.out.println("Incorrect!");
            System.out.println("Try again.");
             System.out.println("Which team won the 2020 Champions League?");
             String answer6 = kboard.nextLine();
        if (answer6.trim().equalsIgnoreCase("Bayern Munich")){
            // give them half a point
            score=score+.5;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong Again!");
        }
        }
        //Questions 2 through 5
         System.out.println("Who scored the only goal in that final?");
        String answer2 = kboard.nextLine();
        if (answer2.trim().equalsIgnoreCase ("Kingsly Coman")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
             System.out.println("Try again.");
              System.out.println("Who scored the only goal in that final?");
        String answer7 = kboard.nextLine();
        if (answer7.trim().equalsIgnoreCase ("Kingsly Coman")){
            // give them half a point
            score=score+.5;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong Again!");
        }
        }
         System.out.println("What team did Bayern beat in the final?");
        String answer3 = kboard.nextLine();
        if (answer3.trim().equalsIgnoreCase ("PSG")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
             System.out.println("Try again.");
              System.out.println("What team did Bayern beat in the final?");
        String answer8 = kboard.nextLine();
        if (answer8.trim().equalsIgnoreCase ("PSG")){
            // give them half a point
            score=score+.5;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wong Again!");
        }
        }
         System.out.println("Who was Bayern's top scorer in the 2020 Champions League?");
        String answer4 = kboard.nextLine();
        if (answer4.trim().equalsIgnoreCase ("Robert Lewandowski")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
             System.out.println("Try again.");
              System.out.println("Who was Bayern's top scorer in the 2020 Champions League?");
        String answer9 = kboard.nextLine();
        if (answer9.trim().equalsIgnoreCase ("Robert Lewandowski")){
            // give them half a point
            score=score+.5;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong Again!");
        }
        }
         System.out.println("Which team did Bayern beat 8-2 on the way to the final?");
        String answer5 = kboard.nextLine();
        if (answer5.trim().equalsIgnoreCase ("Barcelona")){
            // give them a point
            score++;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
             System.out.println("Try again.");
              System.out.println("Which team did Bayern beat 8-2 on the way to the final?");
        String answer10 = kboard.nextLine();
        if (answer10.trim().equalsIgnoreCase ("Barcelona")){
            // give them half a point
            score=score+.5;
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong Again!");
        }
        }
        //Tell user their score
        System.out.println("Your final score is "+score+"/5.");
    }
    
}
