package magazzino;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProdottoTest {

    @Test
    public void testCostruttoreAndGetters() {
        Prodotto link = new Prodotto("LinkMarca", "LinkModello", "LinkSeriale", 5, 50.0f, 3, null);
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale", 10, 100.0f, 5, link);

        assertNotNull(prodotto);
        assertEquals("Marca", prodotto.getMarca());
        assertEquals("Modello", prodotto.getModello());
        assertEquals("Seriale", prodotto.getSeriale());
        assertEquals(10, prodotto.getQuantità());
        assertEquals(100.0f, prodotto.getPrezzo(), 0.01);
        assertEquals(5, prodotto.getDisponibilità());
        assertEquals(link, prodotto.getLink());
    }

    @Test
    public void testSetters() {
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale", 10, 100.0f, 5, null);

        prodotto.setMarca("Nuova Marca");
        prodotto.setModello("Nuovo Modello");
        prodotto.setSeriale("Nuovo Seriale");
        prodotto.setQuantità(20);
        prodotto.setPrezzo(200.0f);
        prodotto.setDisponibilità(10);
        Prodotto nuovoLink = new Prodotto("Nuova LinkMarca", "Nuova LinkModello", "Nuova LinkSeriale", 3, 30.0f, 2, null);
        prodotto.setLink(nuovoLink);

        assertEquals("Nuova Marca", prodotto.getMarca());
        assertEquals("Nuovo Modello", prodotto.getModello());
        assertEquals("Nuovo Seriale", prodotto.getSeriale());
        assertEquals(20, prodotto.getQuantità());
        assertEquals(200.0f, prodotto.getPrezzo(), 0.01);
        assertEquals(10, prodotto.getDisponibilità());
        assertEquals(nuovoLink, prodotto.getLink());
    }
}
