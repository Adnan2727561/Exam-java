package repository;

import java.util.List;
import java.util.ArrayList;
//Ajouter un Module 
public class gestionModules {
    private List<Module> modules;
    private Database database;

    public gestionModules(Database database) {
        this.database = database;
        this.modules = database.getAllModules();
    }

    /**
     * @param module
     */
    public void ajouterModule(Module module) {
        // Vérifier si le module existe déjà
        if (!modules.contains(module)) {
            modules.add(module);
            database.addModule(module);
        } else {
            System.out.println("Le module existe déjà.");
        }
    }
}
