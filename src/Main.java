public class Main {
    public static void main(String[] args) throws Exception {
        Patient p1 = new Patient(14587421, "hama", "hama", 21569852);
        Patient p2 = new Patient(14587425, "aziz", "guebsi", 21569855);
        Patient p3 = new Patient(14587428, "ahmed", "ben salah", 21569858);
        Patient p4 = new Patient(14587429, "abou", "oubayda", 21569859);
        Patient p = new Patient(14587421, "abou", "oubayda", 21569859);
        ListPatients listPatients = new ListPatients();
        listPatients.ajouterPatient(p1);
        listPatients.ajouterPatient(p1);
        listPatients.ajouterPatient(p2);
        listPatients.ajouterPatient(p3);
        listPatients.ajouterPatient(p4);
        listPatients.ajouterPatient(p);
        listPatients.afficherPatients();
        listPatients.rechercherPatient(p1);
        listPatients.patientSansRedondance();

        Medecin m1 = new Medecin(14528796, "dengezli", "dali", 258741);
        Medecin m2 = new Medecin(14528795, "ben hamouda", "ridha", 258742);
        Medecin m3 = new Medecin(14528794, "labyedh", "slimen", 258743);
        Medecin m4 = new Medecin(14528794, "aziz", "guebsi", 258743);
        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(m1);
        setMedecins.ajouterMedecin(m2);
        setMedecins.ajouterMedecin(m3);
        setMedecins.ajouterMedecin(m4);
        setMedecins.afficherMedecins();
        setMedecins.nombreMedecins();
        setMedecins.rechercherMedecin(1254875);
        setMedecins.rechercherMedecin(14528794);

        Hopital h1 = new Hopital();
        h1.ajouterMedecin(m1);
        h1.ajouterMedecin(m2);
        h1.ajouterMedecin(m3);
        h1.ajouterPatient(m1,p1);
        h1.afficherMedcinPatients(m1);
        h1.afficherMedcinPatients(m2);
        h1.afficherMedcinPatients(m3);
        h1.afficherMap();
        h1.ajouterPatient(m3,p2);
        h1.afficherMap();

    }
}