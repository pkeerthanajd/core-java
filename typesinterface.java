// @FunctionalInterface
// interface A //functional interface (1 method)
// {
//     void show();
// }
// public class typesinterface 
// {
//     public static void main(String[] args) 
//     {
//         A obj = new A() 
//         {
//             public void show()//Anonymous cls
//             {
//                 System.out.println("in show");
//             }
//         };
//     } 
// }
// ----------------------------------------------------------------------------------------------------------------------------------------------
// @FunctionalInterface //LAMBDA EXPRESSION FOR NO ARGUMENT
// interface A //functional interface (1 method)
// {
//     void show();
// }
// public class typesinterface 
// {
//     public static void main(String[] args) 
//     {
//         A obj = () -> System.out.println("in show"); //no argument and LAMBDA EXPRESSION
//         obj.show();
//     } 
// }
// ----------------------------------------------------------------------------------------------------------------------------------------------
@FunctionalInterface //LAMBDA EXPRESSION FOR WITH ARGUMENT
interface A //functional interface (1 method)
{
    void show(int i);
}
public class typesinterface 
{
    public static void main(String[] args) 
    {
        A obj = i -> System.out.println("in show "+i); //no argument and LAMBDA EXPRESSION
        obj.show(5);
    } 
}
// ----------------------------------------------------------------------------------------------------------------------------------------------
