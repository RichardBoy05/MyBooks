import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ViewAll implements ActionListener {

	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: ViewAll
	 * Lines: 169
	 * Description: This class allow the user to view all his books pressing a single button (the methods used are the same of the DataSearch class)
	 * 
	 * 
	 */

	private LibraryGui all;

	public ViewAll(LibraryGui all) {
		this.all = all;
	}

	
	
	
	public void actionPerformed(ActionEvent e) {

		try {

			if (Database.isEmptyDB() == true) {

				JOptionPane.showMessageDialog(null, "La libreria è vuota!");
				return;

			}

		} catch (Exception e1) {
		}

		newEmptyTable();
		showAll();

		if (this.all.MODEL.getRowCount() > 22) {
			fixRows();
		}
	}

	
	
	
	
	public void showAll() {

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

		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> records = new ArrayList<String>();

		try {

			id = Database.getId(title, writer, editor, edition, type, language, pagescode, printyear, prize, isbn,
					place);

			int lenght = id.size();
			int tempid = 0;
			int counter = 0;

			for (int i = 0; i < lenght; i++) {

				tempid = id.get(counter);
				records = Database.getRecords(tempid);

				if (this.all.MODEL.getValueAt(21, 0) == null) {

					this.all.MODEL.insertRow(0,
							new Object[] { records.get(0), records.get(1), records.get(2), records.get(4) });
					this.all.MODEL.removeRow(this.all.MODEL.getRowCount() - 1);

				} else {

					this.all.MODEL
							.addRow(new Object[] { records.get(0), records.get(1), records.get(2), records.get(4) });

				}

				counter = counter + 1;
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1);
		}
	}

	
	
	
	
	public void newEmptyTable() {

		ArrayList<Integer> delrow = new ArrayList<Integer>();

		int counter = 0;
		int length = 0;
		int rows = this.all.MODEL.getRowCount() - 1;

		for (int i = 0; i < rows; i++) {

			if (this.all.MODEL.getValueAt(counter, 0) != null) {
				delrow.add(counter);

			}

			counter = counter + 1;
		}

		length = delrow.size();

		for (; length >= 0; length--) {

			this.all.MODEL.removeRow(length);
			this.all.MODEL.addRow(new Object[] { null, null, null, null });
		}

		int lenght2 = 0;

		if (this.all.MODEL.getRowCount() > 22) {

			for (int i = 23; i < lenght2; i++)

				this.all.MODEL.removeRow(i);
		}
	}

	
	
	
	
	public void fixRows() {

		if (this.all.MODEL.getValueAt(22, 0) == null) {

			int counter = this.all.MODEL.getRowCount() - 1;

			while (this.all.MODEL.getRowCount() != 22) {

				this.all.MODEL.removeRow(counter);

				counter = counter - 1;

			}

		}

	}

}
