package services;

import java.time.chrono.MinguoChronology;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {
    public void attribuerModules(Professeur[] professeurs, ModuleInfo[] modules){
        int MIN = 0;
        int MAX = modules.length-1;
        int nbre = (int)(Math.random()*(MAX - MIN + 1)) + MIN;

        


    }

    public boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {
        
        boolean resultat = false;

        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                if (Professeur.enseigneCemodule() == modules[i]) {
                    
                }
                
            }
        }


    }
}
