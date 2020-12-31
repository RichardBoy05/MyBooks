import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Arrays;

public class LibraryGui extends JFrame {
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: LibraryGui
	 * Lines: 510
	 * Description: UI and Events handling for the library frame (here the user can search books from his library, using filters).
	 * 
	 * 
	 */
	
	
	

	private static final long serialVersionUID = 1L;
	
	// Buttons
	
	public final JButton SEARCH = new JButton();
	public final JButton MORE = new JButton();
	public final JButton BACKBUTTON = new JButton();
	public final JButton VIEWALL = new JButton();
	
	// Labels
	
	public final JLabel TITLE = new JLabel("LA MIA LIBRERIA");
	public final JLabel FILTER = new JLabel("Filtri di ricerca");
	public final JLabel SEARCHL = new JLabel();
	public final JLabel LINE = new JLabel();
	public final JLabel SHELF = new JLabel();
	
	// TextFields
	
	public final JTextField TITLETF = new JTextField();
	public final JTextField WRITERTF = new JTextField();
	public final JTextField EDITORTF = new JTextField();
	public final JTextField EDITIONTF = new JTextField();
	public final JTextField LANGUAGETF = new JTextField();
	public final JTextField PRINTYEARTF = new JTextField();
	public final JTextField PRIZETF = new JTextField();
	public final JTextField ISBNTF = new JTextField();
	public final JTextField PLACETF = new JTextField();
	
	// ComboBoxes
	
	String[] generi = { "Giallo", "Thriller", "Fantascienza", "Fantasy", "Storico", "Di formazione", "Rosa",
			"Avventura", "Horror", "Amicizia", "Biografia", "Umoristico", "Sportivo", "Scolastico", "Tecnico", "Saggio", "Altro" };
	public final JComboBox<String> TYPECB = new JComboBox<String>(generi);

	String[] pagine = { "< 100", ">= 100, < 200", ">= 200, < 300", ">= 300, < 400", ">= 400, < 500", ">= 500" };
	public final JComboBox<String> PAGESCB = new JComboBox<String>(pagine);
	
	// CheckBoxes
	
	public final JCheckBox TITLECHB = new JCheckBox(" Titolo");
	public final JCheckBox WRITERCHB = new JCheckBox(" Autore");
	public final JCheckBox EDITORCHB = new JCheckBox(" Editore");
	public final JCheckBox EDITIONCHB = new JCheckBox(" N° Edizione");
	public final JCheckBox TYPECHB = new JCheckBox(" Genere");
	public final JCheckBox LANGUAGECHB = new JCheckBox(" Lingua ");
	public final JCheckBox PAGESCHB = new JCheckBox(" Pagine");
	public final JCheckBox PRINTYEARCHB = new JCheckBox(" Stampa");
	public final JCheckBox PRIZECHB = new JCheckBox(" Prezzo");
	public final JCheckBox ISBNCHB = new JCheckBox(" ISBN");
	public final JCheckBox PLACECHB = new JCheckBox(" Allocazione");

    // Table
	

