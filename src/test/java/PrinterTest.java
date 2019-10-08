import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPagesLeft(){
        assertEquals(100, printer.getPagesLeft());
    }

    @Test
    public void canPrint(){
        assertEquals(90, printer.print(5, 2));
    }

    @Test
    public void cannotPrint(){
        assertEquals(100, printer.print(10, 11));
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canUseToner(){
        assertEquals(75, printer.useToner(5, 5));
    }
}
