package sg.edu.rp.c346.mymovies;

public class Movie {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private String watched_on;
    private String in_theatre;
    private String description;
    //private String ratings;

    public Movie(String title, String year, String rated, String genre, String watched_on, String in_theatre, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
        //this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched_on() {
        return watched_on;
    }

//    public String getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(String ratings) {
//        this.ratings = ratings;
//    }

    public void setWatched_on(String watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
