package java;

public class Motorcycle {

    private String name;
    private int year;
    private int cc;

    public Motorcycle(String name, int year, int cc) {
        this.name = name;
        this.year = year;
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getCc() {
        return cc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("CC: " + cc);
    }

    
}