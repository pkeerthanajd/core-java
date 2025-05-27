
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array row size: ");
        int a = s.nextInt();
        System.out.print("Enter the array column size: ");
        int b = s.nextInt();
        int num[][] = new int[a][b];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

}
