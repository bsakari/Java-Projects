public class Movies {
    public String movieTittle,movieRating;
    public int totalRunTime,Year;
    //Generate Constructor for Movies

    public Movies(String movieTittle, String movieRating, int totalRunTime, int year) {
        this.movieTittle = movieTittle;
        this.movieRating = movieRating;
        this.totalRunTime = totalRunTime;
        this.Year = year;
    }
    //Generate a getter for movies

    public String getMovieTittle() {
        return movieTittle;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public int getTotalRunTime() {
        return totalRunTime;
    }

    public int getYear() {
        return Year;
    }
    //Generate a setter for movies


    public void setMovieTittle(String movieTittle) {
        this.movieTittle = movieTittle;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public void setTotalRunTime(int totalRunTime) {
        this.totalRunTime = totalRunTime;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String toString(){
        return "\nMovie Tittle = "+movieTittle+
                "\nMovie Rating = "+movieRating+
                "\nTotal Runtime = "+totalRunTime+
                "\nYear of Release = "+Year;
    }
}
