package task24;

import java.util.Set;
import java.util.TreeSet;

public class Schedule{
    private Set<Seance> seances = new TreeSet<>();

    public Schedule(Seance seance) {
        addSeance(seance);
    }

    void addSeance (Seance seance){
        seances.add(seance);
    }
    void removeSeance (Seance seance){
        seances.remove(seance);
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    @Override
    public String toString() {
        return "Schedule: " + seances;
    }
}