import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardsShould {
    @Test
    public void ice_wizards_cast_ice_spells() {
        Wizard wizard = new Wizard(new IceSpeciality());
        assertEquals("Casts ice blast!", wizard.castSpell());
    }

    @Test
    public void fire_wizards_cast_fire_spells() {
        Wizard wizard = new Wizard(new FireSpeciality());
        assertEquals("Casts fire blast!", wizard.castSpell());
    }

    @Test
    public void arcane_wizards_cast_arcane_spells() {
        Wizard wizard = new Wizard(new ArcaneSpeciality());
        assertEquals("Casts arcane blast!", wizard.castSpell());
    }
}
