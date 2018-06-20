public class Movie {
    public static void main(String[] args) {
        MovieListings m1,m2;
        m1 = new MovieListings("Black Panther",
                "Eight",127,2018);
        m2 = new MovieListings("Ichele My Love",
                "Nine",200,2017);
        //toString method prints out all details
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        //Print individual Items using Getter method
        System.out.println(m1.getMovieTittle());
        System.out.println(m2.getYear());
        //Use Setter Method to Update individual items
        m2.setMovieTittle("\nIchele My Love Part Two");
        System.out.println(m2.getMovieTittle());

    }
}
