public class Grid {

    int gridBox[][];

    public Grid(int size) {
        gridBox = new int[size][size];
    }

    public int getAliveMembers(int x, int y) {
        return (gridBox[x - 1][y + 1] + gridBox[x - 1][y] + gridBox[x - 1][y - 1] + gridBox[x][y + 1] + gridBox[x][y - 1] + gridBox[x + 1][y - 1] + gridBox[x + 1][y] + gridBox[x + 1][y + 1]);
    }
}