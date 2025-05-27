public class bitwise 
{
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise operations
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b));   // Bitwise AND
        System.out.println("a | b = " + (a | b));   // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b));   // Bitwise XOR
        System.out.println("~a = " + (~a));         // Bitwise Complement
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
    }
    
}
