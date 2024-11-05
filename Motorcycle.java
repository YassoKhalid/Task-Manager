
package test;

/**
 *
 * @author yasso
 */
public class Motorcycle extends vehicle {
    protected double enginePower;
    protected boolean SideCar;

    public Motorcycle(double enginePower, boolean SideCar, int IDNumber, String Brand, double price) {
        super(IDNumber, Brand, price);
        this.enginePower = enginePower;
        this.SideCar = SideCar;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isSideCar() {
        return SideCar;
    }

    public void setSideCar(boolean SideCar) {
        this.SideCar = SideCar;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
