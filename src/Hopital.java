import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Hopital {
    public Map<Medecin,ListPatients> medecinPatiens;
    public Hopital(){
        medecinPatiens = new HashMap<>();
    }
    public void ajouterMedecin(Medecin m){
        medecinPatiens.put(m, new ListPatients());
    }
    public void ajouterPatient(Medecin m, Patient p) throws Exception {
        Optional.ofNullable(medecinPatiens.get(m))
                .ifPresentOrElse(
                        listPatients -> listPatients.ajouterPatient(p),
                        () -> {
                            try {
                                throw new Exception("Doctor not found in the hospital");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                );
    }
    public void afficherMap() {
        medecinPatiens.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin);
            System.out.println("Patients: ");
            patients.afficherPatients();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatiens.containsKey(m)) {
            ListPatients listPatients = medecinPatiens.get(m);
            listPatients.afficherPatients();
        } else {
            System.out.println("Doctor not found in the hospital.");
        }
    }

}