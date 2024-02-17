package magazzino;

import static org.junit.Assert.*;
import org.junit.Test;

public class ElementoTest {

    @Test
    public void testCostruttore() {
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale", 10, 100.0f, 5, null);
        Elemento elemento = new Elemento(prodotto);

        assertNotNull(elemento);
        assertEquals(prodotto, elemento.getInfo());
        assertEquals(prodotto, elemento.getProdotto());
        assertNull(elemento.getPrecedente());
        assertNull(elemento.getSuccessivo());
    }

    @Test
    public void testSetterGetter() {
        Prodotto prodotto = new Prodotto("Marca", "Modello", "Seriale", 10, 100.0f, 5, null);
        Elemento elemento = new Elemento(prodotto);

        Prodotto nuovoProdotto = new Prodotto("Nuova Marca", "Nuovo Modello", "Nuovo Seriale", 20, 200.0f, 10, null);
        Elemento nuovoPrecedente = new Elemento(prodotto);
        Elemento nuovoSuccessivo = new Elemento(prodotto);

        elemento.setInfo(nuovoProdotto);
        elemento.setPrecedente(nuovoPrecedente);
        elemento.setSuccessivo(nuovoSuccessivo);
        elemento.setProdotto(nuovoProdotto);

        assertEquals(nuovoProdotto, elemento.getInfo());
        assertEquals(nuovoProdotto, elemento.getProdotto());
        assertEquals(nuovoPrecedente, elemento.getPrecedente());
        assertEquals(nuovoSuccessivo, elemento.getSuccessivo());
    }
}
