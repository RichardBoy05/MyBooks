import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class InfoBookGui extends JFrame {
	
	
	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: InfoBookGui
	 * Lines: 377
	 * Description: UI and Events handling for the frame where the user will get more informations about the book selected in the table.
	 * 
	 * 
	 */
	
	
	

	private static final long serialVersionUID = 1L;

	// Button

	public final JButton BACKBUTTON = new JButton();
	public final JButton COVERB = new JButton();

	// Labels

	public final JLabel WRITERL = new JLabel("Autore");
	public final JLabel EDITORL = new JLabel("Casa Editrice");
	public final JLabel EDITIONL = new JLabel("N° Edizione");
	public final JLabel TYPEL = new JLabel("Genere");
	public final JLabel LANGUAGEL = new JLabel("Lingua");
	public final JLabel PAGESL = new JLabel("Pagine");
	public final JLabel PRINTYEARL = new JLabel("Anno di stampa");
	public final JLabel PRIZEL = new JLabel("Prezzo");
	public final JLabel ISBNL = new JLabel("ISBN");
	public final JLabel PLACEL = new JLabel("Allocazione");
	public final JLabel PLOTL = new JLabel("Trama");
	public final JLabel OUTTITLEL = new JLabel("Titolo");
	public final JLabel OUTWRITERL = new JLabel();
	public final JLabel OUTEDITORL = new JLabel();
	public final JLabel OUTEDITIONL = new JLabel();
	public final JLabel OUTTYPEL = new JLabel();
	public final JLabel OUTLANGUAGEL = new JLabel();
	public final JLabel OUTPAGESL = new JLabel();
	public final JLabel OUTPRINTYEARL = new JLabel();
	public final JLabel OUTPRIZEL = new JLabel();
	public final JLabel OUTISBNL = new JLabel();
	public final JLabel OUTPLACEL = new JLabel();

	// TextArea

	public final JTextArea OUTPLOTTA = new JTextArea();
	
	// Scroll Pane
	
	public final JScrollPane SCROLL = new JScrollPane(OUTPLOTTA);

	// Icons

	ImageIcon backimage = new ImageIcon(getClass().getClassLoader().getResource("undo.png"));
	ImageIcon backimagepressed = new ImageIcon(getClass().getClassLoader().getResource("undop.png"));
	ImageIcon coverdef = new ImageIcon(getClass().getClassLoader().getResource("coverdef.png"));
	
	ImageIcon x128 = new ImageIcon(getClass().getClassLoader().getResource("128x.png"));
	ImageIcon x64 = new ImageIcon(getClass().getClassLoader().getResource("64x.png"));
	ImageIcon x32 = new ImageIcon(getClass().getClassLoader().getResource("32x.png"));
	
	// Images
	
	Image image1 = x128.getImage();
	Image image2 = x64.getImage();
	Image image3 = x32.getImage();
	Image[] images = {image1, image2, image3};
	
	
	

	// Constructor Method

	public InfoBookGui(String text) {

		super(text);
		setSize(525, 975);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width / 2) - (super.getWidth() / 2), (screenSize.height / 2) - (super.getHeight() / 2));
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setIconImages(Arrays.asList(images));

		// Bounds Settings
		
		OUTTITLEL.setBounds(7, 15, 500, 50);
		WRITERL.setBounds(19, 70, 200, 30);
		EDITORL.setBounds(19, 120, 200, 30);
		EDITIONL.setBounds(19, 170, 200, 30);
		TYPEL.setBounds(19, 220, 200, 30);
		LANGUAGEL.setBounds(19, 270, 200, 30);
		PAGESL.setBounds(19, 320, 200, 30);
		PRINTYEARL.setBounds(19, 370, 200, 30);
		PRIZEL.setBounds(19, 420, 200, 30);
		ISBNL.setBounds(19, 470, 200, 30);
		PLACEL.setBounds(19, 520, 200, 30);
		PLOTL.setBounds(19, 570, 200, 30);
		OUTWRITERL.setBounds(230, 70, 260, 37);
		OUTEDITORL.setBounds(230, 120, 260, 37);
		OUTEDITIONL.setBounds(230, 170, 260, 37);
		OUTTYPEL.setBounds(230, 220, 260, 37);
		OUTLANGUAGEL.setBounds(230, 270, 260, 37);
		OUTPAGESL.setBounds(230, 320, 260, 37);
		OUTPRINTYEARL.setBounds(230, 370, 260, 37);
		OUTPRIZEL.setBounds(230, 420, 260, 37);
		OUTISBNL.setBounds(230, 470, 260, 37);
		OUTPLACEL.setBounds(230, 520, 260, 37);
		OUTPLOTTA.setBounds(230, 570, 260, 350);
		SCROLL.setBounds(230, 570, 260, 350);
		BACKBUTTON.setBounds(-1, 890, 50, 40);
		COVERB.setBounds(20, 610, 150, 263);
		
		// Icons Settings
		
		COVERB.setIcon(coverdef);
		BACKBUTTON.setIcon(backimage);
		BACKBUTTON.setRolloverIcon(backimagepressed);

		// Fonts and Borders Settings

		var titlef = new Font("Algerian", Font.BOLD, 26);
		var labelsf = new Font("DialogInput", Font.ITALIC, 24);
		var outputf = new Font("Arial", Font.PLAIN, 17);
		
		OUTTITLEL.setFont(titlef);
		WRITERL.setFont(labelsf);
		EDITORL.setFont(labelsf);
		EDITIONL.setFont(labelsf);
		TYPEL.setFont(labelsf);
		LANGUAGEL.setFont(labelsf);
		PAGESL.setFont(labelsf);
		PRINTYEARL.setFont(labelsf);
		PRIZEL.setFont(labelsf);
		ISBNL.setFont(labelsf);
		PLACEL.setFont(labelsf);
		PLOTL.setFont(labelsf);
		
		OUTWRITERL.setFont(outputf);
		OUTEDITORL.setFont(outputf);
		OUTEDITIONL.setFont(outputf);
		OUTTYPEL.setFont(outputf);
		OUTLANGUAGEL.setFont(outputf);
		OUTPAGESL.setFont(outputf);
		OUTPRINTYEARL.setFont(outputf);
		OUTPRIZEL.setFont(outputf);
		OUTISBNL.setFont(outputf);
		OUTPLACEL.setFont(outputf);
		OUTPLOTTA.setFont(outputf);
		
		Border initborder = BorderFactory.createLineBorder(Color.GRAY);
		Border emptyborder = BorderFactory.createEmptyBorder(4, 4, 4, 4);
		CompoundBorder border = new CompoundBorder(initborder, emptyborder);
		
		OUTTITLEL.setHorizontalAlignment(SwingConstants.CENTER);

		OUTWRITERL.setBackground(Color.white);
		OUTEDITORL.setBackground(Color.white);
		OUTEDITIONL.setBackground(Color.white);
		OUTTYPEL.setBackground(Color.white);
		OUTLANGUAGEL.setBackground(Color.white);
		OUTPAGESL.setBackground(Color.white);
		OUTPRINTYEARL.setBackground(Color.white);
		OUTPRIZEL.setBackground(Color.white);
		OUTISBNL.setBackground(Color.white);
		OUTPLACEL.setBackground(Color.white);

		OUTWRITERL.setOpaque(true);
		OUTEDITORL.setOpaque(true);
		OUTEDITIONL.setOpaque(true);
		OUTTYPEL.setOpaque(true);
		OUTLANGUAGEL.setOpaque(true);
		OUTPAGESL.setOpaque(true);
		OUTPRINTYEARL.setOpaque(true);
		OUTPRIZEL.setOpaque(true);
		OUTISBNL.setOpaque(true);
		OUTPLACEL.setOpaque(true);

		OUTWRITERL.setBorder(border);
		OUTEDITORL.setBorder(border);
		OUTEDITIONL.setBorder(border);
		OUTTYPEL.setBorder(border);
		OUTLANGUAGEL.setBorder(border);
		OUTPAGESL.setBorder(border);
		OUTPRINTYEARL.setBorder(border);
		OUTPRIZEL.setBorder(border);
		OUTISBNL.setBorder(border);
		OUTPLACEL.setBorder(border);
		OUTPLOTTA.setBorder(border);
		
		BACKBUTTON.setContentAreaFilled(false);
		BACKBUTTON.setBorder(BorderFactory.createEmptyBorder());
		
		OUTPLOTTA.setLineWrap(true);
		OUTPLOTTA.setWrapStyleWord(true);	
		OUTPLOTTA.setEditable(false);
		BACKBUTTON.setFocusPainted(false);
		
		COVERB.setBorder(border);
		COVERB.setContentAreaFilled(false);
		
		COVERB.setFocusPainted(false);

		// ScrollPane Settings

		SCROLL.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		SCROLL.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		SCROLL.setForeground(Color.WHITE);
		SCROLL.setBorder(null);

		// Adding items

		add(WRITERL);
		add(EDITORL);
		add(EDITIONL);
		add(TYPEL);
		add(LANGUAGEL);
		add(PAGESL);
		add(PRINTYEARL);
		add(PRIZEL);
		add(ISBNL);
		add(PLACEL);
		add(PLOTL);
		add(OUTTITLEL);
		add(OUTWRITERL);
		add(OUTEDITORL);
		add(OUTEDITIONL);
		add(OUTTYPEL);
		add(OUTLANGUAGEL);
		add(OUTPAGESL);
		add(OUTPRINTYEARL);
		add(OUTPRIZEL);
		add(OUTISBNL);
		add(OUTPLACEL);
		add(SCROLL);
		add(BACKBUTTON);
		add(COVERB);

		// Functions

		fillLabels();
		fixTitleFont();
		
		//Events
		
		BACKBUTTON.addActionListener(e -> {
			dispose();
		});
		
		
		
		COVERB.addActionListener(e -> {

			changeCover();
			
		});
		
	}
	
	
	
	
	
	
	
	
	
	public void fillLabels() {

		var datas = new ArrayList<String>();

		try {
			datas = Database.viewMore();
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e);
		}

		OUTTITLEL.setText(datas.get(0).replaceAll("§", "'"));
		OUTWRITERL.setText(datas.get(1).replaceAll("§", "'"));
		OUTEDITORL.setText(datas.get(2).replaceAll("§", "'"));
		OUTEDITIONL.setText(datas.get(3).replaceAll("§", "'"));
		OUTTYPEL.setText(datas.get(4).replaceAll("§", "'"));
		OUTLANGUAGEL.setText(datas.get(5).replaceAll("§", "'"));
		OUTPAGESL.setText(datas.get(6).replaceAll("§", "'"));
		OUTPRINTYEARL.setText(datas.get(8).replaceAll("§", "'"));
		OUTPRIZEL.setText(datas.get(9).replaceAll("§", "'"));
		OUTISBNL.setText(datas.get(10).replaceAll("§", "'"));
		OUTPLACEL.setText(datas.get(11).replaceAll("§", "'"));
		OUTPLOTTA.setText(datas.get(12).replaceAll("§", "'"));

		String dir = "./covers/" + OUTTITLEL.getText() + "_" + OUTISBNL.getText();
		var cover = new File(dir);

		if (cover.exists()) {

			var covericon = new ImageIcon(dir);
			Image scaledimg = covericon.getImage().getScaledInstance(146, 259, Image.SCALE_SMOOTH);
			covericon.setImage(scaledimg);
			COVERB.setIcon(covericon);
			
		} else {

			// do nothing
		}

	}
	
	
	
	
	
	public void fixTitleFont() {   // Title Font fix (adapted from this Stack Overflow answer:"https://stackoverflow.com/questions/2715118/how-to-change-the-size-of-the-font-of-a-jlabel-to-take-the-maximum-size")

		Font labelFont = OUTTITLEL.getFont();
		String labelText = OUTTITLEL.getText();

		int stringWidth = OUTTITLEL.getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = OUTTITLEL.getWidth();

		double widthRatio = (double) componentWidth / (double) stringWidth;

		int newFontSize = (int) (labelFont.getSize() * widthRatio);
		int componentHeight = OUTTITLEL.getHeight();

		int fontSizeToUse = Math.min(newFontSize, componentHeight);

		OUTTITLEL.setFont(new Font(labelFont.getName(), Font.BOLD, fontSizeToUse));

	}
	
	
	
	
	
	public void changeCover() {
		
		String code = OUTTITLEL.getText() + "_" + OUTISBNL.getText();
		String isbn = OUTISBNL.getText();

		if (Database.saveImage() == true) {

			Database.deleteImagewithISBN(isbn);

			JOptionPane.showMessageDialog(null, "Immagine modificata con successo!");
			Database.renameFile(code);
			
			dispose();
		}
		
	}
	
	
	
}