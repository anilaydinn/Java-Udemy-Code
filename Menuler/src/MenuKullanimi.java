import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class MenuKullanimi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuKullanimi frame = new MenuKullanimi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuKullanimi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea yazi_alani = new JTextArea();
		yazi_alani.setBounds(12, 12, 426, 225);
		contentPane.add(yazi_alani);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDosya = new JMenu("Dosya");
		menuBar.add(mnDosya);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Dosya Aç");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fc = new JFileChooser();
				
				int i = fc.showOpenDialog(MenuKullanimi.this);
				
				if(i == JFileChooser.APPROVE_OPTION) {
					
					File file = fc.getSelectedFile();
					
					try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
						
						String icerik = "";
						
						while(scanner.hasNextLine()) {
							
							icerik += scanner.nextLine() + "\n";
						}
						
						yazi_alani.setText(icerik);
					}
					catch(FileNotFoundException ex) {
						
						ex.printStackTrace();
					}
				}
			}
		});
		mnDosya.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Dosya Kaydet");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fc = new JFileChooser();
				
				int cevap = fc.showSaveDialog(MenuKullanimi.this);
				
				if(cevap == JFileChooser.APPROVE_OPTION) {
					
					String dosya_yolu = fc.getSelectedFile().getPath();
					
					try(FileWriter writer = new FileWriter(dosya_yolu)){
						
						writer.write(yazi_alani.getText());
					}
					catch(IOException ex) {
						
						ex.printStackTrace();
					}
				}
			}
		});
		mnDosya.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Çıkış");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnDosya.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu = new JMenu("Düzenle");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Renk");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmRengiDeitir = new JMenuItem("Rengi Değiştir");
		mntmRengiDeitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Color color = JColorChooser.showDialog(MenuKullanimi.this, "Bir renk seçin", Color.RED);
				
				yazi_alani.setForeground(color);
			}
		});
		mnNewMenu_1.add(mntmRengiDeitir);
		
		JMenu mnNewMenu_2 = new JMenu("Yazı Tipi");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Arial");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font("Arial", Font.PLAIN, 20);
				
				yazi_alani.setFont(font);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Times New Roman");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font("Times New Roman", Font.PLAIN, 20);
				
				yazi_alani.setFont(font);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		
		
	}
}
