public class ArcaneSpeciality implements Speciality {
    public String doCast(Wizard wizard) {
        wizard.reduceManaLevel(30);
        return "Casts arcane blast!";
    }
}
