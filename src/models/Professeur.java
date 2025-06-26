package models;

public class Professeur {
    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        modulesEnseignes = new ModuleInfo[0];
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean resultat = false;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i].getNom().equals(nomDuModule)) {
                resultat = true;
                break;
            }
        }
        return resultat;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        if (module != null) {
            ModuleInfo[] newlist = new ModuleInfo[modulesEnseignes.length + 1];
            for (int i = 0; i < modulesEnseignes.length; i++) {
                newlist[i] = modulesEnseignes[i];
            }
            newlist[modulesEnseignes.length] = module;
            modulesEnseignes = newlist;

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
