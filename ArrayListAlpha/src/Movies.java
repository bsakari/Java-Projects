import java.util.ArrayList;

public class Movies {
    public static void main(String[] args) {
        ArrayList<MovieListings> moviesList;
        moviesList = new ArrayList<MovieListings>();
        MovieListings Movie;
        //First Movie
        Movie = new MovieListings("Black Panther",
                "Eight",2018);
        moviesList.add(Movie);


        //Second Movie
        Movie = new MovieListings("Ichele My Love"
        ,"Ten",2016);
        moviesList.add(Movie);
;

        //Third Movie
        Movie = new MovieListings("Rambo",
                "Nine",1997);
        moviesList.add(Movie);
        System.out.println(moviesList.toString());
        moviesList.remove(1);
        System.out.println(moviesList.toString());
    }
}
