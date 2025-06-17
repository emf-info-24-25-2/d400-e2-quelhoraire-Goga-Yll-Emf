import models.Horaire;
import models.ModuleInfo;
import models.Professeur;

public class App {

    public static final String[] NOMS_MODULES = { "G300", "187", "162", "123", "293", "117", "164", "216", "106", "231",
            "122", "431" };

    public static void main(String[] args) {

        Horaire horaire = new Horaire();

        ModuleInfo[] modules1ere = new ModuleInfo[12];

        modules1ere[0] = new ModuleInfo(NOMS_MODULES[0]);
        modules1ere[1] = new ModuleInfo(NOMS_MODULES[1]);
        modules1ere[2] = new ModuleInfo(NOMS_MODULES[2]);
        modules1ere[3] = new ModuleInfo(NOMS_MODULES[3]);
        modules1ere[4] = new ModuleInfo(NOMS_MODULES[4]);
        modules1ere[5] = new ModuleInfo(NOMS_MODULES[5]);
        modules1ere[6] = new ModuleInfo(NOMS_MODULES[6]);
        modules1ere[7] = new ModuleInfo(NOMS_MODULES[7]);
        modules1ere[8] = new ModuleInfo(NOMS_MODULES[8]);
        modules1ere[9] = new ModuleInfo(NOMS_MODULES[9]);
        modules1ere[10] = new ModuleInfo(NOMS_MODULES[10]);
        modules1ere[11] = new ModuleInfo(NOMS_MODULES[11]);

        Professeur[] profs = new Professeur[5];

        profs[0] = new Professeur("Iron", "Man");
        profs[2] = new Professeur("Super", "Man");
        profs[3] = new Professeur("Spider", "Man");
        profs[4] = new Professeur("Aqua", "Man");
        profs[5] = new Professeur("Captain", "America");

        for (int i = 0; i < profs.length; i++) {
            
        }


    }

}
