import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GridTest {
    @Test
    public void checkIfNeighboursPresentAreAllDead() {
        Grid grid = new Grid(50);

        int actualDeadMembers = grid.getAliveMembers(5, 5);
        int expectedDeadMembers = 0;

        assertEquals(actualDeadMembers, expectedDeadMembers);
    }

    @Test
    public void checkIfLifeAssignedToCell() {
        Grid grid = new Grid(50);
        grid.assignLifeToCell(5, 5, 1);

        int actualLife = grid.gridBox[5][5];
        int expectedLife = 1;

        assertThat(actualLife, is(expectedLife));
    }
}
