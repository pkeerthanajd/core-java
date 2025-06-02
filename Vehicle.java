abstract class car // it is not compulsary a abstract cls should contain abstract methods 
{
    public abstract void drive();
    public void playmusic() //Normal methods 
    {
        System.out.println("playing music...");
    }
    public abstract void fly();
}
class WagonR extends car //concrete methods
{
    public void drive() //must define the abstract methods
    {
        System.out.println("driving...");
    }
        public void fly()
    {
        System.out.println("flying...");
    }
}
public class Vehicle 
{
    public static void main(String[] args) 
    {
        car obj = new WagonR();//you can use the abstract cls reference but not the obj. like new car() it is not possible only the child class must extend 
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
    
}
