public class MovieListing {
    private String movieTitle,movieRating;
    private int year;

    public MovieListing(String movieTitle, String movieRating, int year) {
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.year = year;
    }
    public String toString(){
        return "\nMovie Title = "+movieTitle+
                "\nMovie Rating = "+movieRating+
                "\nYear of Production = "+year+"\n";
    }
}
