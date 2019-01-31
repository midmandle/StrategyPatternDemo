public class FireSpeciality implements Speciality {
    public String doCast(Wizard wizard) {
        wizard.reduceManaLevel(20);
        return "Casts fire blast!";
    }
}
