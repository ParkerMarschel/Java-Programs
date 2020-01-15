package lightsoutgame;

/**
 * Class sets up and runs a LightsOut game
 *
 * @author Parker Marschel & Zachary Spielberger
 */
class LightsOut {

    /**
     * Initialize instance variables as in and an array of boolean values
     */
    private int size;
    private boolean[][] grid;

    /**
     * Constructor method takes in an int and sets it to the instance variable
     * The 2 dimensional array is also initialized with false boolean values
     * using a for loop based on the parameter
     *
     * @param size
     */
    public LightsOut(int size) {
        this.size = size;
        grid = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = false;
            }
        }
    }

    /**
     * @return Returns an int which is an instance variable
     */
    public int getSize() {
        return size;
    }

    /**
     * Method calls the toggle method and passes it values of it parameter into
     * the toggle method parameter
     *
     * @param row Row of the board as an int
     * @param col Column of the board as an int
     */
    public void press(int row, int col) {
        toggle(row, col);
        toggle(row - 1, col);
        toggle(row + 1, col);
        toggle(row, col + 1);
        toggle(row, col - 1);
    }

    /**
     * Method accesses the board
     *
     * @param row Row of the board as an int
     * @param col Column of the board as an int
     * @return Returns a boolean value by indexing the grid via the parameter
     * values
     */
    public boolean isLit(int row, int col) {
        return grid[row][col];
    }

    /**
     * Method forces the board to take on the boolean value based in at the
     * indexes passed in
     *
     * @param row Row as an int value
     * @param col Column as an int value
     * @param value Boolean value to be set in the grid
     */
    public void forceLit(int row, int col, boolean value) {
        grid[row][col] = value;
    }

    /**
     * method sets the value of the board to the opposite of its previous
     * setting at the index based on the parameters Implements
     * easier-to-ask-forgiveness-than-permission by using try and catch block
     *
     * @param row Index value for the grid as an int
     * @param col Index value for the grid as an int
     */
    private void toggle(int row, int col) {
        try {
            grid[row][col] = !grid[row][col];
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
    }
}
