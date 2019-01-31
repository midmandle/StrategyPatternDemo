import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardsShould {
    @Test
    public void ice_wizards_cast_ice_spells() {
        Wizard wizard = new Wizard(new IceSpeciality());
        assertEquals("Casts ice blast!", wizard.castSpell());
    }
}
