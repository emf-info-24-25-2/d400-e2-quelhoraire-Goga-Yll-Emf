package models;

import java.util.Arrays;

public class Bloc {
    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];
        
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean resultat = false;
        int conteur = 0;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                conteur++;
            } else if (conteur == 3) {
                resultat = true;
            }
        }
        return resultat;
    }

    public void afficherHoraire() {
        


    }

    public boolean estTotalementPlanifie() {
        boolean resultat = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) {
                resultat = true;
            }
        }
        return resultat;
    }

    public boolean contientModule(ModuleInfo module) {
        if (module != Bloc.mo) {
            
        }
        return;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
