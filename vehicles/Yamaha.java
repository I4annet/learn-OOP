package vehicles;

public class Yamaha extends Motorcycle {

    private String model;

    public Yamaha(String name, int year, int cc, String model) {
        super(name, year, cc);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Model: " + model);
    }
    
}
