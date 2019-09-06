import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.io.*;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooserKullanimi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooserKullanimi frame = new ChooserKullanimi();
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
	public ChooserKullanimi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JTextArea yazi_alani = new JTextArea();
		yazi_alani.setBounds(12, 12, 426, 158);
		contentPane.add(yazi_alani);
		
		JButton dosyaAc = new JButton("Dosya Aç");
		dosyaAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fc = new JFileChooser();
				
				int i = fc.showOpenDialog(ChooserKullanimi.this);
				
				if(i == JFileChooser.APPROVE_OPTION) {
					
					File file = fc.getSelectedFile();
					
					String icerik = "";
					
					try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
						
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
		dosyaAc.setBounds(49, 221, 114, 25);
		contentPane.add(dosyaAc);
		
		JButton renkDegistir = new JButton("Renk Değiştir");
		renkDegistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Color color = JColorChooser.showDialog(ChooserKullanimi.this, "Bir Renk Seçin", Color.RED);
				
				yazi_alani.setForeground(color);
			}
		});
		renkDegistir.setBounds(271, 221, 140, 25);
		contentPane.add(renkDegistir);
		
	}
}
