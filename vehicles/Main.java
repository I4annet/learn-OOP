package vehicles;

public class Main {
    public static void main(String[] args) {
        Honda honda = new Honda("Honda", 2020, 150, "CBR150R");
        Yamaha yamaha = new Yamaha("Yamaha", 2020, 150, "YZF-R15");
        
        honda.print();
        System.out.println();
        yamaha.print();
    }
    
}
