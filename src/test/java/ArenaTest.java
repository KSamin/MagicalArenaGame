import static org.junit.Assert.*;
import org.junit.Test;
import org.swiggyAssignment.Arena;
import org.swiggyAssignment.Player;

public class ArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        arena.startFight();
        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
}
