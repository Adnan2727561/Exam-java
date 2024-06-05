import java.time.LocalDate;
import java.time.LocalTime;

public class cours {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private Professeur professeur;
    private Module module;

    public cours(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Professeur professeur, Module module) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.professeur = professeur;
        this.module = module;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public Module getModule() {
        return module;
    }

  
}
