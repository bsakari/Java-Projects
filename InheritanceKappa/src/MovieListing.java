public class MovieListing {
    public static void main(String[] args) {
        Movies m1,m2;
        m1 = new Movies("Black Panther",
                "Eight",127,2018);
        m2 = new Movies("Ichele My Love",
                "Nine",245,2017);
        //toString method prints all the defined items
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        //Use a getter method to print individual items
        System.out.println(m1.getMovieTittle());
        System.out.println(m2.getYear());
        //User a setter method to update individual items
        m2.setMovieTittle("\nIchele My Love Part Two");
        System.out.println(m2.getMovieTittle());
    }
}
