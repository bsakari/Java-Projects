import java.util.ArrayList;

public class MovieListing {
    public static void main(String[] args) {
        ArrayList<Movie> mimi;
        mimi = new ArrayList<Movie>();
        Movie m1;
        m1 = new Movie("Rambo","Ten",2018,143);
        mimi.add(m1);
        m1 = new Movie("Cyborg","Nine",2015,98);
        mimi.add(m1);
        System.out.println(mimi.toString());
        mimi.remove(1);
        System.out.println(mimi.toString());
    }
}
