import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GameOfLifeTest {

    @ParameterizedTest()
    @MethodSource("diesWithFewerThanTwoLiveNeighbours")
    public void diesWithFewerThanTwoLiveNeighbours(boolean[][] openingGrid, boolean[][] nextGenerationGridArray) {
        assertArrayEquals(nextGenerationGridArray, new GameOfLife(openingGrid).nextGeneration());
    }

    private static Stream<Arguments> diesWithFewerThanTwoLiveNeighbours() {
        return Stream.of(
                arguments(
                        new TestingGridArrays().testingGridAllDead,
                        new TestingGridArrays().testingGridAllDead),
                arguments(
                        new TestingGridArrays().testingGridOneAliveInFirstElement,
                        new TestingGridArrays().testingGridAllDead),
                arguments(
                        new TestingGridArrays().testingGridOneAliveInSecondElement,
                        new TestingGridArrays().testingGridAllDead),
                arguments(
                        new TestingGridArrays().testingGridTwoAliveButSeparated,
                        new TestingGridArrays().testingGridAllDead
                )
        );
    };

    @ParameterizedTest()
    @MethodSource("anyLiveCellWithTwoOrThreeLiveNeighborsLivesToTheNextGeneration")
    public void livesWithTwoOrThreeNeighbors(boolean liveCell, boolean cellInNextGeneration) {
        assertEquals(liveCell, cellInNextGeneration);
    }

    private static Stream<Arguments> anyLiveCellWithTwoOrThreeLiveNeighborsLivesToTheNextGeneration() {
        return Stream.of(
                arguments(
                        new TestingGridArrays().testingGridHorizontalTrio[2][2],
                        new GameOfLife(new TestingGridArrays().testingGridVerticalTrio).nextGeneration()[2][2]),
               arguments(
                        new TestingGridArrays().testingGridVerticalTrio[2][2],
                        new GameOfLife(new TestingGridArrays().testingGridHorizontalTrio).nextGeneration()[2][2]),
                arguments(
                        new TestingGridArrays().testingGridHorizontalTrioAtTheEdges[2][1],
                        new GameOfLife(new TestingGridArrays().testingGridHorizontalTrioAtTheEdges).nextGeneration()[2][1])

        );
    };
}