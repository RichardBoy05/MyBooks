import javax.swing.JOptionPane;

public class DeleteElement {
	
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: DeleteElement
	 * Lines: 125
	 * Description: This class contains the methods for deleting books from the library, using Database Class statics methods.
	 * 
	 * 
	 */
	
	
	

	
	public void delete() {

		String book = JOptionPane.showInputDialog(null, "Inserisci il titolo del libro da eliminare");
		
		if(book == null) {
			return;
		}

		try {

			if (!Database.existBook(book)) {
				JOptionPane.showMessageDialog(null, "Libro inesistente!");
				
			} else {
				
				// if there is more than a book with the same title, the method deletingException will run. Otherwise, this method will delete the book with his cover.

				int count = Database.numRecords(book);

				if (count > 1) {

					deletingException(book);

				} else {

					Database.deleteOneImage(book);
					Database.deleteBook(book);
					JOptionPane.showMessageDialog(null, "Libro eliminato con successo!");
				}
			}

		} catch (Exception e1) {

			JOptionPane.showMessageDialog(null, e1);
		}

	}
	
	
	

	
	
	public void deleteAll() {

		int choice = JOptionPane.showConfirmDialog(null,
				"Sei sicuro di voler eliminare tutti i libri? Non potrai recuperare i dati persi in caso di errore!",
				"Select an option", JOptionPane.YES_NO_OPTION);
		if (choice == 0) {
			Database.deleteAll();
		}

	}
	
	
	

	
	
	public void deletingException(String title) throws Exception {

		String[] options = { "Elimina tutti i libri", "Inserisci l'ISBN del libro da eliminare!" };

		int choose = JOptionPane.showOptionDialog(null,
				"Attenzione! Nella tua libreria ci sono più di un libro con titolo '" + title + "'!",
				"Scegli un'opzione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
				options[0]);
		
		// The user can choose to delete all the books with that title, or to delete only one based on the isbn code

		if (choose == 0) {

			Database.deleteBook(title);
			Database.deleteMoreImages(title);
			JOptionPane.showMessageDialog(null, "LIbri eliminati con successo!");

		}

		if (choose == 1) {

			String isbn = JOptionPane.showInputDialog(null, "Inserisci l'ISBN del libro da eliminare");

			if (Database.existISBN(isbn)) {

				try {

					Database.deleteISBN(isbn);
					Database.deleteImagewithISBN(isbn);
					JOptionPane.showMessageDialog(null, "LIbro eliminato con successo!");

				} catch (Exception e) {
					e.printStackTrace();
				}

			} else {

				JOptionPane.showMessageDialog(null, "ISBN inesistente!");
			}
		}

	}
}
