import java.util.Arrays;
import java.util.Scanner;

public class onedarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) 
        {
            System.out.print("Enter the array elements arr["+i+"]: ");
            nums[i] = s.nextInt();
        }
        System.out.println("The array is "+Arrays.toString(nums));
        
    }
}
