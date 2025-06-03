class hi extends Thread 
{
    public void run() //method name must be run
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class hello extends Thread 
{
    public void run() 
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class IntroThreads 
{
    public static void main(String[] args) 
    {
        hi obj = new hi();
        hello obj1 = new hello();
        obj.start(); //method calling must be start()
        obj1.start();
    }
}
