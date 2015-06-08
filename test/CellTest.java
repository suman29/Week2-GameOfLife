import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void testWhetherCellSatisfyReflexivity() {
        Cell cell1 = new Cell(2, 3);
        Cell cell2 = new Cell(2, 3);

        assertEquals(cell1, cell2);
    }
}
