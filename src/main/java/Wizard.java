public class Wizard implements MagicUser{
    private Speciality magicSpeciality;
    private int availableMana;

    public Wizard(Speciality magicSpeciality) {
        this.magicSpeciality = magicSpeciality;
        this.availableMana = 100;
    }

    public String castSpell() {
        return this.magicSpeciality.doCast(this);
    }

    public int getManaLevel() {
        return this.availableMana;
    }

    public void reduceManaLevel(int manaCost) {
        this.availableMana -= manaCost;
    }
}
