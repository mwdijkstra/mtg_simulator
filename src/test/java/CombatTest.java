import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

public class CombatTest {

    @Test
    public void executeCombatTest() {

        Combat combat = new Combat();

        Battlefield battlefield = new Battlefield();
        battlefield.playerOne.add(new Card("Centaur Courser", 3, 3));
        battlefield.playerTwo.add(new Card("Vorstclaw", 7, 7));

        Battlefield expectedBattlefield = new Battlefield();
        expectedBattlefield.playerTwo.add(new Card("Vorstclaw", 7, 7));

        assertThat(expectedBattlefield, samePropertyValuesAs(combat.executeCombat(battlefield)));

    }

}
