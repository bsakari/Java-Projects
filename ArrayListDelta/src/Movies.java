import java.util.ArrayList;

public class Movies {
    public static void main(String[] args) {
        //Instantiate the ArrayList
        //Attach it to the constructor
        ArrayList<MovieListing> MovieList;
        MovieList = new ArrayList<MovieListing>();
        //Instantiate the variable for fetching the movie
        //details from the user and add them to the List
        MovieListing Movie;
        //Fetch details from the User and add to the List
        //Fetch the First Movie
        Movie = new MovieListing("Black Panther",
                "Eight",2018);
        MovieList.add(Movie);


        //Fetch the Second Movie
        Movie = new MovieListing("Ikechi My Love",
                "Ten",2015);
        MovieList.add(Movie);


        //Fetch the Third Movie
        Movie = new MovieListing("Rambo",
                "Nine",1999);
        MovieList.add(Movie);

        //Finally print the List
        System.out.println(MovieList.toString());
        //Use remove() to delete/remove an item from the List
        MovieList.remove(0);
        System.out.println(MovieList.toString());
    }
}
