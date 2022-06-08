package open.bruveris.arturs.uzdevums;
import java.util.Scanner;

public class calculator {
    // Sum method for the calculator
    static int sum(int n1, int n2) {
        return n1 + n2;
    }
    // Sub method for the calculator
    static int sub(int n1, int n2) {
        return n1 - n2;
    }
    // Mult method for the calculator
    static int multiply(int n1, int n2) {
        return n1 * n2;
    }
    // Div method for the calculator
    static int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String args[]) {
        Scanner scNum = new Scanner(System.in); // Scanner for numbers
        Scanner scTask = new Scanner(System.in); // Scanner for the task of calculator

        System.out.print("Input first number: ");
        int n1 = scNum.nextInt();
        System.out.print("Input second number: ");
        int n2 = scNum.nextInt();
        System.out.print("Task - summation/subtraction/multiplication/division: ");
        String taskInput = scTask.nextLine();
        String taskForSwitch = taskInput.toLowerCase();

        switch (taskForSwitch) { // Catches the taskForSwitch text and does the appropriate task
            case "summation" -> System.out.println("The summation of " + n1 + " and " + n2 + " is " + sum(n1, n2));
            case "subtraction" -> System.out.println("The subtraction of " + n2 + " from " + n1 + " is " + sub(n1, n2));
            case "multiplication" -> System.out.println("The multiplication of " + n1 + " times " + n2 + " is " + multiply(n1, n2));
            case "division" -> System.out.println("The division of " + n1 + " with " + n2 + " is " + div(n1, n2));
            default -> System.out.println("no such task");
        }
    }
}
