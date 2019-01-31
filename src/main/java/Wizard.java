public class Wizard {
    private Speciality magicSpeciality;

    public Wizard(Speciality magicSpeciality) {
        this.magicSpeciality = magicSpeciality;
    }

    public String castSpell() {
        return this.magicSpeciality.doCast();
    }

    public int getManaLevel() {
        return 90;
    }
}