	String[] columnNames = { "Titolo", "Autore", "Editore", "Genere" };
	Object[][] data = {
			{}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}
	};

	public final DefaultTableModel MODEL = new DefaultTableModel(data, columnNames);
	
	JTable output = new JTable(MODEL) {
		private static final long serialVersionUID = 1L;
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	};

	// ImageIcons

	ImageIcon backimage = new ImageIcon(getClass().getClassLoader().getResource("undo.png"));
	ImageIcon backimagepressed = new ImageIcon(getClass().getClassLoader().getResource("undop.png"));
	ImageIcon searchimage = new ImageIcon(getClass().getClassLoader().getResource("searchimage.png"));
	ImageIcon searchb = new ImageIcon(getClass().getClassLoader().getResource("search.png"));
	ImageIcon searchbpressed = new ImageIcon(getClass().getClassLoader().getResource("searchp.png"));
	ImageIcon viewall = new ImageIcon(getClass().getClassLoader().getResource("viewall.png"));
	ImageIcon viewallpressed = new ImageIcon(getClass().getClassLoader().getResource("viewallp.png"));
	ImageIcon viewmore = new ImageIcon(getClass().getClassLoader().getResource("viewmore.png"));
	ImageIcon viewmorepressed = new ImageIcon(getClass().getClassLoader().getResource("viewmorep.png"));
	ImageIcon bookshelf = new ImageIcon(getClass().getClassLoader().getResource("bookshelf.png"));
	
	ImageIcon x128 = new ImageIcon(getClass().getClassLoader().getResource("128x.png"));
	ImageIcon x64 = new ImageIcon(getClass().getClassLoader().getResource("64x.png"));
	ImageIcon x32 = new ImageIcon(getClass().getClassLoader().getResource("32x.png"));
	
	// Images
	
	Image image1 = x128.getImage();
	Image image2 = x64.getImage();
	Image image3 = x32.getImage();
    Image[] images = {image1, image2, image3};
	

	

	
	// Constructor Method


	public LibraryGui(String text) {

		super(text);
		setSize(1400, 950);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width / 2) - (super.getWidth() / 2), (screenSize.height / 2) - (super.getHeight() / 2));
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setIconImages(Arrays.asList(images));

		TITLETF.setEnabled(false);
		WRITERTF.setEnabled(false);
		EDITORTF.setEnabled(false);
		EDITIONTF.setEnabled(false);
		TYPECB.setEnabled(false);
		PAGESCB.setEnabled(false);
		LANGUAGETF.setEnabled(false);
		PRINTYEARTF.setEnabled(false);
		PRIZETF.setEnabled(false);
		ISBNTF.setEnabled(false);
		PLACETF.setEnabled(false);

		// Bounds Settings

		BACKBUTTON.setBounds(-1, 860, 50, 50);
		TITLE.setBounds(203, 3, 500, 100);
		TITLECHB.setBounds(880, 103, 200, 60);
		WRITERCHB.setBounds(880, 163, 200, 60);
		EDITORCHB.setBounds(880, 223, 200, 60);
		EDITIONCHB.setBounds(880, 283, 200, 60);
		TYPECHB.setBounds(880, 343, 200, 60);
		PAGESCHB.setBounds(880, 403, 200, 60);
		LANGUAGECHB.setBounds(880, 463, 200, 60);
		PRINTYEARCHB.setBounds(880, 523, 200, 60);
		PRIZECHB.setBounds(880, 583, 200, 60);
		ISBNCHB.setBounds(880, 643, 200, 60);
		PLACECHB.setBounds(880, 703, 200, 60);
		SEARCHL.setBounds(925, 735, 200, 200);
		FILTER.setBounds(882, 5, 500, 100);
		LINE.setBounds(843, -1, 4, 902);
		TITLETF.setBounds(1080, 110, 270, 43);
		WRITERTF.setBounds(1080, 170, 270, 43);
		EDITORTF.setBounds(1080, 230, 270, 43);
		EDITIONTF.setBounds(1080, 290, 270, 43);
		LANGUAGETF.setBounds(1080, 470, 270, 43);
		PRINTYEARTF.setBounds(1080, 530, 270, 43);
		PRIZETF.setBounds(1080, 590, 270, 43);
		ISBNTF.setBounds(1080, 650, 270, 43);
		PLACETF.setBounds(1080, 710, 270, 43);
		TYPECB.setBounds(1080, 350, 270, 43);
		PAGESCB.setBounds(1080, 410, 270, 43);
		SEARCH.setBounds(1110, 790, 200, 100);
		VIEWALL.setBounds(625, 730, 200, 70);
		MORE.setBounds(625, 800, 200, 70);
		SHELF.setBounds(85, 670, 570, 240);
		
		// Icons Settings
		
		BACKBUTTON.setRolloverIcon(backimagepressed);
		BACKBUTTON.setIcon(backimage);
		SEARCHL.setIcon(searchimage);
		SEARCH.setRolloverIcon(searchbpressed);
		SEARCH.setIcon(searchb);
		VIEWALL.setIcon(viewall);
		VIEWALL.setRolloverIcon(viewallpressed);
		MORE.setIcon(viewmore);
		MORE.setRolloverIcon(viewmorepressed);
		SHELF.setIcon(bookshelf);

		// Font and Borders Settings

		var checkboxf = new Font("DialogInput", Font.ITALIC, 20);
		var titlef = new Font("Algerian", Font.BOLD, 52);
		var tff = new Font("Arial", Font.PLAIN, 18);
		var buttf = new Font("Consolas", Font.ITALIC, 20);
		var headerf = new Font("Arial", Font.ITALIC, 17);
		
		Border initborder = TITLETF.getBorder();
		Border emptyborder = BorderFactory.createEmptyBorder(4, 4, 4, 4);
		CompoundBorder border = new CompoundBorder(initborder, emptyborder);

		TITLECHB.setFont(checkboxf);
		WRITERCHB.setFont(checkboxf);
		EDITORCHB.setFont(checkboxf);
		EDITIONCHB.setFont(checkboxf);
		TYPECHB.setFont(checkboxf);
		PAGESCHB.setFont(checkboxf);
		LANGUAGECHB.setFont(checkboxf);
		PRINTYEARCHB.setFont(checkboxf);
		PRIZECHB.setFont(checkboxf);
		ISBNCHB.setFont(checkboxf);
		PLACECHB.setFont(checkboxf);
		TITLETF.setFont(tff);
		WRITERTF.setFont(tff);
		EDITORTF.setFont(tff);
		EDITIONTF.setFont(tff);
		TYPECB.setFont(tff);
		PAGESCB.setFont(tff);
		LANGUAGETF.setFont(tff);
		PRINTYEARTF.setFont(tff);
		PRIZETF.setFont(tff);
		ISBNTF.setFont(tff);
		PLACETF.setFont(tff);
		FILTER.setFont(titlef);
		TITLE.setFont(titlef);
		SEARCH.setFont(buttf);
		
		TITLETF.setBorder(border);
		WRITERTF.setBorder(border);
		EDITORTF.setBorder(border);
		EDITIONTF.setBorder(border);
		LANGUAGETF.setBorder(border);
		PRINTYEARTF.setBorder(border);
		ISBNTF.setBorder(border);
		PRIZETF.setBorder(border);
		PLACETF.setBorder(border);

		LINE.setBorder(BorderFactory.createLineBorder(Color.black));
		
		SEARCH.setBorder(null);
		SEARCH.setContentAreaFilled(false);
		
		VIEWALL.setBorder(null);
		VIEWALL.setContentAreaFilled(false);
		
		MORE.setBorder(null);
	    MORE.setContentAreaFilled(false);
		
		BACKBUTTON.setContentAreaFilled(false);
		BACKBUTTON.setBorder(BorderFactory.createEmptyBorder());
		
		TITLECHB.setFocusPainted(false);
		WRITERCHB.setFocusPainted(false);
		EDITORCHB.setFocusPainted(false);
		TYPECHB.setFocusPainted(false);
		PAGESCHB.setFocusPainted(false);
		PRINTYEARCHB.setFocusPainted(false);
		PRIZECHB.setFocusPainted(false);
		ISBNCHB.setFocusPainted(false);
		PLACECHB.setFocusPainted(false);
		BACKBUTTON.setFocusPainted(false);
		SEARCH.setFocusPainted(false);
		MORE.setFocusPainted(false);
		VIEWALL.setFocusPainted(false);
		
		// Hover Events
		
		VIEWALL.setToolTipText("Clicca per visualizzare tutti i libri registrati");
		MORE.setToolTipText("Clicca per ulteriori informazioni sul libro selezionato");

		// Table settings

		output.setLayout(new FlowLayout());
		output.setPreferredScrollableViewportSize(new Dimension(1000, 50));
		output.setLayout(new FlowLayout());
		output.setFillsViewportHeight(true);
		output.setBounds(30, 100, 775, 582);
		output.setRowHeight(25);
		output.setFont(tff);
		output.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JTableHeader header = output.getTableHeader();
		header.setFont(headerf);
		header.setReorderingAllowed(false);
		header.setPreferredSize(new Dimension(0, 30));

		var scroll = new JScrollPane(output);
		scroll.setBounds(30, 100, 775, 582);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setForeground(Color.WHITE);
		scroll.setBorder(null);

		// Adding components

		add(BACKBUTTON);
		add(TITLE);
		add(TITLECHB);
		add(WRITERCHB);
		add(EDITORCHB);
		add(EDITIONCHB);
		add(LANGUAGECHB);
		add(TYPECHB);
		add(PAGESCHB);
		add(PRINTYEARCHB);
		add(PRIZECHB);
		add(ISBNCHB);
		add(PLACECHB);
		add(SEARCHL);
		add(FILTER);
		add(LINE);
		add(TITLETF);
		add(WRITERTF);
		add(EDITORTF);
		add(EDITIONTF);
		add(LANGUAGETF);
		add(PRINTYEARTF);
		add(PRIZETF);
		add(ISBNTF);
		add(PLACETF);
		add(TYPECB);
		add(PAGESCB);
		add(scroll);
		add(SEARCH);
		add(MORE);
		add(VIEWALL);
		add(SHELF);

		// ItemListeners
	
		TITLECHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (TITLECHB.isSelected()) {
					TITLETF.setEnabled(true);
				} else {
					if (!TITLECHB.isSelected()) {
						TITLETF.setEnabled(false);
					}
				}
			}
		});

		WRITERCHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (WRITERCHB.isSelected()) {
					WRITERTF.setEnabled(true);
				} else {

					if (!WRITERCHB.isSelected()) {
						WRITERTF.setEnabled(false);
					}
				}
			}
		});

		EDITORCHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (EDITORCHB.isSelected()) {
					EDITORTF.setEnabled(true);
				} else {
					if (!EDITORCHB.isSelected()) {
						EDITORTF.setEnabled(false);
					}
				}
			}
		});

		EDITIONCHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (EDITIONCHB.isSelected()) {
					EDITIONTF.setEnabled(true);
				} else {
					if (!EDITIONCHB.isSelected()) {
						EDITIONTF.setEnabled(false);
					}
				}
			}
		});

		PAGESCHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (PAGESCHB.isSelected()) {
					PAGESCB.setEnabled(true);
				} else {
					if (!PAGESCHB.isSelected()) {
						PAGESCB.setEnabled(false);
					}
				}
			}
		});

		LANGUAGECHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (LANGUAGECHB.isSelected()) {
					LANGUAGETF.setEnabled(true);
				} else {
					if (!LANGUAGECHB.isSelected()) {
						LANGUAGETF.setEnabled(false);
					}
				}
			}
		});

		PRINTYEARCHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (PRINTYEARCHB.isSelected()) {
					PRINTYEARTF.setEnabled(true);
				} else {
					if (!PRINTYEARCHB.isSelected()) {
						PRINTYEARTF.setEnabled(false);
					}
				}
			}
		});

		TYPECHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (TYPECHB.isSelected()) {
					TYPECB.setEnabled(true);
				} else {
					if (!TYPECHB.isSelected()) {
						TYPECB.setEnabled(false);
					}
				}
			}
		});

		PRIZECHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (PRIZECHB.isSelected()) {
					PRIZETF.setEnabled(true);
				} else {
					if (!PRIZECHB.isSelected()) {
						PRIZETF.setEnabled(false);
					}
				}
			}
		});

		ISBNCHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (ISBNCHB.isSelected()) {
					ISBNTF.setEnabled(true);
				} else {
					if (!ISBNCHB.isSelected()) {
						ISBNTF.setEnabled(false);
					}
				}
			}
		});

		PLACECHB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (PLACECHB.isSelected()) {
					PLACETF.setEnabled(true);
				} else {
					if (!PLACECHB.isSelected()) {
						PLACETF.setEnabled(false);
					}
				}
			}
		});
		
	
		
		
		
		//Events
					
		BACKBUTTON.addActionListener(e -> {
			dispose();
			new HomeGui("My Books");
		});
		
		SEARCH.addActionListener(new DataSearch(this));
		
		MORE.addActionListener(new ViewMore(this));

		VIEWALL.addActionListener(new ViewAll(this));

	}

}
