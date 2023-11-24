import java.util.*;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient{
    private List<Patient> listP;
    public ListPatients(){
        listP = new ArrayList<>();
    }
    public void ajouterPatient(Patient p) {
        listP.stream()
                .filter(patient -> patient.getCin() == p.getCin())
                .findFirst()
                .ifPresentOrElse(
                        existingPatient -> System.out.println("Patient with the same Cin already exists."),
                        () -> listP.add(p)
                );
    }

    public void supprimerPatient(Patient p) {
        listP.removeIf(patient -> patient.equals(p));
    }

    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch(patient -> patient.equals(p));
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted(Comparator.comparing(Patient::getNom))
                .collect(Collectors.toList());
    }

    public void patientSansRedondance() {
        listP = listP.stream().distinct().collect(Collectors.toList());
    }

}