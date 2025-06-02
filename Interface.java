interface A
{
    int age = 21;
    String place = "Chennai";
    void show();
}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Interface 
{
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.show();
    }
    
}
