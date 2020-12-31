import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Arrays;

public class NewBookGui extends JFrame {
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: NewBookGui
	 * Lines: 383
	 * Description: UI and Events handling for the NewBook frame, where the user can add or delete books from the library (through SQLite database).
	 * 
	 * 
	 */
	

	
	
	private static final long serialVersionUID = 1L;
	
	// Buttons
	
	public final JButton DONE = new JButton();
	public final JButton DELETE = new JButton();
	public final JButton DELETEALL = new JButton();
	public final JButton PREVIEW = new JButton();
	public final JButton BACKBUTTON = new JButton();

	// Labels

	public final JLabel FIRST = new JLabel("Descrivi il tuo libro");
	public final JLabel TITLEBOOK = new JLabel("Titolo");
	public final JLabel WRITER = new JLabel("Autore");
	public final JLabel EDITOR = new JLabel("Casa Editrice");
	public final JLabel EDITION = new JLabel("N° Edizione");
	public final JLabel TYPE = new JLabel("Genere");
	public final JLabel LANGUAGE = new JLabel("Lingua");
	public final JLabel PAGES = new JLabel("Pagine");
	public final JLabel PRINTYEAR = new JLabel("Anno di stampa");
	public final JLabel PRIZE = new JLabel("Prezzo (€)");
	public final JLabel ISBN = new JLabel("ISBN");
	public final JLabel PLACE = new JLabel("Allocazione");
	public final JLabel PLOT = new JLabel("Trama");
	public final JLabel LINE = new JLabel();
	public final JLabel COVERL = new JLabel("Aggiungi un'immagine di copertina!");

	// TextFields

	public final JTextField TITLEBOOKTF = new JTextField();
	public final JTextField WRITERTF = new JTextField();
	public final JTextField EDITORTF = new JTextField();
	public final JTextField PAGESTF = new JTextField();
	public final JTextField LANGUAGETF = new JTextField();
	public final JTextField PRINTYEARTF = new JTextField();
	public final JTextField PRIZETF = new JTextField();
	public final JTextField ISBNTF = new JTextField();
	public final JTextField PLACETF = new JTextField();
	public final JTextField EDITIONTF = new JTextField();

	// ComboBoxe

	String[] generi = { "Giallo", "Thriller", "Fantascienza", "Fantasy", "Storico", "Di formazione", "Rosa",
			"Avventura", "Horror", "Amicizia", "Biografia", "Umoristico", "Sportivo", "Scolastico", "Tecnico", "Saggio", "Altro" };
	public final JComboBox<String> TYPECB = new JComboBox<String>(generi);

	// TextArea

	public final JTextArea PLOTTA = new JTextArea();

	// Icons

	ImageIcon backbuttonimage = new ImageIcon(getClass().getClassLoader().getResource("undo.png"));
	ImageIcon backbuttonimagepressed = new ImageIcon(getClass().getClassLoader().getResource("undop.png"));
	ImageIcon openfolder = new ImageIcon(getClass().getClassLoader().getResource("openfolder.png"));
	ImageIcon openfolderpressed = new ImageIcon(getClass().getClassLoader().getResource("openfolderp.png"));
	ImageIcon closefolder = new ImageIcon(getClass().getClassLoader().getResource("closefolder.png"));
	ImageIcon delete = new ImageIcon(getClass().getClassLoader().getResource("delete.png"));
	ImageIcon deletepressed = new ImageIcon(getClass().getClassLoader().getResource("deletep.png"));
	ImageIcon deleteall = new ImageIcon(getClass().getClassLoader().getResource("deleteall.png"));
	ImageIcon deleteallpressed = new ImageIcon(getClass().getClassLoader().getResource("deleteallp.png"));
	ImageIcon done = new ImageIcon(getClass().getClassLoader().getResource("done.png"));
	ImageIcon donepressed = new ImageIcon(getClass().getClassLoader().getResource("donep.png"));
	
	ImageIcon x128 = new ImageIcon(getClass().getClassLoader().getResource("128x.png"));
	ImageIcon x64 = new ImageIcon(getClass().getClassLoader().getResource("64x.png"));
	ImageIcon x32 = new ImageIcon(getClass().getClassLoader().getResource("32x.png"));
	
	// Images
	
	Image image1 = x128.getImage();
	Image image2 = x64.getImage();
	Image image3 = x32.getImage();	
    Image[] images = {image1, image2, image3};

	// ScrollPane

	public final JScrollPane SCROLL = new JScrollPane(PLOTTA);

	// Panel

	public final JPanel PANEL = new JPanel();
	
	// Boolean
	
	public boolean isAlreadyChoosen;
	
	

	// Constructor method

