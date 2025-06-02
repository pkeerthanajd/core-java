class A //outer class can't be a static class
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }
    class B //inner class can be static method 
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}
public class Inner 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); //for non-static methods we use obj.new but for static methods we use A.B 
        obj1.config();
    }
}
