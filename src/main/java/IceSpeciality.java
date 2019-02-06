public class IceSpeciality implements Speciality {
    public String doCast(MagicUser wizard) {
        wizard.reduceManaLevel(10);
        return "Casts ice blast!";
    }
}
