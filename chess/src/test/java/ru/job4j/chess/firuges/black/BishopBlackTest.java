package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(bishopBlack.position(), Cell.A1);
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
         Cell expected = bishopBlack.copy(Cell.A2).position();
        Assert.assertEquals(expected, Cell.A2);
    }
}

