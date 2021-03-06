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

    @Test
    public void ice_spells_cost_10_mana() {
        Wizard iceWizard = new Wizard(new IceSpeciality());
        iceWizard.castSpell();
        assertEquals(90, iceWizard.getManaLevel());
    }

    @Test
    public void fire_spells_cost_20_mana() {
        Wizard fireWizard = new Wizard(new FireSpeciality());
        fireWizard.castSpell();
        assertEquals(80, fireWizard.getManaLevel());
    }

    @Test
    public void arcane_spells_cost_30_mana() {
        Wizard arcaneWizard = new Wizard(new ArcaneSpeciality());
        arcaneWizard.castSpell();
        assertEquals(70, arcaneWizard.getManaLevel());
    }
}
