public class CarConstractor {
    private String carName;
    private double wheelSize;

    public CarConstractor(String carName, double wheelSize) {
        this.carName = carName;
        this.wheelSize = wheelSize;
    }
    public String toString(){
        return "Car Name = "+carName+"\n Wheel Size = "+wheelSize;
    }
}
