import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {
    @Test
    public void checkIfNeighboursPresentAreAllDead() {
        Grid grid = new Grid(50);

        int actualDeadMembers = grid.getAliveMembers(5, 5);
        int expectedDeadMembers = 0;

        assertEquals(actualDeadMembers, expectedDeadMembers);
    }
}
