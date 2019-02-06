public class ArcaneSpeciality implements Speciality {
    public String doCast(MagicUser wizard) {
        wizard.reduceManaLevel(30);
        return "Casts arcane blast!";
    }
}
