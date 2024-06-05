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

    public gestionModules(List<Module> modules, Database database) {
        this.modules = modules;
        this.database = database;
    }

    public void ajouterModule(Module module) {
        // Vérifier si le module existe déjà
        if (!modules.contains(module)) {
            modules.add(module);
            database.addModule(module);
        } else {
            System.out.println("Le module existe déjà.");
        }
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}

