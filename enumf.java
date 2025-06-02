enum Status 
{
    Running,Pending,Failed,Success;
}

public class enumf 
{
    public static void main(String[] args) 
    {
        Status s = Status.Running;
        switch(s)
        {
            case Running: System.out.println("All Good");
            break;
            case Pending: System.out.println("Pls Wait");
            break;
            case Failed: System.out.println("Declined");
            break;
            default:
                System.out.println("All Success");
        }
        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Pending)
            System.out.println("Pls Wait");
        else if(s == Status.Failed)
            System.out.println("Declined");
        else
            System.out.println("All Success");
    }
    
}
