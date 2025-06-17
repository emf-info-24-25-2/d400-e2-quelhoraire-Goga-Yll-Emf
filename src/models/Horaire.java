package models;

public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    private Bloc[] blocs;

    public Horaire() {
        blocs = new Bloc[NBRE_DE_BLOCS];
    }

    public boolean planifier(ModuleInfo[] modules, Professeur[] profs){

        return;
    }

    public void afficherHoraire(){

    }
    public Bloc moduleDansQuelBloc(ModuleInfo[] module) {
        return;
    }
}
