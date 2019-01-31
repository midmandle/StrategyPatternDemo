public class IceSpeciality implements Speciality {
    public String doCast(Wizard wizard) {
        wizard.reduceManaLevel(10);
        return "Casts ice blast!";
    }
}
