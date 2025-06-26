package models;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Bloc {
    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];
        ModuleInfo modulematu = new ModuleInfo("Matu");
        for (int i = 0; i < 4; i++) {
            modules[i] = modulematu;
        }

    }

    public boolean planifierModule(ModuleInfo module) {
        boolean resultat = false;
        int comteur = 0;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                modules[i] = module;
                comteur++;
                if (comteur == 3) {
                    resultat = true;
                    break;
                }
            }
        }
        return resultat;
    }

    public void afficherHoraire() {
        System.out.println();
        System.out.println(nom);
        System.out.println("--------------");
        for (int i = 0; i < modules.length; i += 2) {
            System.out.println(DayOfWeek.values()[i / 2].getDisplayName(TextStyle.FULL, Locale.FRANCE));
            System.out.println(" matin     : " + modules[i]);
            System.out.println(" après-midi: " + modules[i + 1]);
        }
        System.out.println();
    }

    public boolean estTotalementPlanifie() {
        boolean resultat = true;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                resultat = false;
            }
        }
        return resultat;
    }

    public boolean contientModule(ModuleInfo module) {
        boolean resultat = false;
        if (module != null) {
            for (int i = 0; i < modules.length; i++) {
                if (modules[i] == module) {
                    resultat = true;
                    break;
                }
            }
        }
        return resultat;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
