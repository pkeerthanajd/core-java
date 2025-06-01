
import java.util.Scanner;

class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        age = a;
    }
        public void setName(String name)
    {
        this.name = name;
    }
}
public class encap 
{
    public static void main(String[] args) 
    {
        Human h = new Human();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Name: "); h.setName(s.nextLine());
        System.out.print("Enter the Age: "); h.setAge(s.nextInt());
        System.out.println(h.getName()+" : "+h.getAge());
        
    }
    
}
