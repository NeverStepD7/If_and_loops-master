
import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    // Look up the documentation for Scanner and what methods are available
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int aa; // first number to compare
        int bb; // second number to compare

        //TODO: Write a Java program to compare two numbers.
        aa = 0;
        bb = 3;
        System.out.println("a = " + aa + "\nb = " + bb);
        boolean laugh = false;
        int cc = bb;
        if (aa < bb){
            for (bb = cc; bb > aa; bb --) {
                laugh = true;
                aa = 9;
                System.out.println("" + aa + "\n" + bb);
            }
        }
        // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero
        // TODO: Otherwise, print "positive" or "negative".
        double desp = 2.4;
        if (desp == 0){
            System.out.println("Zero");
        }
        if (desp != 0){
            System.out.println("Negative this is " + desp);
        }
        desp = 0;


        // TODO: Write a program in Java to display the first 10 natural numbers.
        boolean si = true;
            int number = 0;
            while (si = true) {
                if (number < 11) {
                    System.out.println(number);
                    number += 1;
            }
                else {
                    si = false;
                    System.out.println("From 0 to 10 :3");
                    break;
                }

        }

        // TODO: Write a Java program to reverse a string. Print the before and after.
        System.out.println("Enter your string: ");
        char[] var = input.nextLine().toCharArray();
        for (int i = var.length-1; i>=0; i--) {
            System.out.print(var[i] + "\n");
        }
    }

}
