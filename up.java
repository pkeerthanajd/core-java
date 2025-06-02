class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
        public void show1()
    {
        System.out.println("In B show");
    }
}
public class up 
{
    public static void main(String[] args) 
    {
        A obj = new B(); //UPCASTING
        obj.show(); //It obj reference pointing towards A it don't have visibility of B
        B obj1 = (B) obj; //DOWNCASTING 
        obj1.show1();//It have visibility of show1(class B) also show (Class A) 
        
    }
    
}
