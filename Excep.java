// public class Excep 
// {
//     public static void main(String[] args) {
//         int i = 0;
//         int j = 0;

//         try  //Exception handling
//         {
//             j = 18/i;
//         }
//         catch(Exception e)//Here Exception is a class and e is the object 
//         {
//             System.out.println("Something went wrong");
//         }
//         System.out.println(j);
//         System.out.println("Byee");
//     }
// }
// -----------------------------------------------------------------------------------------------------------------------------------------------
// public class Excep 
// {
//     public static void main(String[] args) {
//         int i = 0;
//         int j = 0;
//         int nums[] = new int[5];
//         try  //Exception handling
//         {
//             j = 18/i;
//             System.out.println(nums[1]);
//             System.out.println(nums[5]);
//         }
//         catch(ArithmeticException e) //extends Runtime which again extends a Exception
//         {
//             System.out.println("Can't divide by zero"); //NOTE only one exception is handled at a time per try block.
//         }
//         catch(ArrayIndexOutOfBoundsException e) //extends Runtime which again extends a Exception
//         {
//             System.out.println("Exceed the array bound limit");
//         }
//         catch(Exception e)//Exception is a PARENT CLASS so it should be at the bottom and also Exception extends throwable
//         {
//             System.out.println("Something went wrong");
//         }
//         System.out.println(j);
//         System.out.println("Byee");
//     }
// }
// -----------------------------------------------------------------------------------------------------------------------------------------------
public class Excep 
{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try  //Exception handling
        {
            j = 18/i;
            if(j==0)
            {
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e) //extends Runtime which again extends a Exception
        {
            j = 18/1;
            System.out.println("this is the default output"); //NOTE only one exception is handled at a time per try block.
        }
        catch(Exception e)//Exception is a PARENT CLASS so it should be at the bottom and also Exception extends throwable
        {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Byee");
    }
}