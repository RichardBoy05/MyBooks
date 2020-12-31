import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import javax.swing.*;

public class HomeGui extends JFrame {

	
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: HomeGui
	 * Lines: 207
	 * Description: UI and Events handling for the main frame.
	 * 
	 * 
	 */

	

	
	private static final long serialVersionUID = 1L;
	
	// Buttons

	public final JButton SEARCHB = new JButton("Cerca nella tua libreria");
	public final JButton INSERTB = new JButton("Inserisci un nuovo libro");
	public final JButton MAILB = new JButton();
	public final JButton ABOUTB = new JButton();
	public final JButton GITHUBB = new JButton();

	// Labels

	public final JLabel TITLE = new JLabel();	
	public final JLabel OR = new JLabel("oppure");
	public final JLabel CREDITS = new JLabel("Richard Meoli");
	public final JLabel LINE = new JLabel();
	public final JLabel VERSION = new JLabel("MyBooks, 1.0.0");
	
	// Icons
	
	ImageIcon titleimage = new ImageIcon(getClass().getClassLoader().getResource("mybooks.png"));
	ImageIcon mail = new ImageIcon(getClass().getClassLoader().getResource("mail.png"));
	ImageIcon about = new ImageIcon(getClass().getClassLoader().getResource("about.png"));
	ImageIcon github = new ImageIcon(getClass().getClassLoader().getResource("github.png"));
	
	ImageIcon x128 = new ImageIcon(getClass().getClassLoader().getResource("128x.png"));
	ImageIcon x64 = new ImageIcon(getClass().getClassLoader().getResource("64x.png"));
	ImageIcon x32 = new ImageIcon(getClass().getClassLoader().getResource("32x.png"));
	
	// Images
	
	Image image1 = x128.getImage();
	Image image2 = x64.getImage();
	Image image3 = x32.getImage();	
    Image[] images = {image1, image2, image3};
	
	

	// Constructor Method

	public HomeGui(String text) {

		super(text);
		setSize(270, 330);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width / 2) - (super.getWidth() / 2), (screenSize.height / 2) - (super.getHeight() / 2));
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setIconImages(Arrays.asList(images));

		// Bounds Settings

		SEARCHB.setBounds(27, 100, 200, 45);
		INSERTB.setBounds(27, 180, 200, 45);
		TITLE.setBounds(3, -27, 250, 150);
		OR.setBounds(103, 146, 60, 30);
		CREDITS.setBounds(157, 268, 150, 30);
		MAILB.setBounds(235, 275, 16, 16);
		ABOUTB.setBounds(5, 275, 16, 16);
		VERSION.setBounds(40, 268, 150, 30);
		GITHUBB.setBounds(23, 275, 16, 16);
		LINE.setBounds(-1,272,270,1);

		// Fonts and Icons Settings

		var creditsf = new Font("Arial", Font.BOLD, 11);
		var buttonf = new Font("TimesRoman", Font.BOLD, 16);
		var orf = new Font("Consolas", Font.ITALIC, 16);

		CREDITS.setFont(creditsf);
		VERSION.setFont(creditsf);
		SEARCHB.setFont(buttonf);
		INSERTB.setFont(buttonf);
		OR.setFont(orf);
		
		TITLE.setIcon(titleimage);
		MAILB.setIcon(mail);
		ABOUTB.setIcon(about);
		GITHUBB.setIcon(github);
		
		MAILB.setBorder(null);
		MAILB.setContentAreaFilled(false);
		MAILB.setToolTipText("Domande, suggerimenti e segnalazioni di bug presso \"mybooks.fixandbugs@gmail.com\" ");
		
		ABOUTB.setBorder(null);
		ABOUTB.setContentAreaFilled(false);
		ABOUTB.setToolTipText("About MyBooks");
		
		GITHUBB.setBorder(null);
		GITHUBB.setContentAreaFilled(false);
		GITHUBB.setToolTipText("Visualizza su Github");
		
		LINE.setBorder(BorderFactory.createRaisedBevelBorder());
		

		SEARCHB.setFocusPainted(false);
		INSERTB.setFocusPainted(false);
		

		// Adding components

		add(SEARCHB);
		add(INSERTB);
		add(TITLE);
		add(OR);
		add(CREDITS);
		add(MAILB);
		add(LINE);
		add(ABOUTB);
		add(VERSION);
		add(GITHUBB);

		
				
		// Events

		INSERTB.addActionListener(e -> {

			new NewBookGui("My Books");
			HomeGui.super.dispose();
		});
		
		

		SEARCHB.addActionListener(e -> {

			new LibraryGui("My Books");
			HomeGui.super.dispose();
		});
		
		
		
		MAILB.addActionListener(e -> {
			
			try{
				Desktop.getDesktop().browse(new URI("mailto:mybooks.fixandbugs@gmail.com"));
		    }
		    catch(IOException | URISyntaxException ee){

				JOptionPane.showMessageDialog(null, ee);
			}
		});
		
		
		
		ABOUTB.addActionListener(e -> {
			
			var file = new File("./README.txt");
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
		});
		
		
		
       GITHUBB.addActionListener(e -> {
			
			try{
				Desktop.getDesktop().browse(new URI("https://github.com/RichardBoy05/MyBooks"));
		    }
		    catch(IOException | URISyntaxException ee){

				JOptionPane.showMessageDialog(null, ee);
			}
		});
       
       

	}

}
