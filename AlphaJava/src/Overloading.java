public class Overloading {
    public static void main(String[] args) {
        System.out.println("Average in Method 1 = "
                + average(5,7,30));
        System.out.println("Average in method 2 = "
    + average(5.0,20.0,56.0));
    }


    public static double average(int x, int y, int z){
        return (x+y+z)/3.0;
    }

    public static double average(double x, double y, double z){
        return (x+y+z)/3.0;
    }
}
