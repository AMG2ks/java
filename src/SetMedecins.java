import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setM;
    public SetMedecins() {
        setM = new HashSet<>();
    }
    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }
    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(m -> m.getCin() == cin);
    }

    public void afficherMedecins() {
        setM.stream().forEach(System.out::println);
    }

    public long nombreMedecins() {
        return setM.stream().count();
    }

    public TreeSet<Medecin> trierMedecins() {
        return new TreeSet<>(setM);
    }
}