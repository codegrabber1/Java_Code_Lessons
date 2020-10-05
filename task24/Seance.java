package task24;
public class Seance implements Comparable<Seance>{
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int endHour = this.startTime.getHour() + movie.getDuration().getHour();
        int endMin = this.startTime.getMin() + movie.getDuration().getMin();
        this.endTime = new Time( endHour, endMin);
    }

    @Override
    public String toString() {
        return "Seance {" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public Movie getMovie() {
        return movie;
    }

    public Time getEndTime() {
        return endTime;
    }

    public Time getStartTime() {

        return startTime;
    }

    @Override
    public int compareTo(Seance o) {
        if (this.getStartTime().getHour() == o.getStartTime().getHour()) {
            return this.getStartTime().getMin() - o.getStartTime().getMin();
        } else {
            return this.getStartTime().getHour() - o.getStartTime().getHour();
        }
    }
}