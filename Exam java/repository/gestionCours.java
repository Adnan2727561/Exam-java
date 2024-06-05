import java.time.LocalDate;
import java.time.LocalTime;

public class gestionCours {
    private Database database;

    public GestionCours(Database database) {
        this.database = database;
    }

    public void creerCours(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Professeur professeur, Module module) {
        Cours cours = new Cours(id, date, heureDebut, heureFin, professeur, module);
        database.addCours(cours);
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
