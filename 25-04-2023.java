
// This is a Java program to reverse the digits of a number.

// Define a public class named Main
public class Main {
    // Define a static method that takes an integer as input and returns the reversed integer.
    static int reverseDigits(int num) {
        // Initialize a variable named reversedNum to 0.
        int reversedNum = 0;
        // Use a while loop to reverse the digits of the input number.
        while (num > 0) {
            // Multiply reversedNum by 10 and add the last digit of the input number to it.
            reversedNum = reversedNum * 10 + num % 10;
            // Remove the last digit from the input number.
            num = num / 10;
        }
        // Return the reversed number.
        return reversedNum;
    }
   
    // Define the main method.
    public static void main(String[] args) {
        // Initialize an integer variable named num to 4562.
        int num = 4562;
        // Print the message "Reverse of no. is" followed by the reversed number.
        System.out.println("Reverse of no. is " + reverseDigits(num));
    }
}

