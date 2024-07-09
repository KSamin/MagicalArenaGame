import static org.junit.Assert.*;
import org.junit.Test;
import org.swiggyAssignment.Dice;

public class DiceTest {
    @Test
    public void testDiceRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue("Dice roll out of range: " + roll, roll >= 1 && roll <= 6);
        }
    }
}
