import javax.swing.JOptionPane;

public class InsertElement {
	
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: InsertElement
	 * Lines: 294
	 * Description: This class contains the methods for inserting books into the library, using Database Class statics methods.
	 * 
	 * 
	 */
	
	
	

	private NewBookGui comp;

	public InsertElement(NewBookGui comp) {
		this.comp = comp;
	}

	
	
	
	
	
	public void addCover() {
		
		// Saving the cover image
		
		boolean check = Database.saveImage();

		if (check == true) {
			this.comp.PREVIEW.setIcon(this.comp.closefolder);
			this.comp.PREVIEW.setRolloverIcon(this.comp.closefolder);
			this.comp.PREVIEW.setToolTipText("Immagine selezionata");
			this.comp.isAlreadyChoosen = true;
		}
	}
	
	
	
	

	public boolean addNewBook() {
		
		// Exceptions handled

		if (this.comp.TITLEBOOKTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Titolo mancante!");
			return false;
		}

		if (this.comp.WRITERTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Autore mancante!");
			return false;
		}

		if (this.comp.EDITORTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Casa Editrice mancante!");
			return false;
		}

		if (this.comp.EDITIONTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "N° di edizione mancante!");
			return false;
		}

		if (!this.comp.EDITIONTF.getText().contains("0") && !this.comp.EDITIONTF.getText().contains("1")
				&& !this.comp.EDITIONTF.getText().contains("2") && !this.comp.EDITIONTF.getText().contains("3")
				&& !this.comp.EDITIONTF.getText().contains("4") && !this.comp.EDITIONTF.getText().contains("5")
				&& !this.comp.EDITIONTF.getText().contains("6") && !this.comp.EDITIONTF.getText().contains("7")
				&& !this.comp.EDITIONTF.getText().contains("8") && !this.comp.EDITIONTF.getText().contains("9")) {
			JOptionPane.showMessageDialog(null, "L'edizione deve essere un valore numerico!");
			return false;
		}

		if (this.comp.LANGUAGETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lingua mancante!");
			return false;
		}

		if (this.comp.PAGESTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Numero di pagine mancante!");
			return false;
		}

		if (!this.comp.PAGESTF.getText().contains("0") && !this.comp.PAGESTF.getText().contains("1")
				&& !this.comp.PAGESTF.getText().contains("2") && !this.comp.PAGESTF.getText().contains("3")
				&& !this.comp.PAGESTF.getText().contains("4") && !this.comp.PAGESTF.getText().contains("5")
				&& !this.comp.PAGESTF.getText().contains("6") && !this.comp.PAGESTF.getText().contains("7")
				&& !this.comp.PAGESTF.getText().contains("8") && !this.comp.PAGESTF.getText().contains("9")) {
			JOptionPane.showMessageDialog(null, "Il numero di pagine deve essere un valore numerico!");
			return false;
		}

		if (this.comp.PRINTYEARTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Anno di stampa mancante!");
			return false;

		}

		if (this.comp.PRINTYEARTF.getText().length() != 4) {
			JOptionPane.showMessageDialog(null, "L'anno deve essere espresso in 4 cifre!");
			return false;
		}

		if (!this.comp.PRINTYEARTF.getText().contains("0") && !this.comp.PRINTYEARTF.getText().contains("1")
				&& !this.comp.PRINTYEARTF.getText().contains("2") && !this.comp.PRINTYEARTF.getText().contains("3")
				&& !this.comp.PRINTYEARTF.getText().contains("4") && !this.comp.PRINTYEARTF.getText().contains("5")
				&& !this.comp.PRINTYEARTF.getText().contains("6") && !this.comp.PRINTYEARTF.getText().contains("7")
				&& !this.comp.PRINTYEARTF.getText().contains("8") && !this.comp.PRINTYEARTF.getText().contains("9")) {
			JOptionPane.showMessageDialog(null, "L'anno di stampa deve essere un valore numerico!");
			return false;
		}

		if (this.comp.PRIZETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Prezzo mancante!");
			return false;
		}

		if (!this.comp.PRIZETF.getText().contains("0") && !this.comp.PRIZETF.getText().contains("1")
				&& !this.comp.PRIZETF.getText().contains("2") && !this.comp.PRIZETF.getText().contains("3")
				&& !this.comp.PRIZETF.getText().contains("4") && !this.comp.PRIZETF.getText().contains("5")
				&& !this.comp.PRIZETF.getText().contains("6") && !this.comp.PRIZETF.getText().contains("7")
				&& !this.comp.PRIZETF.getText().contains("8") && !this.comp.PRIZETF.getText().contains("9")) {
			JOptionPane.showMessageDialog(null, "Il prezzo deve essere un valore numerico!");
			return false;
		}

