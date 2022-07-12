package cm.qa.solid;

public class Driver extends Car{

    private int mileage;

    public Driver(String colour, String model, int mileage) {
        super(colour, model, mileage);
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Driver [mileage=" + mileage + "]";
    }

    // functionality
    public void drive(int milesDriven) {

        this.setMileage(this.getMileage() + milesDriven);
    }

}



