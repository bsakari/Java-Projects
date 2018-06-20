public class MovieListings {
    public String movieTittle,Rating;
    public int totalRuntime,Year;

    //Generating a constructor for movies
    public MovieListings(String movieTittle, String rating, int totalRuntime, int year) {
        this.movieTittle = movieTittle;
        Rating = rating;
        this.totalRuntime = totalRuntime;
        Year = year;
    }
    //Generate a getter for Movies
    public String getMovieTittle() {
        return movieTittle;
    }

    public String getRating() {
        return Rating;
    }

    public int getTotalRuntime() {
        return totalRuntime;
    }

    public int getYear() {
        return Year;
    }
    //Generate a Setter for Movies

    public void setMovieTittle(String movieTittle) {
        this.movieTittle = movieTittle;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public void setTotalRuntime(int totalRuntime) {
        this.totalRuntime = totalRuntime;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String toString(){
        return "\nMovie Tittle = "+movieTittle
                +"\nMovie Rating = "+Rating
                +"\nTotal Runtime = "+totalRuntime
                +"\nYear of Release = "+Year;
    }
}
