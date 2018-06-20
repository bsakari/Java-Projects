public class MoviesConstractor {
    private String movieName,movieActor;
    private int yearOfRelease,rating;

    public MoviesConstractor(String movieName, String movieActor, int yearOfRelease, int rating) {
        this.movieName = movieName;
        this.movieActor = movieActor;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
    public String toString(){
        return "\nMovie Name = "+movieName+
                "\nMovie Actor = "+movieActor+
                "\nMovie Year Of Release = "+yearOfRelease+
                "\nMovie Rating = "+rating;
    }
}
