package task24;

import java.util.*;

public class Main{
    public static void main(String [] args){

        Cinema cinema = new Cinema(new Time(8, 0), new Time(23, 0));
        boolean state = true;
        while(state){
            doAction();
            Scanner menu = new Scanner(System.in);

            int i = menu.nextInt();
            switch(i){
                case 1:{
                    try{
                        System.out.println("Type the name of the movie");
                        String fName = menu.next();
                        System.out.println("Set an hour of the film duration: ");
                        int h = menu.nextInt();
                        System.out.println("Set a minute of the film duration: ");
                        int m = menu.nextInt();
                        cinema.addMovie(new Movie(fName, new Time(h, m)));
                    }catch (InputMismatchException e){
                        System.out.println( e + " :You have to enter the correct data. Hour and minute have to be an integer");
                    }

                    break;

                }
                case 2: {
                    try{
                        System.out.println("Choose the film to add into a seance  ");
                        cinema.listOfMovies();
                        String fName = menu.next();
                        Optional<Movie> getMovie = cinema.getMoviesLibrary().stream().filter(m->m.getTitle().equalsIgnoreCase(fName)).findFirst();

                        System.out.println("Set the time (hour and min) when the seance has to start");
                        int h = menu.nextInt();
                        int m = menu.nextInt();
                        System.out.println("Set the day of the seance");
                        String day = menu.next().toUpperCase();
                        cinema.addSeance(new Seance(getMovie.get(), new Time(h, m)), day);
                    }catch (InputMismatchException e){
                        System.out.println( e + " :You have to enter the correct data. Hour and minute have to be an integer");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Choose a film to remove");
                    cinema.listOfMovies();
                    String fName = menu.next();
                    Optional<Movie> getMovie = cinema.getMoviesLibrary().stream()
                            .filter(m->m.getTitle().equalsIgnoreCase(fName)).findFirst();
                    try{
                        cinema.removeMovie(getMovie.get());
                    }catch (NoSuchElementException e) {
                        System.out.println("There's no such film " + e);
                    }

                    break;
                }
                case 4: {
                    System.out.println("Choose the day to remove a seance ");
                    String day = menu.next().toUpperCase();

                    Optional<Seance> getS = cinema.getSchedules().get(day).getSeances().stream().findFirst();
                    cinema.removeSeance(getS.get(),day);
                    break;
                }
                case 5: {
                    System.out.println("The schedule of our cinema: ");
                    cinema.listOfSchedule();
                    break;

                }
                case 6: {
                    System.out.println("Choose a day to see the schedule");
                    Days [] d = Days.values();
                    for(Days day: d) {
                        System.out.println(day);
                    }
                    String day = menu.next().toUpperCase();
                    cinema.listOfScheduleByDay(day);
                    break;
                }
                case 7: {
                    System.out.println("Thanx");
                    state = false;
                    System.exit(0);
                }
            }
        }
    }

    private static void doAction(){
        System.out.println("Type 1 to add a movie");
        System.out.println("Type 2 to add a seance");
        System.out.println("Type 3 to remove a movie");
        System.out.println("Type 4 to remove a seance");
        System.out.println("Type 5 to show the schedule");
        System.out.println("Type 6 to show the schedule by day");
        System.out.println("Type 7 to finish");
    }
}