package magazzino;

import java.util.Scanner;

public class Magazzino {
    private ListaMagazzino listaProdotti;

    public Magazzino() {
        this.listaProdotti = new ListaMagazzino();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        // Aggiungi il prodotto alla lista, in questo caso si sceglie di aggiungerlo in coda
        listaProdotti.aggiungi(prodotto,false);
    }
    public void rimuoviProdotto(String codiceSeriale) throws Exception{
        boolean r = listaProdotti.estrai(codiceSeriale);
        if(r) 
        	System.out.println("Prodotto rimosso con successo");
        else 
        	System.out.println("Prodotto non è presente nella lista");
    }

    public void  modificaProdotto(String codiceSerialeModifica, Scanner scanner) {
        boolean r = listaProdotti.modificaProdotto(codiceSerialeModifica,scanner);
        if(r) 
        	System.out.println("Prodotto modificato con successo");
        else 
        	System.out.println("Prodotto non modificato, il prodotto non è presente nella lista");
    }

    public void stampaMagazzino() {
        // Stampa la lista dei prodotti presenti nel magazzino
        listaProdotti.stampaLista();
    }
}