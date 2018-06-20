public class Movies {
    public String movieTittle,movieRating;
    public int totalRunTime,year;
    //Generate a constructor for movies
    public Movies(String movieTittle, String movieRating, int totalRunTime, int year) {
        this.movieTittle = movieTittle;
        this.movieRating = movieRating;
        this.totalRunTime = totalRunTime;
        this.year = year;
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
        return year;
    }
    //Generate a setter for Movies

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
        this.year = year;
    }


    public String toString(){
        return "\nMovie Tittle = "+movieTittle+
                "\nMovie Rating = "+movieRating+
                "\nTotal Runtime = "+totalRunTime+
                "\nYear of Release = "+year+"\n";
    }
}