	public NewBookGui(String text) {

		super(text);
		setSize(500, 975);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width / 2) - (super.getWidth() / 2), (screenSize.height / 2) - (super.getHeight() / 2));
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setIconImages(Arrays.asList(images));

		// Bounds Settings

		FIRST.setBounds(25, 7, 700, 50);
		TITLEBOOK.setBounds(34, 70, 150, 30);
		WRITER.setBounds(34, 112, 150, 30);
		EDITOR.setBounds(34, 154, 200, 30);
		EDITION.setBounds(34, 196, 150, 30);
		TYPE.setBounds(34, 238, 150, 30);
		LANGUAGE.setBounds(34, 280, 150, 30);
		PAGES.setBounds(34, 322, 150, 30);
		PRINTYEAR.setBounds(34, 364, 200, 30);
		PRIZE.setBounds(34, 406, 150, 30);
		ISBN.setBounds(34, 448, 150, 30);
		PLACE.setBounds(34, 490, 150, 30);
		PLOT.setBounds(34, 532, 150, 30);
		LINE.setBounds(-1, 53, 503, 4);
		TITLEBOOKTF.setBounds(221, 70, 235, 35);
		WRITERTF.setBounds(221, 112, 235, 35);
		EDITORTF.setBounds(221, 154, 235, 35);
		EDITIONTF.setBounds(221, 196, 235, 35);
		PAGESTF.setBounds(221, 322, 235, 35);
		LANGUAGETF.setBounds(221, 280, 235, 35);
		PRINTYEARTF.setBounds(221, 364, 235, 35);
		PRIZETF.setBounds(221, 406, 235, 35);
		ISBNTF.setBounds(221, 448, 235, 35);
		PLACETF.setBounds(221, 490, 235, 35);
		TYPECB.setBounds(221, 238, 235, 35);
		DONE.setBounds(145, 835, 180, 75);
		BACKBUTTON.setBounds(-1, 885, 50, 50);
		DELETE.setBounds(360, 835, 130, 35);
		DELETEALL.setBounds(360, 875, 130, 35);
		PREVIEW.setBounds(25, 600, 165, 165);
		SCROLL.setBounds(221, 532, 235, 284);
		COVERL.setBounds(15, 750, 200, 50);
		
		// Icons Setting

		BACKBUTTON.setIcon(backbuttonimage);
		BACKBUTTON.setRolloverIcon(backbuttonimagepressed);
		PREVIEW.setIcon(openfolder);
		PREVIEW.setRolloverIcon(openfolderpressed);
        DELETE.setIcon(delete);
        DELETE.setRolloverIcon(deletepressed);
		DELETEALL.setIcon(deleteall);
		DELETEALL.setRolloverIcon(deleteallpressed);
		DONE.setIcon(done);
		DONE.setRolloverIcon(donepressed);

		// Fonts and Borders Settings

		var firstf = new Font("Algerian", Font.BOLD, 40);
		var labelsf = new Font("DialogInput", Font.ITALIC, 20);
		var donef = new Font("TimesRoman", Font.BOLD, 31);
		var tff = new Font("Arial", Font.PLAIN, 17);
		var cbf = new Font("Arial", Font.BOLD, 17);
		var clf = new Font("Arial", Font.ITALIC, 12);
		
		Border initborder = TITLEBOOKTF.getBorder();
		Border emptyborder = BorderFactory.createEmptyBorder(4, 4, 4, 4);
		CompoundBorder border = new CompoundBorder(initborder, emptyborder);
		
		Border initplottaborder = BorderFactory.createLineBorder(Color.gray);
		CompoundBorder plottaborder = new CompoundBorder(initplottaborder, emptyborder);

		FIRST.setFont(firstf);
		TITLEBOOK.setFont(labelsf);
		WRITER.setFont(labelsf);
		EDITOR.setFont(labelsf);
		EDITION.setFont(labelsf);
		TYPE.setFont(labelsf);
		LANGUAGE.setFont(labelsf);
		PAGES.setFont(labelsf);
		PRINTYEAR.setFont(labelsf);
		PRIZE.setFont(labelsf);
		ISBN.setFont(labelsf);
		PLACE.setFont(labelsf);
		PLOT.setFont(labelsf);
		DONE.setFont(donef);
		TITLEBOOKTF.setFont(tff);
		WRITERTF.setFont(tff);
		EDITORTF.setFont(tff);
		EDITIONTF.setFont(tff);
		TYPECB.setFont(cbf);
		LANGUAGETF.setFont(tff);
		PAGESTF.setFont(tff);
		PRINTYEARTF.setFont(tff);
		PRIZETF.setFont(tff);
		ISBNTF.setFont(tff);
		PLACETF.setFont(tff);
		PLOTTA.setFont(tff);
		COVERL.setFont(clf);
		
		TITLEBOOKTF.setBorder(border);
		WRITERTF.setBorder(border);
		EDITORTF.setBorder(border);
		EDITIONTF.setBorder(border);
		LANGUAGETF.setBorder(border);
		PRINTYEARTF.setBorder(border);
		ISBNTF.setBorder(border);
		PRIZETF.setBorder(border);
		PLACETF.setBorder(border);
		PLOTTA.setBorder(plottaborder);
		
		DELETE.setBorder(null);
		DELETE.setContentAreaFilled(false);
		DELETEALL.setBorder(null);
		DELETEALL.setContentAreaFilled(false);
		DONE.setBorder(null);
		DONE.setContentAreaFilled(false);
		
		LINE.setBorder(BorderFactory.createLineBorder(Color.black));
		
		PREVIEW.setBorder(BorderFactory.createEmptyBorder());
		PREVIEW.setContentAreaFilled(false);
		
		BACKBUTTON.setContentAreaFilled(false);
		BACKBUTTON.setBorder(BorderFactory.createEmptyBorder());
	
		PLOTTA.setLineWrap(true);
		PLOTTA.setWrapStyleWord(true);
		
		DONE.setFocusPainted(false);
		BACKBUTTON.setFocusPainted(false);
		DELETE.setFocusPainted(false);
		DELETEALL.setFocusPainted(false);
		PREVIEW.setFocusPainted(false);	
		
		// HoverEvents
		
		PREVIEW.setToolTipText("Clicca per inserire un'immagine di copertina");
		TITLEBOOK.setToolTipText("Inserisci il titolo del libro");
		WRITER.setToolTipText("Inserisci l'autore del libro");
		EDITOR.setToolTipText("Inserisci la casa editrice del libro");
		EDITION.setToolTipText("Inserisci il numero di edizione del libro");
		TYPE.setToolTipText("Seleziona il genere del libro");
		LANGUAGE.setToolTipText("Inserisci la lingua usata nel libro");
		PAGES.setToolTipText("Inserisci il numero di pagine del libro");
		PRINTYEAR.setToolTipText("Inserisci l'anno di stampa del libro");
		PRIZE.setToolTipText("Inserisci il prezzo di copertina del libro");
		ISBN.setToolTipText("Inserisci il codice ISBN del libro");
		PLACE.setToolTipText("Inserisci il luogo dove conservi il libro");
		PLOT.setToolTipText("Inserisci la trama del libro");
		

		// JScrollPane settings
		
		SCROLL.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		SCROLL.setForeground(Color.WHITE);
		SCROLL.setBorder(null);

		// Adding components

		add(FIRST);
		add(TITLEBOOK);
		add(WRITER);
		add(EDITOR);
		add(EDITION);
		add(TYPE);
		add(LANGUAGE);
		add(PAGES);
		add(PRINTYEAR);
		add(PRIZE);
		add(ISBN);
		add(PLACE);
		add(PLOT);
		add(LINE);
		add(TITLEBOOKTF);
		add(WRITERTF);
		add(EDITORTF);
		add(PAGESTF);
		add(LANGUAGETF);
		add(PRINTYEARTF);
		add(PRIZETF);
		add(ISBNTF);
		add(PLACETF);
		add(EDITIONTF);
		add(TYPECB);
		add(SCROLL);
		add(DONE);
		add(BACKBUTTON);
		add(DELETE);
		add(DELETEALL);
		add(PREVIEW);
		add(COVERL);


		

		// Events
		
		unknownFile(); // deleting non-confirmed covers
		

		var insertOperations = new InsertElement(this);
		var deleteOperations = new DeleteElement();
		

		PREVIEW.addActionListener(e -> {
			
			if(isAlreadyChoosen == false) {
			insertOperations.addCover();
			} else {
				JOptionPane.showMessageDialog(null, "Hai già selezionato un'immagine di copertina!");
			}
		});

	
		
		DONE.addActionListener(e -> {
			boolean check = insertOperations.addNewBook();
			if (check == true) {
				super.dispose();
			}
		});

		
		
		BACKBUTTON.addActionListener(e -> {
			super.dispose();
			new HomeGui("My Books");
		});
		
		

		DELETE.addActionListener(e -> {
			deleteOperations.delete();
		});

		
		
		DELETEALL.addActionListener(e -> {
			deleteOperations.deleteAll();
		});

	}
	
	
	
	

	public void unknownFile() {

		var error = new File("./covers/unknown_x");
		if (error.exists()) {
			error.delete();
		}
	}

}
