public class GameOfLife {

    private final boolean[][] board;

    public GameOfLife(boolean[][] board) {
        this.board = board;
    }

    public boolean[][] printBoard() {
        return this.board;
    }

    public boolean[][] nextGeneration() {
        boolean[][] newGrid = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        for (int i=0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int numberOfNeighbors = countNeighbors(i, j);
                if (numberOfNeighbors == 2 || numberOfNeighbors == 3) {
                    newGrid[i][j] = board[i][j];
                    continue;
                }
                newGrid[i][j] = false;
            }
        }

        return newGrid;
    }

    private int countNeighbors(int i, int j) {
        return countHorizontalNeighbors(i, j) + countVerticalNeighbors(i, j);
    }

    private int countHorizontalNeighbors(int i, int j) {
        int count = 0;
        if (j == 0) {
            count += board[i][j + 1] ? 1 :0;
        }
        if (j != 0 && j != 4) {
            count += board[i][j + 1] ? 1 :0;
            count += board[i][j - 1] ? 1: 0;
        }
        if (j == 4) {
            count += board[i][j - 1] ? 1: 0;
        }
        return count;
    }

    private int countVerticalNeighbors(int i, int j) {
        int count = 0;
        if (i == 0) {
            count += board[i + 1][j] ? 1 :0;
        }
        if (i != 0 && i != 4) {
            count += board[i + 1][j] ? 1 : 0;
            count += board[i - 1][j] ? 1 : 0;
        }
        if (i == 4) {
            count += board[i - 1][j] ? 1: 0;
        }
        return count;
    } 
}
