package app;
import models.Horaire;
import models.ModuleInfo;
import models.Professeur;
import services.ServiceFormationMaitres;

public class App {

    public static final String[] NOMS_MODULES = { "G300", "187", "162", "123", "293", "117", "164", "216", "106", "231",
            "122", "431" };

    public static void main(String[] args) {


        ModuleInfo[] modules1ere = new ModuleInfo[NOMS_MODULES.length];

        for (int i = 0; i < modules1ere.length; i++) {
            modules1ere[i] = new ModuleInfo(NOMS_MODULES[i]);
        }



        Professeur[] profs = new Professeur[5];

        profs[0] = new Professeur("Iron", "Man");
        profs[1] = new Professeur("Super", "Man");
        profs[2] = new Professeur("Spider", "Man");
        profs[3] = new Professeur("Aqua", "Man");
        profs[4] = new Professeur("Bat", "Man");

        // formation des professeurs
        do {
            ServiceFormationMaitres.attribuerModules(profs, modules1ere);
        } while (!ServiceFormationMaitres.tousModulesCouverts(profs, modules1ere));

        System.out.println("L'école a engagé les professeurs suivants");

        for (int i = 0; i < profs.length; i++) {
            ModuleInfo[] modulesProf = profs[i].getModulesEnseignes();
            System.out.print("- " + profs[i] + " peut enseigner les modules :");
            for (int j = 0; j < modulesProf.length; j++) {
                System.out.print(" " + modulesProf[j].getNom());
            }
            System.out.println();
        }

        // Planification de l'horaire
        System.out.println("\nIl est temps de préparer l'horaire.\n");

        Horaire horaire = new Horaire();
        if (horaire.planifier(modules1ere, profs)) {
            System.out.println("Les modules ont été planifiés avec succès!");
            horaire.afficherHoraire();
        } else {
            System.out.println("Problème de planification, adressez-vous au service de formation des maîtres!");
        }



    }

}
