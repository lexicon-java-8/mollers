package se.kibar;

import java.util.Random;
import java.util.Scanner;

public class StefanAssignments {

    private Scanner scanner = new Scanner(System.in);

    public void ovning4() {
        int num1;
        int num2;
        int answer;
        String temp;
        String proceed = "ja";
        boolean correctInput = false;

        while (proceed.equalsIgnoreCase("ja")) {
            correctInput = false;
            System.out.println("Nämn två heltal, tack!");
            num1 = scanner.nextInt();
//        num2 = Integer.parseInt(scanner.nextLine().trim());
            temp = scanner.nextLine();
            temp = temp.trim();

//        boolean test = (temp.equals("13"));
//        System.out.println(test);

            num2 = Integer.valueOf(temp);

            System.out.print("Vad blir summan av " + num1 + "+" + num2 + "?");
            answer = scanner.nextInt();

            //to empty the buffer
            scanner.nextLine();

            if (answer == num1 + num2) {
                System.out.println("Fantastiskt, strålande och enastående!!!");
            } else {
                System.out.println("You lose!");
            }

            while (!correctInput) {
                System.out.println("Vill du köra en till omgång?");
                proceed = scanner.nextLine();

                if (proceed.equalsIgnoreCase("ja") || proceed.equalsIgnoreCase("nej")) {
                    correctInput = true;
                } else {
                    System.out.println("Felaktig inmatning, vänligen svara ja eller nej.");
                }
            }
        }

    }

    public void ovning45() {

        //the classic method: Math.random() found in many languages
        double random = Math.random();

        //The Java-specific class Random
        Random rand = new Random();

        int num1 = rand.nextInt(100)+1;
        int num2 = rand.nextInt(100)+1;
        int answer = 0;
        int input = 0;

        System.out.println("Vilken operation?");

        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                answer = num1 + num2;
                System.out.println("Vad blir " + num1 + "+" + num2 + "?");
                input = scanner.nextInt();
                scanner.nextLine();

                break;
            case "-":
                answer = num1 - num2;
                System.out.println("Vad blir " + num1 + "-" + num2 + "?");
                input = scanner.nextInt();
                scanner.nextLine();

                break;
            default:
                System.out.println("Invalid input, only +/- allowed.");
                break;
        }

        if(answer == input){
            System.out.println("Grattis!");
        }else{
            System.out.println("Försök igen!");
        }

    }
}
