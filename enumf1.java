

enum Laptop
{
    MacBook(75000),Samsung(80000),Linux(45000),ThinkPad(50000),Vitrus(60000),HP(47000);
    private int price;
    private Laptop(int price)
    {
        this.price = price;
    }
    public int getPrice() 
    {
        return price;
    }
    public void setPrice(int price) 
    {
        this.price = price;
    }
}
public class enumf1 
{
    public static void main(String[] args) 
    {
        Laptop lap = Laptop.MacBook;
        System.out.println(lap+" : "+lap.getPrice());
        for(Laptop l : Laptop.values())
        {
            System.out.println(l+" : "+l.getPrice());
        }
    }
    
}
