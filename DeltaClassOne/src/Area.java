public class Area {
    public static void main(String[] args){
        double length,width,area;
        length = 10;
        width = 20;
        area = length*width;
        System.out.println("The area of your rectangle is "+area);
        double base,height,tarea;
        base = 30;
        height = 15;
        tarea = 1/2.0*base*height;
        System.out.println("The area of your triangle is "+tarea);
        double principle,rate,time,interest;
        principle = 1000;
        rate = 10;
        time = 2;
        interest = (principle*rate*time)/100.0;
        System.out.println("Your accumulative interest is "+interest);
    }
}
