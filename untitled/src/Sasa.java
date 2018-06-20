public class Sasa {
   private  String carName;
   private double wheelSize;

    public Sasa(String carName, double wheelSize) {
        this.carName = carName;
        this.wheelSize = wheelSize;
    }
    public String toString(){
        return "Car Name  = "+carName+"\nWheel Size = "+wheelSize;
    }
}
