package task24;

public class Movie {

    private String title;
    private Time duration;

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie: " +
                "The title of a movie '" + title + '\'' + ", the film duration is: " + duration;
    }

    public String getTitle() {
        return title;
    }

    public Time getDuration() {
        return duration;
    }


}