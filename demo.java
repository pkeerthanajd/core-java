class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;// this returns the expected output
    }
}

public class demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Apple";
        obj.price = 50000;
        Laptop obj1 = new Laptop();
        obj.model = "Apple";
        obj.price = 50000;
        System.out.println(obj);// without defining toString leads to the HexaDecimal Number
        System.out.println(obj.equals(1));//this reference differs 
        System.out.println(obj==obj1);//this reference differs 

    }

}
