package repository;

public class listerCours {
    // ...
    
    public void listerCours() {
        List<Cours> cours = database.getAllCours();
        for (Cours c : cours) {
            System.out.println("ID: " + c.getId() + ", Date: " + c.getDate() + ", Heure début: " + c.getHeureDebut() + ", Heure fin: " + c.getHeureFin() + ", Professeur: " + c.getProfesseur().getNom() + ", Module: " + c.getModule().getNom());
        }
    }

    @Override
    public String toString() {
        return "listerCours []";
    }

    
}
