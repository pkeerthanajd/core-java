public class unary {
    public static void main(String[] args) 
    {
        int a = 5;
        boolean flag = true;

        // Unary operations on integer
        System.out.println("a = " + a);
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("--a = " + (--a));
        System.out.println("a-- = " + (a--));
        System.out.println("Final value of a = " + a);

        // Unary operation on boolean
        System.out.println("\nflag = " + flag);
        System.out.println("!flag = " + (!flag));
    }
}
