public class Movie {
    private String title;
    private boolean watched;

    public Movie(String title) {
        this.title = title;
        this.watched = false;
    }

    public void markAsWatched() {
        this.watched = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isWatched() {
        return watched;
    }
}
