import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: Database
	 * Lines: 545
	 * Description: This class provides all the statics methods for the database (SQLite -> MyBooksDB.db)
	 * 
	 * 
	 */
	
	
	

	public static Connection getConnection() throws Exception {

		Connection conn = null;
		
		try {
			Class.forName("org.sqlite.JDBC");

			conn = DriverManager.getConnection("jdbc:sqlite:./MyBooksDB.db");

		} catch (ClassNotFoundException | SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Database mancante! Assicurarsi che il file MyBooksDB.db sia nella stessa cartella del file eseguibile!\n"+e);
		}
		return conn;
	}
	
	
	
	
	
	
	public static void addBook(String title, String writer, String editor, int edition, String type, String language, int pages, String pagescode, int printyear, double prize, String isbn, String place, String plot) throws Exception {

		try {
            Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement(
					"INSERT INTO books (title, writer, editor, edition, type, language, pages, pagescode, printyear, prize, isbn, place, plot) VALUES ('"
							+ title + "','" + writer + "','" + editor + "'," + edition + ",'" + type + "','" + language
							+ "'," + pages + ",'" + pagescode + "'," + printyear + "," + prize + ",'" + isbn + "','"
							+ place + "','" + plot + "')");

			posted.executeUpdate();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Database irraggiungibile!\n"+e);
		}
	}
	
	
	
	

	
	public static void deleteBook(String title) {

		try {

			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("DELETE FROM books WHERE title = '" + title + "'");

			posted.executeUpdate();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Database irraggiungibile!\n"+e);
		}
	}
	
	
	
	

	public static void deleteAll() {

		try {

			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("DELETE FROM books");

			posted.executeUpdate();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Database irraggiungibile!\n"+e);
		}

		File directory = new File("./covers");
		File[] files = directory.listFiles();
		for (File f : files)
			f.delete();

		JOptionPane.showMessageDialog(null, "Libreria svuotata!");

	}

	
	
	
	
	public static String deleteISBN(String isbn) throws Exception {

		Connection con = getConnection();
		PreparedStatement posted = con.prepareStatement("SELECT title FROM books WHERE isbn = '" + isbn + "'");
		PreparedStatement posted2 = con.prepareStatement("DELETE FROM books WHERE isbn = '" + isbn + "'");

		ResultSet result = posted.executeQuery();
		posted2.executeUpdate();

		String title = null;

		while (result.next()) {

			title = result.getString(1);

		}

		return title;

	}
	
	
	
	

	public static boolean existISBN(String isbn) throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM books WHERE isbn = '" + isbn + "'");
		ResultSet result = statement.executeQuery();
		String check = "";
		
		while (result.next()) {
			check = result.getString(1);
		}

		if (check.equals("")) {
			return false;
		} else {
			return true;

		}
	}
	
	
	
	

	public static ArrayList<Integer> getId(String title, String writer, String editor, String edition, String type,String language, String pagescode, String printyear, String prize, String isbn, String place) throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT id FROM books WHERE title " + title + " AND writer "
				+ writer + " AND editor " + editor + " AND edition " + edition + " AND type " + type + " AND language "
				+ language + " AND pagescode " + pagescode + " AND printyear " + printyear + " AND prize " + prize
				+ " AND ISBN " + isbn + " AND place " + place);
		ResultSet result = statement.executeQuery();

		ArrayList<Integer> id = new ArrayList<Integer>();
		while (result.next()) {
			id.add(result.getInt(1));

		}

		return id;
	}

	
	
	
	
	public static ArrayList<String> getRecords(int id) throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM books WHERE id = " + id + "");
		ResultSet result = statement.executeQuery();

		ArrayList<String> records = new ArrayList<String>();

		while (result.next()) {
			records.add(result.getString(2).replaceAll("§", "'"));
			records.add(result.getString(3).replaceAll("§", "'"));
			records.add(result.getString(4).replaceAll("§", "'"));
			records.add(result.getString(5).replaceAll("§", "'"));
			records.add(result.getString(6).replaceAll("§", "'"));
			records.add(result.getString(7).replaceAll("§", "'"));
			records.add(result.getString(8).replaceAll("§", "'"));
			records.add(result.getString(9).replaceAll("§", "'"));
			records.add(result.getString(10).replaceAll("§", "'"));
			records.add(result.getString(11).replaceAll("§", "'"));

		}

		return records;
	}
	
	
	
	

	public static boolean existBook(String title) throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM books WHERE title = '" + title + "'");

		ResultSet result = statement.executeQuery();

		String check = "";

		while (result.next()) {
			check = result.getString(2);
		}

		if (check.equals("")) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	

	public static int numRecords(String title) throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT id FROM books WHERE title = '" + title + "'");
		ResultSet result = statement.executeQuery();

		ArrayList<Integer> id = new ArrayList<Integer>();

		while (result.next()) {
			id.add(result.getInt(1));

		}

		return id.size();
	}
	
	
	
	

	public static boolean isEmptyDB() throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT id FROM books");
		ResultSet result = statement.executeQuery();

		ArrayList<Integer> id = new ArrayList<Integer>();

		while (result.next()) {
			id.add(result.getInt(1));
		}

		int size = id.size();
		
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	
	
	
	
	public static void deleteOneImage(String title) throws Exception {

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT title, isbn FROM books WHERE title = '" + title + "'");
     	ResultSet result = statement.executeQuery();

		ArrayList<String> records = new ArrayList<String>();

		while (result.next()) {
			records.add(result.getString(1));
			records.add(result.getString(2));
		}

		var image = new File("./covers/" + records.get(0) + "_" + records.get(1));
		
		if (image.exists()) {
			image.delete();
		}
	}

	
	
	
	
	public static void deleteMoreImages(String title) {

		var<String> results = new ArrayList<String>();
		File[] files = new File("./covers").listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
			}
		}

		int size = results.size();

		for (int i = 0; i < size; i++) {

			String file = results.get(i);
			String[] subfilearray = file.split("_");
			String subfile = subfilearray[0];

			if (subfile.equals(title)) {

				File image = new File("./covers/" + file);

				if (image.exists()) {
					image.delete();
				}
			}
		}
	}	
	
	
	

	
	public static void deleteImagewithISBN(String isbn) {

		var<String> results = new ArrayList<String>();
		File[] files = new File("./covers").listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
			}
		}

		int size = results.size();

		for (int i = 0; i < size; i++) {

			String file = results.get(i);
			String[] subfilearray = file.split("_");
			String subfile = subfilearray[1];

			if (subfile.equals(isbn)) {

				File image = new File("./covers/" + file);

				if (image.exists()) {
					image.delete();
				}
			}
		}
	}
	
	
	
	

	
	
	
	
	

	public static boolean saveImage() {

		JFileChooser fc = null;
		File pathfile = new File("./lastDir.txt");
		String lastdir = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader(pathfile);
			BufferedReader b = new BufferedReader(reader);
			lastdir = b.readLine();
			b.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}

		LookAndFeel previousLF = UIManager.getLookAndFeel();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			fc = new JFileChooser(lastdir);
			UIManager.setLookAndFeel(previousLF);
		} catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {

			JOptionPane.showMessageDialog(null, "Errore nell'inserimento dell'immagine! ("+e+")");
		}

		fc.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "jpeg", "bmp", "ico"));
		int choose = fc.showOpenDialog(null);
		
		if (choose == JFileChooser.APPROVE_OPTION) {
			String path = fc.getSelectedFile().getAbsolutePath();
			
			try {
				PrintWriter printer = new PrintWriter(new FileWriter(pathfile, false));
				printer.println(path);
				printer.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e);
			}
			

			try {
				copyFile(path);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Errore nell'inserimento dell'immagine! ("+e+")");
			}
			return true;
		} else {
		    return false;
		}
	}
	
	
	
	

	public static void copyFile(String path) throws FileNotFoundException, IOException {

		var source = new File(path);
		File copy = new File("./covers/unknown_x");
		InputStream in = new FileInputStream(source);
		OutputStream out = new FileOutputStream(copy);
		byte[] buf = new byte[1024];
		int len;
		
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		
		in.close();
		out.close();
	}
	
	
	
	

	public static void renameFile(String code) {

		var oldfile = new File("./covers/unknown_x");
		var newfile = new File("./covers/" + code);

		if (oldfile.exists()) {
			oldfile.renameTo(newfile);
		}

	}
	
	
	
	
	
	
	public static ArrayList<String> viewMore() throws Exception {

		String title = "";
		String writer = "";
		String editor = "";
		String type = "";

		try {
			File temp = new File("./temp.txt");
			FileReader reader = new FileReader(temp);
			BufferedReader b = new BufferedReader(reader);

			title = b.readLine();
			writer = b.readLine();
			editor = b.readLine();
			type = b.readLine();

			b.close();

			temp.delete();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}

		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM books WHERE title = '" + title
				+ "' AND writer = '" + writer + "' AND editor = '" + editor + "' AND type = '" + type + "'");
		ResultSet result = statement.executeQuery();

		var<String> records = new ArrayList<String>();

		while (result.next()) {
			records.add(result.getString(2));
			records.add(result.getString(3));
			records.add(result.getString(4));
			records.add(result.getString(5));
			records.add(result.getString(6));
			records.add(result.getString(7));
			records.add(result.getString(8));
			records.add(result.getString(9));
			records.add(result.getString(10));
			records.add(result.getString(11));
			records.add(result.getString(12));
			records.add(result.getString(13));
			records.add(result.getString(14));
		}

		return records;
	}

}
