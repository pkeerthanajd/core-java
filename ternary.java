public class ternary 
{
    public static void main(String[] args) {
        int number = 10;

        // Using ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);
    } 
}
