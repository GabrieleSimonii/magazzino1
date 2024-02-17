package magazzino;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MagazzinoTesterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testAggiungiProdotto() throws Exception {
        String input = "1\nMarca1\nModello1\nSeriale1\n10\n100.0\n5\n2\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MagazzinoTester.main(null);

        assertTrue(outContent.toString().contains("Prodotto rimosso con successo"));
    }

    @Test
    public void testRimuoviProdotto() throws Exception {
        String input = "2\nSeriale1\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MagazzinoTester.main(null);

        assertTrue(outContent.toString().contains("Prodotto rimosso con successo"));
    }

    @Test
    public void testModificaProdotto() throws Exception {
        String input = "3\nSeriale1\nNuovaMarca\nNuovoModello\n15\n200.0\n10\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MagazzinoTester.main(null);

        assertTrue(outContent.toString().contains("Prodotto modificato con successo"));
    }

    @Test
    public void testStampaMagazzino() throws Exception {
        String input = "4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MagazzinoTester.main(null);

        assertTrue(outContent.toString().contains("Contenuto della lista"));
    }

    @Test
    public void testUscitaProgramma() throws Exception {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MagazzinoTester.main(null);

        assertTrue(outContent.toString().contains("Uscita dal programma"));
    }
}
