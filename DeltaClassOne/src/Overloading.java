public class Overloading {
    public static void main(String[] args) {
        System.out.println("Average = "+average(5,6,7));
        System.out.println("Average = "+average(6.0,4.0,2.0));
    }
    public static double average(int x, int y, int z){
        return (x+y+z)/3.0;
    }
    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }

}
