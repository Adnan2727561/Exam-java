package views;

package ges.scolaire;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import ges.scolaire.entities.Module;
import ges.scolaire.entities.Professeur;
import ges.scolaire.repositories.Database;
import ges.scolaire.repositories.DatabaseImpl;
import ges.scolaire.services.GestionModules;
import ges.scolaire.services.GestionCours;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Database database = new DatabaseImpl();
        GestionModules gestionModules = new GestionModules(database);
        GestionCours gestionCours = new GestionCours(database);
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu:");
            System.out.println("1. Ajouter un module");
            System.out.println("2. Lister les modules");
            System.out.println("3. Créer un cours");
            System.out.println("4. Lister tous les cours");
            System.out.println("5. Lister les cours d'un module et d'un professeur");
            System.out.println("6. Quitter");
            System.out.print("Votre choix: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du module: ");
                    int idModule = scanner.nextInt();
                    scanner.nextLine();  // pour vid
                    System.out.print("Entrez le nom du module: ");
                    String nomModule = scanner.nextLine();
                    Module module = new Module(idModule, nomModule);
                    gestionModules.ajouterModule(module);
                    break;
                case 2:
                    System.out.println("Liste des modules:");
                    gestionModules.listerModules().forEach(m -> System.out.println(m.getId() + ": " + m.getNom()));
                    break;
                case 3:
                    // Ajoutez ici la logique pour créer un cours
                    break;
                case 4:
                    // Ajoutez ici la logique pour lister tous les cours
                    break;
                case 5:
                    // Ajoutez ici la logique pour lister les cours d'un module et d'un professeur
                    break;
                case 6:
                    System.out.println("Merci et au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 6.");
            }
        } while (choix != 6);
        scanner.close();
    }
}
