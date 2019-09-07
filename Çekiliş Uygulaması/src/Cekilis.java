import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JTextField;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class Cekilis extends JFrame {
	
	private String dosya_yolu = "";
	private JPanel contentPane;
	private JTextField aramaCubugu;
	private ArrayList<String> katilanlar = new ArrayList<String>();
	
	private Set<String> kazananlar = new TreeSet<String>();
	
	private DefaultListModel model = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cekilis frame = new Cekilis();
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
	public Cekilis() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 660, 429);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList kazananlar_listesi = new JList();
		kazananlar_listesi.setBounds(12, 82, 510, 284);
		kazananlar_listesi.setModel(model);
		panel.add(kazananlar_listesi);
		
		
		aramaCubugu = new JTextField();
		aramaCubugu.setEditable(false);
		aramaCubugu.setBounds(12, 12, 521, 19);
		panel.add(aramaCubugu);
		aramaCubugu.setColumns(10);
		
		JButton btnNewButton = new JButton("Gözat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				
				int i = fileChooser.showOpenDialog(Cekilis.this);
				
				if(i == JFileChooser.APPROVE_OPTION) {
					
					dosya_yolu = fileChooser.getSelectedFile().getPath();
					aramaCubugu.setText(dosya_yolu);
				}
			}
		});
		btnNewButton.setBounds(545, 9, 89, 25);
		panel.add(btnNewButton);
		
		
		
		JLabel lblKazananlar = new JLabel("Kazananlar");
		lblKazananlar.setFont(new Font("Dialog", Font.BOLD, 14));
		lblKazananlar.setForeground(new Color(255, 255, 255));
		lblKazananlar.setBounds(12, 55, 102, 15);
		panel.add(lblKazananlar);
		
		JButton btnekiliYap = new JButton("Çekiliş Yap");
		btnekiliYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(dosya_yolu.equals("")) {
					
					JOptionPane.showMessageDialog(Cekilis.this, "Lütfen bir çekiliş dosyası seçin...");
				}
				else {
					
					cekilisYap();
					
					for(String kazanan : kazananlar) {
						
						model.addElement(kazanan);
					}
				}
			}
		});
		btnekiliYap.setBounds(532, 78, 116, 25);
		panel.add(btnekiliYap);
	}
	
	public void alkisEkle() {
		
		try {
			
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("alkış.wav"));
			
			Clip clip = AudioSystem.getClip();
			
			clip.open(stream);
			
			clip.start();
		} 
		catch (UnsupportedAudioFileException | IOException e) {
			
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			
			e.printStackTrace();
		}
	}
	
	public void cekilisYap() {
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(dosya_yolu)))){
			
			String kisi;
			
			while((kisi = reader.readLine()) != null) {
				
				katilanlar.add(kisi);
			}
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		while(kazananlar.size() != 10) {
			
			Random random = new Random();
			int kazananindex = random.nextInt(katilanlar.size());
			
			kazananlar.add(katilanlar.get(kazananindex));
		}
		
		alkisEkle();
	}
}
