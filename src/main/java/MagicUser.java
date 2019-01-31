public interface MagicUser {
    int availableMana = 100;

    String castSpell();
    int getManaLevel();
    void reduceManaLevel(int manaCost);
}
