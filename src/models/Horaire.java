package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    private Bloc[] blocs;

    public Horaire() {
        blocs = new Bloc[NBRE_DE_BLOCS];
        for (int i = 0; i < blocs.length; i++) {
            blocs[i] = new Bloc("B" + (i + 1) + "S" + (i / 3 + 1));
        }
    }

    public boolean planifier(ModuleInfo[] modules, Professeur[] profs) {
        boolean moduleSansProf = false;
        boolean moduleSansPlace = false;

        for (int i = 0; i < modules.length; i++) {

            boolean professeurDisponible = false;
            for (int j = 0; j < profs.length; j++) {
                if (profs[j].enseigneCeModule(modules[i].getNom())) {
                    modules[i].setProfesseur(profs[j]);
                    professeurDisponible = true;
                    break;
                }
            }
            if (!professeurDisponible) {
                moduleSansProf = true;
                continue;
            }

            for (int j = 0; j < blocs.length; j++) {
                if (blocs[j].planifierModule(modules[i])) {
                    break;
                } else if (j == blocs.length - 1) {
                    moduleSansPlace = true;
                }
            }

        }
        return !moduleSansProf && !moduleSansPlace;
    }

    public void afficherHoraire() {
        LocalDateTime dateHeureActuelle = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'à' HH:mm");
        System.out.println("____________________________________________________________________");
        System.out.println(
                "\nHoraire 1ère année CFC Informaticien (version du " + dateHeureActuelle.format(formatter) + ")");
        System.out.println("____________________________________________________________________");
        for (int i = 0; i < blocs.length; i++) {
            blocs[i].afficherHoraire();
        }
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {
        Bloc bloc = null;
        for (int i = 0; i < blocs.length; i++) {
            if (blocs[i].contientModule(module)) {
                bloc = blocs[i];
                break;
            }
        }
        return bloc;
    }
}
