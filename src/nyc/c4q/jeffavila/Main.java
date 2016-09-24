package nyc.c4q.jeffavila;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scenes.sceneOne();
        System.out.println("\n" + "Do you:" + "\n" + "A: Try to go inside?" + "\n" + "B: Go back to your friends's house" + "\n" + "\n" + "(Please choose A or B)");


        boolean isValidInput;
        do {
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("a")) {
                isValidInput = true;
                Scenes.sceneTwo();
            } else if (userAnswer.equals("b")) {
                isValidInput = true;
                Scenes.sceneZero();
            } else {
                isValidInput = false;
                System.out.println("Sorry, that wasn't a valid answer. Can you please try again? (Remember, A or B please)");
            }
        } while (!isValidInput);


        boolean isValidInput2;

        do {
            System.out.println("\n" + "Do you:" + "\n" + "A: Go up the stairs?" + "\n" + "B: Go down the hall" + "\n" + "\n" + "(Please choose A or B)");
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("a")) {
                isValidInput2 = true;
                Scenes.sceneDeadStairs();

            } else if (userAnswer.equals("b")) {
                isValidInput2 = true;
                Scenes.sceneThree();
            } else {
                isValidInput2 = false;
                System.out.println("Sorry, I didn't understand that. Try entering A or B.");
            }
        } while (!isValidInput2);

        boolean isValidInput3;

        do {
            System.out.println("\n" + "Do you:" + "\n" + "A: Go into the lit room?" + "\n" + "B: Go into the dark room" + "\n" + "\n" + "(Please choose A or B)");
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("a")) {
                isValidInput3 = true;
                Scenes.sceneFour();
            } else if (userAnswer.equals("b")) {
                isValidInput3 = true;
                Scenes.sceneFive();
            } else {
                isValidInput3 = false;
                System.out.println("Sorry, I didn't understand that. Try entering A or B.");
            }
        } while (!isValidInput3);

        boolean isValidInput4;

        do {
            System.out.println("\n" + "Do you:" + "\n" + "A: Try to get out through a window?" + "\n" + "B: Get out through the door" + "\n" + "\n" + "(Please choose A or B)");
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("a")) {
                isValidInput4 = true;
                Scenes.sceneSix();
            } else if (userAnswer.equals("b")) {
                isValidInput4 = true;
                Scenes.sceneSeven();
            } else {
                isValidInput4 = false;
                System.out.println("Sorry, I didn't understand that. Try entering A or B.");
            }
        } while (!isValidInput4);

        }




}

