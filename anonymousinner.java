class A
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class anonymousinner 
{
    public static void main(String[] args) 
    {
        A obj = new A() //Anonymous inner-class
        {
            public void show() //this will not create no new class file since it is called anonymous inner-class
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }

}
