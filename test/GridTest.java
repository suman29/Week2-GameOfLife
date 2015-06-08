import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void checkIfNeighboursPresentAreAllDead() {
        ArrayList<Cell> neighbours = new ArrayList<>();
        neighbours.add(new Cell(2, 3));
        neighbours.add(new Cell(1, 3));
        neighbours.add(new Cell(4, 3));
        neighbours.add(new Cell(6, 3));
        Grid grid = new Grid(neighbours);

        int actualDeadMembers = grid.getAliveMembers();
        int expectedDeadMembers = 0;

        assertEquals(actualDeadMembers, expectedDeadMembers);
    }
}
