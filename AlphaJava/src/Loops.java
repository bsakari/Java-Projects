public class Loops {
    public static void main(String[] args){
        System.out.println("This is a do while loop");
        int number;
        number = 0;
        do {
            System.out.println(number);
            number++;
        }while (number<10);


        System.out.println("This is a while loop");
        number = 0;
        while (number<10){
            System.out.println(number);
            number++;
        }


        System.out.println("This is a For Loop");
        for (number=0; number<10;number++){
            System.out.println(number);
        }
    }
}
