public class Movie {
    private String movieTittle,Rating;
    int Year,runTime;

    public Movie(String movieTittle, String rating, int year, int runTime) {
        this.movieTittle = movieTittle;
        Rating = rating;
        Year = year;
        this.runTime = runTime;
    }

    public String getMovieTittle() {
        return movieTittle;
    }

    public String getRating() {
        return Rating;
    }

    public int getYear() {
        return Year;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setMovieTittle(String movieTittle) {
        this.movieTittle = movieTittle;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
    public String toString(){
        return "\nMovie Tittle = "+movieTittle+
                "\nMovie Rating = "+Rating+
                "\nYear of Release = "+Year+
                "\nTotal Runtime = "+runTime+"\n";
    }
}
