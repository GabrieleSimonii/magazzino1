package magazzino;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;

public class MagazzinoTest {

    @Test
    public void testAggiungiProdotto() {
        Magazzino magazzino = new Magazzino();
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale123", 10, 100.0f, 5, null);
        magazzino.aggiungiProdotto(prodotto);
        assertEquals(1, magazzino.listaProdotti.getNumeroProdotti());
    }

    @Test
    public void testRimuoviProdotto() throws Exception {
        Magazzino magazzino = new Magazzino();
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale123", 10, 100.0f, 5, null);
        magazzino.aggiungiProdotto(prodotto);
        magazzino.rimuoviProdotto("Seriale123");
        assertEquals(0, magazzino.listaProdotti.getNumeroProdotti());
    }

    @Test
    public void testModificaProdotto() {
        Magazzino magazzino = new Magazzino();
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale123", 10, 100.0f, 5, null);
        magazzino.aggiungiProdotto(prodotto);
        Scanner scanner = new Scanner("NuovaMarca\nNuovoModello\n15\n200.0\n10\n");
        magazzino.modificaProdotto("Seriale123", scanner);
        assertEquals("NuovaMarca", magazzino.listaProdotti.getProdotto("Seriale123").getMarca());
        assertEquals("NuovoModello", magazzino.listaProdotti.getProdotto("Seriale123").getModello());
        assertEquals(15, magazzino.listaProdotti.getProdotto("Seriale123").getQuantità());
        assertEquals(200.0f, magazzino.listaProdotti.getProdotto("Seriale123").getPrezzo(), 0.001);
        assertEquals(10, magazzino.listaProdotti.getProdotto("Seriale123").getDisponibilità());
    }

    @Test
    public void testStampaMagazzino() {
        Magazzino magazzino = new Magazzino();
        Prodotto prodotto1 = new Prodotto("Marca1", "Modello1", "Seriale1", 10, 100.0f, 5, null);
        Prodotto prodotto2 = new Prodotto("Marca2", "Modello2", "Seriale2", 20, 200.0f, 10, null);
        magazzino.aggiungiProdotto(prodotto1);
        magazzino.aggiungiProdotto(prodotto2);
        magazzino.stampaMagazzino(); // Verifica stampa manuale
        // Implementare l'asserzione in base a come viene stampata effettivamente la lista
        assertTrue(true); // Dummy assertion
    }
}
