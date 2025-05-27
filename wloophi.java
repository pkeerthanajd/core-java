public class wloophi
{
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while(i<=4)
        {
            System.out.println("hi "+i);
            i++;
            // int j = 1; i can't access this line so made the changes 
            while(j<=3)
            {
                System.out.println("hello "+j);
                j++;
            }
        }
        System.out.println("bye "+i);
        System.out.println("Tata "+j);
    }
    
}
