package task24;

import java.util.ArrayList;
import java.util.TreeMap;

public class Cinema{
    private TreeMap<String, Schedule> schedules = new TreeMap<>();
    private ArrayList<Movie> moviesLibrary = new ArrayList<>();

    private Time open;
    private Time close;


    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
    }

    /**
     * Adding a film to the moviesLibrary.
     * @param movie a movie to add
     * @param time the time of the movie duration
     */
    void addMovie(Movie movie, Time...time){
        moviesLibrary.add(movie);
        moviesLibrary.forEach(m-> System.out.println(m.toString()));
    }

    /**
     * The list of all movies.
     */
    void listOfMovies(){ moviesLibrary.forEach(movie -> System.out.println(movie.getTitle()));}

    /**
     * Adding a seance to the schedule.
     * @param seance added to the schedule.
     * @param day the day of the schedule.
     */
    void addSeance (Seance seance, String day){

        if((seance.getStartTime().getHour() > open.getHour()) && (seance.getEndTime().getHour() < close.getHour())){
            schedules.put(day, new Schedule(seance));
            schedules.entrySet().forEach(s-> System.out.println(s.toString()));
        }else{
            System.out.println("We are unable to schedule sessions at this time! ");

        }
    }

    /**
     * Removing the film from the moviesLibrary.
     * @param movie = a movie to add.
     */
    void removeMovie(Movie movie){

        schedules.forEach((key, value) -> value.getSeances().forEach(s -> {
            if (s.getMovie().equals(movie)) {
                System.out.println("You successfully removed " +movie.toString()+ " from seance at " + schedules.firstKey() + " !");
                value.removeSeance(s);
            }
        }));

        System.out.println("You successfully removed " +movie.toString()+ " !");
        moviesLibrary.remove(movie);
    }

    /**
     * Removing a seance from the schedule.
     * @param seance added to the schedule.
     * @param day the day of the schedule.
     */
    void removeSeance (Seance seance, String day){

        System.out.println( schedules.get(day) + " was removed successfully");
        schedules.entrySet().stream().filter(schedules->schedules.getKey().equals(day))
                .forEach(s->s.getValue().removeSeance(seance));
    }

    /**
     * Showing the whole list of the cinema in the schedule.
     */
    void listOfSchedule(){
       schedules.forEach((key, value) -> System.out.println(value));
    }

    /**
     * Showing the whole list of the cinema in the schedule.
     */
    void listOfScheduleByDay(String day){
        schedules.entrySet().stream().filter(schedules->schedules.getKey()
                .equals(day)).forEach(s-> System.out.println(s.getValue()));
    }

    /**
     * An access to the schedule.
     * @return schedules.
     */
    TreeMap<String, Schedule> getSchedules() {
        return schedules;
    }

    /**
     * An access to the moviesLibrary.
     * @return moviesLibrary.
     */
    ArrayList<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }
}