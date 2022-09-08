public class TestingGridArrays {

    public boolean[][] testingGridAllDead = new boolean[][]{{false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false}};

    public boolean[][] testingGridOneAliveInFirstElement = new boolean[][]{
            {true, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false}
    };

    public boolean[][] testingGridOneAliveInSecondElement = new boolean[][]{
            {false, true, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false}
    };
    public boolean[][] testingGridTwoAliveButSeparated = new boolean[][]{
            {false, true, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, true, false},
            {false, false, false, false, false}
    };
    public boolean[][] testingGridHorizontalTrio = new boolean[][]{
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, true, true, true, false},
            {false, false, false, false, false},
            {false, false, false, false, false}
    };
    public boolean[][] testingGridVerticalTrio = new boolean[][]{
            {false, false, false, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, false, false, false}
    };
    public boolean[][] testingGridHorizontalTrioAtTheEdges = new boolean[][]{
            {false, false, false, false, false},
            {true, false, false, false, false},
            {true, true, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false}
    };
    public boolean[][] testingGridVerticalTrioAtTheEdges = new boolean[][]{
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false}
    };

}
