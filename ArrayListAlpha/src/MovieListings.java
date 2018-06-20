public class MovieListings {
    private String movieTitle,movieRating;
    private int year;

    public MovieListings(String movieTitle, String movieRating, int year) {
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.year = year;
    }
    public String toString(){
        return "\nMovie Title = "+movieTitle+
                "\nMovie Rating = "+movieRating+
                "\nYear of Release = "+year+"\n";
    }
}
