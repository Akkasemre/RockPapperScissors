package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {


        int computerScore=0;

        int userScore =0;


        System.out.println("Welcome to Rock-Paper-Scissors game");

        boolean continueGame = true;
       while (continueGame){
           int userChoice = userChoice();
           int computerChoice = computerChoice();

           if(userChoice==computerChoice){
               System.out.println("Draw");
           }else if (
                   (userChoice == 1 && computerChoice == 3) ||
                           (userChoice == 2 && computerChoice == 1) ||
                           (userChoice == 3 && computerChoice == 2)
           ) {
               System.out.println("User Wins");
               userScore++;
           }else {
               System.out.println("Computer Wins");
               computerScore++;
           }

           System.out.println("Computer => " + computerScore + " You => " + userScore);

           System.out.println("Do you want to continue (Y/N)");
           Scanner sc = new Scanner(System.in);
           String choice = sc.nextLine();

           if (choice.equalsIgnoreCase("N")){
               continueGame=false;
           }
       }
    }

    static int userChoice(){
        //Asking user to rock-paper-scissors what they want
        System.out.println(
                "For  rock => 1\n" +
                        "For Paper => 2 \n" +
                        "For Scissors => 3\n" +
                        "For Exit => 0");

        Scanner sc = new Scanner(System.in);
        int usersChoice = sc.nextInt();

        switch (usersChoice){
            case 1:
                // Rock
                System.out.println("Rock");
                System.out.println("    _______");
                System.out.println("---'   ____)");
                System.out.println("      (_____)");
                System.out.println("      (_____)");
                System.out.println("      (____)");
                System.out.println("---.__(___)");
                System.out.println();
                break;
            case 2:
                // Paper
                System.out.println("Paper");
                System.out.println("     _______");
                System.out.println("---'    ____)____");
                System.out.println("           ______)");
                System.out.println("          _______)");
                System.out.println("         _______)");
                System.out.println("---.__________)");
                System.out.println();
                break;
            case 3:

                // Scissors
                System.out.println("Scissors");
                System.out.println("    _______");
                System.out.println("---'   ____)____");
                System.out.println("          ______)");
                System.out.println("       __________)");
                System.out.println("      (____)");
                System.out.println("---.__(___)");
        }
        return usersChoice;
    }

    static int computerChoice(){
       //Pick random number between 1-3

        Random random = new Random();
        int randomNumber = random.nextInt(3)+1;
        System.out.println(randomNumber);

        // Computers randomly choice
        switch (randomNumber){
            case 1:
                //Rock
                System.out.println("Computer choice");
                System.out.println("    _______");
                System.out.println("---'   ____)");
                System.out.println("      (_____)");
                System.out.println("      (_____)");
                System.out.println("      (____)");
                System.out.println("---.__(___)");
                System.out.println();
                break;
            case 2:
                // Paper
                System.out.println("Computer choice");
                System.out.println("     _______");
                System.out.println("---'    ____)____");
                System.out.println("           ______)");
                System.out.println("          _______)");
                System.out.println("         _______)");
                System.out.println("---.__________)");
                System.out.println();
                break;
            case 3:

                // Scissors
                System.out.println("Computer choice");
                System.out.println("    _______");
                System.out.println("---'   ____)____");
                System.out.println("          ______)");
                System.out.println("       __________)");
                System.out.println("      (____)");
                System.out.println("---.__(___)");
        }
        return randomNumber;
    }


}