		if (this.comp.ISBNTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "ISBN mancante!");
			return false;
		}

		if (!this.comp.ISBNTF.getText().contains("0") && !this.comp.ISBNTF.getText().contains("1")
				&& !this.comp.ISBNTF.getText().contains("2") && !this.comp.ISBNTF.getText().contains("3")
				&& !this.comp.ISBNTF.getText().contains("4") && !this.comp.ISBNTF.getText().contains("5")
				&& !this.comp.ISBNTF.getText().contains("6") && !this.comp.ISBNTF.getText().contains("7")
				&& !this.comp.ISBNTF.getText().contains("8") && !this.comp.ISBNTF.getText().contains("9")) {
			JOptionPane.showMessageDialog(null, "ISBN deve essere un valore numerico!");
			return false;
		}
		
		if (this.comp.PLACETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Inserisci un'allocazione per il libro! (dove lo conservi)");
			return false;
		}

		if (this.comp.PLOTTA.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Trama mancante!");
			return false;
		}
		
		try {
			
			if (Database.existISBN(this.comp.ISBNTF.getText())) {
				JOptionPane.showMessageDialog(null, "ISBN già esistente!");
				return false;
			}
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, e1);
		}
		
		
		
		// Getting values inserted
		
		int choose = JOptionPane.showConfirmDialog(null, "Confermare l'aggiunta del libro?", "Conferma",
				JOptionPane.YES_NO_OPTION);
		if (choose == JOptionPane.YES_OPTION) {

			boolean result = true;

			String title = this.comp.TITLEBOOKTF.getText();
			title = title.replaceAll("'", "§");

			String writer = this.comp.WRITERTF.getText();
			writer = writer.replaceAll("'", "§");

			String editor = this.comp.EDITORTF.getText();
			editor = editor.replaceAll("'", "§");

			int edition = 0;
			int pages = 0;
			int pagestoti = 0;
			double prize = 0;
			int printyear = 0;

			try {

				String editionstring = this.comp.EDITIONTF.getText();
				edition = Integer.parseInt(editionstring);

				String pagesstring = this.comp.PAGESTF.getText();
				pages = Integer.parseInt(pagesstring);

				String pagestots = this.comp.PAGESTF.getText();
				pagestoti = Integer.parseInt(pagestots);

				String printyearstring = this.comp.PRINTYEARTF.getText();
				printyear = Integer.parseInt(printyearstring);

				String prizestring = this.comp.PRIZETF.getText().replaceAll(",", ".");;
				prize = Double.parseDouble(prizestring);

			} catch (NumberFormatException e3) {

				result = false;
				JOptionPane.showMessageDialog(null, "Errore nell'inserimento dei dati! Riprova!");
				return false;
			}

			String type = this.comp.TYPECB.getSelectedItem().toString();

			String language = this.comp.LANGUAGETF.getText();
			language = language.replaceAll("'", "§");

			String pagescode = "";

			if (pagestoti < 100) {
				pagescode = "A001";
			} else {
				if (pagestoti >= 100 && pagestoti < 200) {
					pagescode = "A002";
				} else {
					if (pagestoti >= 200 && pagestoti < 300) {
						pagescode = "A003";
					} else {
						if (pagestoti >= 300 && pagestoti < 400) {
							pagescode = "A004";
						} else {
							if (pagestoti >= 400 && pagestoti < 500) {
								pagescode = "A005";
							} else {
								if (pagestoti >= 500) {
									pagescode = "A006";
								} else {
								}
							}
						}
					}
				}
			}

			String isbn = this.comp.ISBNTF.getText();
			isbn = isbn.replaceAll("'", "§");

			String place = this.comp.PLACETF.getText();
			place = place.replaceAll("'", "§");

			String plot = this.comp.PLOTTA.getText();
			plot = plot.replaceAll("'", "§");
			

			String coverIdentifier = this.comp.TITLEBOOKTF.getText() + "_" + this.comp.ISBNTF.getText();

			if (result == true) {
				
				// If no exceptions have occurred, the data is entered into the database

				try {
					Database.addBook(title, writer, editor, edition, type, language, pages, pagescode, printyear, prize, isbn, place, plot);
					Database.renameFile(coverIdentifier);
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, e2);
				}

				JOptionPane.showMessageDialog(null, "Libro correttamente registrato!");

				new HomeGui("My Books");
				
				return true;

			}

		}
		
		return false;
	}
	
	

}
