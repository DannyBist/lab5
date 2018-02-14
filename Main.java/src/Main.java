import java.util.Scanner;
// New comment for git lab.

// First input hexadecimal. CHECK
// Convert from lower case to upper case. CHECK
// Read digit place and convert from ASCII table value to integer value. (Might need to use switches again). CHECK
// Make sure "0x" is neglected in calculations. CHECK
// Add all of converted values together in the same loop. CHECK
// Print out final value. CHECK

public class Main {
    public static void main (String [] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter a hexadecimal number: ");
    String input = scnr.nextLine();
    // Successfully have hexadecimal input.

    String upper = input.toUpperCase();
    // Successfully converted input to capital letters.

    int upperLength = upper.length();
    // Successfully found length of string, which now can be used for loop condition.

    long fConv = 0;

    for (int y = (upperLength); y > 0; y--)   {
        int f = upperLength - y;
        char x = upper.charAt(y-1);
        int val = 0;
        switch (x) {
            case '1':
                val = 1;
                break;
            case '2':
                val = 2;
                break;
            case '3':
                val = 3;
                break;
            case '4':
                val = 4;
                break;
            case '5':
                val = 5;
                break;
            case '6':
                val = 6;
                break;
            case '7':
                val = 7;
                break;
            case '8':
                val = 8;
                break;
            case '9':
                val = 9;
                break;
            case 'A':
                val = 10;
                break;
            case 'B':
                val = 11;
                break;
            case 'C':
                val = 12;
                break;
            case 'D':
                val = 13;
                break;
            case 'E':
                val = 14;
                break;
            case 'F':
                val = 15;
                break;
            case 'X':
                val = 0;
                break;
        }
        // Successfully converted ASCII table values to appropriate integer values.
        double adding = Math.pow(16, f) * val;
        fConv += adding;
    }
    System.out.print("Your number is " + fConv + " in decimal");
    }
}
