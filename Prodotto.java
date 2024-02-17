package magazzino;

public class Prodotto {
    private String marca;
    private String modello;
    String seriale;
    private int quantità;
    private float prezzo;
    private int disponibilità;
    private Prodotto link;

    public Prodotto(String marca, String modello, String seriale, int quantità, float prezzo, int disponibilità,
            Prodotto link) {
        this.marca = marca;
        this.modello = modello;
        this.seriale = seriale;
        this.quantità = quantità;
        this.prezzo = prezzo;
        this.disponibilità = disponibilità;
        this.link = link;
    }
    public String toString() {
        return "Prodotto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", seriale='" + seriale + '\'' +
                ", quantità=" + quantità +
                ", prezzo=" + prezzo +
                ", disponibilità=" + disponibilità +
                '}'+ "\n";
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getSeriale() {
		return seriale;
	}

	public void setSeriale(String seriale) {
		this.seriale = seriale;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public int getDisponibilità() {
		return disponibilità;
	}

	public void setDisponibilità(int disponibilità) {
		this.disponibilità = disponibilità;
	}

	public Prodotto getLink() {
		return link;
	}

	public void setLink(Prodotto link) {
		this.link = link;
	}

    // Metodi getter e setter
}