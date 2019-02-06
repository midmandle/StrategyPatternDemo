public class FireSpeciality implements Speciality {
    public String doCast(MagicUser wizard) {
        wizard.reduceManaLevel(20);
        return "Casts fire blast!";
    }
}
