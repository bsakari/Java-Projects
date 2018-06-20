public class Overloading {
    public static void main(String[] args) {
        System.out.println("The average of the three numbers 3,5,7 is "+average(3,5,7));
        System.out.println("The average of the three numbers is 3.0,5.0,7.0 is "+average(3.0,5.0,7.0));
    }

    public static double average(int x, int y,int z)
    {
        return (x+y+z)/3.0;
    }

    public static double average(double x, double y,double z)
    {
        return (x+y+z)/3;
    }
}
