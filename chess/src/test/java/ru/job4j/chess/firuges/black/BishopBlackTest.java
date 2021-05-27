package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(bishopBlack.position(), Cell.A1);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
         Cell expected = bishopBlack.copy(Cell.A2).position();
        Assert.assertEquals(expected, Cell.A2);
    }

    @Test
    public void testIsDiagonalTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell dest = Cell.G7;
        Assert.assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }

    @Test
    public void testIsDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell dest = Cell.G6;
        Assert.assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Assert.assertArrayEquals(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}, bishopBlack.way(Cell.G5));
    }

}

