package models;

public class ModuleInfo {
    private String nom;
    private Professeur professeur;

    public ModuleInfo(String nom) {
        this.nom = nom;
        professeur = null;
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        String resultat = null;
        if (professeur != null) {
            resultat = nom + " avec " + professeur;
        } else {
            resultat = nom;
        }
        return resultat;
    }

}
