package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {
    public static void attribuerModules(Professeur[] professeurs, ModuleInfo[] modules) {
        for (int i = 0; i < professeurs.length; i++) {
            int nbrDePos = modules.length;
            int choix = 0;
            do {
                choix = (int) (Math.random() * nbrDePos);
            } while (professeurs[i].enseigneCeModule(modules[choix].getNom()));

        }
    }

    public static boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {

        boolean resultat = true;

        for (int i = 0; i < modules.length; i++) {
            boolean moduleEstCouvert = false;
            for (int j = 0; j < profs.length; j++) {
                if (profs[j].enseigneCeModule(modules[i].getNom())) {
                    moduleEstCouvert = true;
                    break;
                }
            }
            if (!moduleEstCouvert) {
                resultat = false;
            }
            
        }
        
        return resultat;
    }
}
