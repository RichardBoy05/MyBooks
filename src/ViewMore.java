import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class ViewMore implements ActionListener {
	
	
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: ViewAll
	 * Lines: 90
	 * Description: this class contains the action performed by pressing the ViewMore button in the Library frame.
	 * 
	 * 
	 */
	
	
	private LibraryGui comp;
	
	
	public ViewMore(LibraryGui comp) {
		
		this.comp = comp;
	}
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		int idr = this.comp.output.getSelectedRow();
		
		// Exceptions handled

		if (idr == -1) {
			JOptionPane.showMessageDialog(null, "Nessun libro selezionato!");
			return;
		}

		if (this.comp.MODEL.getValueAt(idr, 0) == null) {
			JOptionPane.showMessageDialog(null, "La riga selezionata è vuota!");
			return;
		}

		String title = this.comp.MODEL.getValueAt(idr, 0).toString().replaceAll("'", "§");
		String writer = this.comp.MODEL.getValueAt(idr, 1).toString().replaceAll("'", "§");
		String editor = this.comp.MODEL.getValueAt(idr, 2).toString().replaceAll("'", "§");
		String type = this.comp.MODEL.getValueAt(idr, 3).toString().replaceAll("'", "§");

		File temp = new File("./temp.txt"); //temporary file for passing the values to the InfoBookGui

		if (!temp.exists()) {

			try {
				PrintWriter printer = new PrintWriter(new FileWriter(temp, true));

				printer.println(title);
				printer.println(writer);
				printer.println(editor);
				printer.println(type);

				printer.flush();
				printer.close();

			} catch (IOException e1) {

				JOptionPane.showMessageDialog(null, e1);
			}
		}

		new InfoBookGui("MyBooks");
		
		
	}
	

}
