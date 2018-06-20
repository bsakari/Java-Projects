import java.util.ArrayList;

public class Movies {
    public static void main(String[] args) {
        ArrayList<MovieListing> MovieList;
        MovieList = new ArrayList<MovieListing>();
        MovieListing Movie;
        //Fetch the first movie and add to the List
        Movie = new MovieListing("Black Panther",
                "Eight",2018);
        MovieList.add(Movie);
        //Fetch the second movie and add to the List
        Movie = new MovieListing("Ikechi My Love",
                "Ten",2015);
        MovieList.add(Movie);
        //Fetch the third movie and add to the List
        Movie = new MovieListing("Rambo",
                "Nine",1997);
        MovieList.add(Movie);
        System.out.println(MovieList.toString());
        //Removing an Item(a movie) from the List
        MovieList.remove(0);
        System.out.println(MovieList.toString());
    }
}
