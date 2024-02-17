package magazzino;

public class Elemento {
    Prodotto info;
    Elemento precedente;
    Elemento successivo;
	Prodotto prodotto;

    Elemento(Prodotto prodotto) {
        this.info = prodotto;
        this.prodotto=prodotto;
    }

	public Prodotto getInfo() {
		return info;
	}

	public void setInfo(Prodotto info) {
		this.info = info;
	}

	public Elemento getPrecedente() {
		return precedente;
	}

	public void setPrecedente(Elemento precedente) {
		this.precedente = precedente;
	}

	public Elemento getSuccessivo() {
		return successivo;
	}

	public void setSuccessivo(Elemento successivo) {
		this.successivo = successivo;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
}