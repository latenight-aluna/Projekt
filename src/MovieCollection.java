public class MovieCollection {
    private Movie[] movies;
    int count = 0;

    public MovieCollection() {
        this.movies = new Movie[5];
    }
    public void addMovie(String titel, String director, int yearCreated, boolean isInColor, int lengthInMinutes,
                           String genre) {
        movies[count++] = new Movie(titel, director, yearCreated, isInColor, lengthInMinutes, genre);
    }
}