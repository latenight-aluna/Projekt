public class MovieCollection {

    private Movie[] movieList;
    int count = 0;

    public MovieCollection() {
        this.movieList = new Movie[5];
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieList[count++] = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

}