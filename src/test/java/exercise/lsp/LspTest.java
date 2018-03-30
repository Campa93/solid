package exercise.lsp;

import org.junit.Test;

public class LspTest {

    @Test
    public void resizeRectangleTest() {
        Rectangle r = new Rectangle(4, 6);
        r.resize(2,3);
        assert (r.getHeight() == 2);
        assert (r.getWidth() == 3);
    }

    @Test
    public void resizeSquareTest() {

        Square s = new Square(2);

        s.resize(2,3);

        assert false;
    }
}