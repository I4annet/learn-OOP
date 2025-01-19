package vehicles;

public class Honda extends Motorcycle {

    private String model;

    public Honda(String name, int year, int cc, String model) {
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
