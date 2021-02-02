public class Movie implements Comparable<Movie> {
    String title;
    int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    @Override
    public int compareTo(Movie o) {

        if (title.compareTo(o.title) > 0)
        return 1;
        else if (title.compareTo(o.title) < 0 )
        return -1;
        else if (year > o.year)
        return 1;
        else if (year < o.year)
        return -1;
        else
        return 0;
    }

    @Override
    public boolean equals (Object obj) {
         if (obj instanceof Movie) {
         Movie other = (Movie) obj;
         return compareTo(other) == 0;
       }
        return false;
    }
    
    @Override
    public String toString()
    {
    return "Movie [Title = " + title + ", Year = " + year + "]";
    }
}