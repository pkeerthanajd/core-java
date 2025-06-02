abstract class A 
{
    public abstract void show();//abstract method
}

public class Ainner 
{
    public static void main(String[] args) 
    {
        A obj = new A() //New cls but we are not creating a obj of abstract class but it is the of obj. anonymous cls
        {
            public void show() //Overriding
            {
                System.out.println("in show");
            }
        };
        obj.show();
    }

}
