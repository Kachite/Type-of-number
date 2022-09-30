import java.util.Scanner;

public class Property {
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        String signCheck;
        String parityCheck;
        String lengthCheck;

        if (number >= 1000 || number <= -1000) {
            System.out.println("Number may be from -999 to 999");
            System.exit(0);
        }

        // For signCheck
        if (number < 0) {
            signCheck = "Negative";
        } else if (number == 0) {
            signCheck = "Zero";
        } else {
            signCheck = "Positive";
        }

        // For parityCheck
        if (number % 2 == 0) {
            parityCheck = "even";
        }
        else {
            parityCheck = "odd";
        }

        // To check the length of the input
        int len = 0;
        number = Math.abs(number);

        while (number != 0) {
            len++;
            number = (int) number / 10;
        }
        if (len == 1) {
            lengthCheck = "single digit";
        }
        else if (len == 2) {
            lengthCheck = "two-digit";
        }
        else if (len == 3) {
            lengthCheck = "three-digit";
        }
        else {
            lengthCheck = "zero";
        }

        AnswerFunction(signCheck,parityCheck,lengthCheck);
    }
    private static void AnswerFunction(String signCheck, String parityCheck, String lengthCheck) {
        if (lengthCheck == "zero") {
            System.out.println("zero number");
        }
        else {
            System.out.println(signCheck + " " + parityCheck + " " + lengthCheck + " " + "number");
        }
    }

}
