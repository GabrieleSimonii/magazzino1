package magazzino;

import java.util.Scanner;

public class MagazzinoTester {
	private static String marca;
	private static String modello;
	private static String seriale;
	private static int quantità;
	private static float prezzo;
	private static int disponibilità;
	private static Prodotto link;
	private static final int AGGIUNGI_PRODOTTO = 1;
	private static final int RIMUOVI_PRODOTTO = 2;
	private static final int MODIFICA_PRODOTTO = 3;
	private static final int STAMPA_PRODOTTO = 4;
	private static final int ESCI = 5;

	public static void main(String[] args) throws Exception {
		Magazzino magazzino = new Magazzino();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Benvenuto nel menu principale seleziona:");
			System.out.println("1. Aggiungi prodotto");
			System.out.println("2. Rimuovi prodotto");
			System.out.println("3. Modifica prodotto");
			System.out.println("4. Stampa magazzino");
			System.out.println("5. Esci");
			System.out.print("Scelta: ");

			int scelta = scanner.nextInt();
			switch (scelta) {
			case AGGIUNGI_PRODOTTO:
				// Aggiungi prodotto al magazzino
				System.out.println("INSERISCI LA MARCA :");
				marca = scanner.next();
				System.out.println("INSERISCI IL MODELLO :");
				modello = scanner.next();
				System.out.println("INSERISCI IL CODICE SERIALE :");
				seriale = scanner.next();
				System.out.println("INSERISCI LA QUANTITA' :");
				quantità = scanner.nextInt();
				System.out.println("INSERISCI IL PREZZO :");
				prezzo = scanner.nextFloat();
				System.out.println("INSERISCI LA DISPONIBILITA' :");
				disponibilità = scanner.nextInt();
				// Controlli se la quantità disponibile è minore della quantita totale
				if (disponibilità > quantità) {
					while (disponibilità < quantità) {
						System.out.println(
								"ERRORE LA QUANTITA' DEI PRODOTTI DISPONIBILI RISULTA SUPERIORE A QUANTITA' TOTALE \n INSERISCI LA DISPONIBILITA' :");
						disponibilità = scanner.nextInt();
					}
				}
				magazzino.aggiungiProdotto(new Prodotto(marca, modello, seriale, quantità, prezzo, disponibilità, link));
				break;

			 case RIMUOVI_PRODOTTO:
	                System.out.println("Inserisci il codice seriale del prodotto da rimuovere: ");
	                String codiceSeriale = scanner.next();

	                magazzino.rimuoviProdotto(codiceSeriale);
	                break;


			 case MODIFICA_PRODOTTO:
                 System.out.println("Inserisci il codice seriale del prodotto da modificare: ");
                 String codiceSerialeModifica = scanner.next();magazzino.modificaProdotto(codiceSerialeModifica,scanner);
      
                 break;


			case STAMPA_PRODOTTO:
				// Stampa il contenuto del magazzino
				magazzino.stampaMagazzino();
				break;

			case ESCI:
				System.out.println("Uscita dal programma.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Scelta non valida.");
			}

		}
	}

}
