package models;

import java.util.Arrays;

public class Professeur {
    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        modulesEnseignes = new ModuleInfo[0];
    }

    public boolean enseigneCemodule(String nomDuModule) {
        boolean resultat = false;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i] == nomDuModule) {
                resultat = true;
                break;
            }
        }
        return resultat;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        if (module != null) {
            modulesEnseignes = new ModuleInfo[modulesEnseignes.length + 1];
        }

    }

    public void viderModules() {
        modulesEnseignes = new ModuleInfo[0];
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom.toUpperCase();
    }

}
