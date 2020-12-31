import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DataSearch implements ActionListener {
	
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: DataSearch
	 * Lines: 300
	 * Description: This class contains the methods for searching books from the library, according to the enabled filters
	 * 
	 * 
	 */
	
	
	

	private LibraryGui butt;
	

	public DataSearch(LibraryGui butt) {
		this.butt = butt;
	}
	
	
	
	
	

	public void actionPerformed(ActionEvent e) {
		
		// Exceptions handled

		if (!e.getSource().equals(this.butt.SEARCH)) {
			return;
		}

		if (this.butt.TITLECHB.isSelected() && this.butt.TITLETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (titolo)");
			return;
		}

		if (this.butt.WRITERCHB.isSelected() && this.butt.WRITERTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (autore)");
			return;
		}

		if (this.butt.EDITORCHB.isSelected() && this.butt.EDITORTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (casa editrice)");
			return;
		}

		if (this.butt.EDITIONCHB.isSelected() && this.butt.EDITIONTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (edizione)");
			return;
		}

		if (this.butt.LANGUAGECHB.isSelected() && this.butt.LANGUAGETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (lingua)");
			return;
		}

		if (this.butt.PRINTYEARCHB.isSelected() && this.butt.PRINTYEARTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (anno di stampa)");
			return;
		}

		if (this.butt.PRIZECHB.isSelected() && this.butt.PRIZETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (prezzo)");
			return;
		}

		if (this.butt.ISBNCHB.isSelected() && this.butt.ISBNTF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (isbn)");
			return;
		}

		if (this.butt.PLACECHB.isSelected() && this.butt.PLACETF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Un campo selezionato non può essere vuoto (allocazione)");
			return;
		}


		if (!this.butt.TITLECHB.isSelected() && !this.butt.WRITERCHB.isSelected() && !this.butt.EDITORCHB.isSelected()
				&& !this.butt.EDITIONCHB.isSelected() && !this.butt.PAGESCHB.isSelected()
				&& !this.butt.TYPECHB.isSelected() && !this.butt.LANGUAGECHB.isSelected()
				&& !this.butt.PRINTYEARCHB.isSelected() && !this.butt.PRIZECHB.isSelected()
				&& !this.butt.ISBNCHB.isSelected() && !this.butt.PLACECHB.isSelected()) {
			JOptionPane.showMessageDialog(null, "Almeno un campo deve essere selezionato per effettuare la ricerca!");
			return;
		}
		

		newEmptyTable();
		newRow();

		if (this.butt.MODEL.getRowCount() > 22) {

			fixRows();
		}

	}
	
	
	
	

	public void newRow() {

		String title = "IS NOT NULL";
		String writer = "IS NOT NULL";
		String editor = "IS NOT NULL";
		String edition = "IS NOT NULL";
		String type = "IS NOT NULL";
		String language = "IS NOT NULL";
		String pagescode = "IS NOT NULL";
		String printyear = "IS NOT NULL";
		String isbn = "IS NOT NULL";
		String prize = "IS NOT NULL";
		String place = "IS NOT NULL";

		if (this.butt.TITLECHB.isSelected()) {
			title = "= '" + this.butt.TITLETF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.WRITERCHB.isSelected()) {
			writer = "= '" + this.butt.WRITERTF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.EDITORCHB.isSelected()) {
			editor = "= '" + this.butt.EDITORTF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.EDITIONCHB.isSelected()) {
			edition = "= '" + this.butt.EDITIONTF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.TYPECHB.isSelected()) {
			type = "= '" + this.butt.TYPECB.getSelectedItem().toString().replaceAll("'", "§") + "'";
		}

		if (this.butt.PAGESCHB.isSelected()) {

			if (this.butt.PAGESCB.getSelectedItem().toString().equals("< 100")) {
				pagescode = "= 'A001'";
			} else {
				if (this.butt.PAGESCB.getSelectedItem().toString().equals(">= 100, < 200")) {
					pagescode = "= 'A002'";
				} else {
					if (this.butt.PAGESCB.getSelectedItem().toString().equals(">= 200, < 300")) {
						pagescode = "= 'A003'";
					} else {
						if (this.butt.PAGESCB.getSelectedItem().toString().equals(">= 300, < 400")) {
							pagescode = "= 'A004'";
						} else {
							if (this.butt.PAGESCB.getSelectedItem().toString().equals(">= 400, < 500")) {
								pagescode = "= 'A005'";
							} else {
								if (this.butt.PAGESCB.getSelectedItem().toString().equals(">= 500")) {
									pagescode = "= 'A006'";
								} else {
								}
							}
						}
					}
				}
			}
		}

		if (this.butt.LANGUAGECHB.isSelected()) {
			language = "= '" + this.butt.LANGUAGETF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.PRINTYEARCHB.isSelected()) {
			printyear = "= '" + this.butt.PRINTYEARTF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.ISBNCHB.isSelected()) {
			isbn = "= '" + this.butt.ISBNTF.getText().replaceAll("'", "§") + "'";
		}

		if (this.butt.PRIZECHB.isSelected()) {
			prize = "= '" + this.butt.PRIZETF.getText().replaceAll(",", ".") + "'";
		}

		if (this.butt.PLACECHB.isSelected()) {
			place = "= '" + this.butt.PLACETF.getText().replaceAll("'", "§") + "'";
		}

		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> records = new ArrayList<String>();

		try {

			id = Database.getId(title, writer, editor, edition, type, language, pagescode, printyear, prize, isbn, place); // this ArrayList contains all the id(s) that meet the conditions selected by the user

			int lenght = id.size();
			int element = 0;
			int counter = 0;

			for (int i = 0; i < lenght; i++) { // the cycle puts in the table the records based on the id(s) in the ArrayList

				element = id.get(counter); // to the variable "element" is assigned the id from the ArrayList based on the counter (increasing by 1)
				records = Database.getRecords(element);

				if (this.butt.MODEL.getValueAt(21, 0) == null) { // check if the value at row 21 is null: in this case a row will be modified. Otherwise, a row will be added to the table (that's the case the books selected exceed the max rows of the table)

					this.butt.MODEL.insertRow(0,
							new Object[] { records.get(0), records.get(1), records.get(2), records.get(4) });
					this.butt.MODEL.removeRow(this.butt.MODEL.getRowCount() - 1);

				} else {

					this.butt.MODEL.addRow(new Object[] { records.get(0), records.get(1), records.get(2), records.get(4) });

				}

				counter = counter + 1;
			}

		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, e1);
		}

	}
	
	
	
	

	public void newEmptyTable() { // provides a new empty table before running the next query

		ArrayList<Integer> delrow = new ArrayList<Integer>();

		int counter = 0;
		int length = 0;
		int rows = this.butt.MODEL.getRowCount() - 1;

		for (int i = 0; i < rows; i++) {

			if (this.butt.MODEL.getValueAt(counter, 0) != null) {
				delrow.add(counter);

			}

			counter = counter + 1;
		}

		length = delrow.size();

		for (; length >= 0; length--) {

			this.butt.MODEL.removeRow(length);
			this.butt.MODEL.addRow(new Object[] { null, null, null, null });
		}

		int lenght2 = 0;

		if (this.butt.MODEL.getRowCount() > 22) {

			for (int i = 23; i < lenght2; i++)

				this.butt.MODEL.removeRow(i);
		}

	}
	
	
	
	
	

	public void fixRows() { // a fix for the number of rows if the total amount is greater than 22 (removes excess rows)

		if (this.butt.MODEL.getValueAt(22, 0) == null) {

			int counter = this.butt.MODEL.getRowCount() - 1;

			while (this.butt.MODEL.getRowCount() != 22) {

				this.butt.MODEL.removeRow(counter);

				counter = counter - 1;

			}

		}

	}

}
