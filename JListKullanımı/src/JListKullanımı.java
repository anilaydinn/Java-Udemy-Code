import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListKullanımı extends JFrame {

	DefaultListModel model = new DefaultListModel();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListKullanımı frame = new JListKullanımı();
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
	public JListKullanımı() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList kullanici_listesi = new JList();
		kullanici_listesi.setBounds(53, 166, 692, 231);
		contentPane.add(kullanici_listesi);
		kullanici_listesi.setModel(model);
		
		JLabel lblKullanclar = new JLabel("Kullanıcılar");
		lblKullanclar.setFont(new Font("Dialog", Font.BOLD, 14));
		lblKullanclar.setBounds(53, 139, 110, 15);
		contentPane.add(lblKullanclar);
		
		JLabel mesaj_yazisi = new JLabel("");
		mesaj_yazisi.setForeground(Color.RED);
		mesaj_yazisi.setBounds(58, 112, 389, 15);
		contentPane.add(mesaj_yazisi);
		
		JButton ekle = new JButton("Kullanıcı Ekle");
		ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mesaj_yazisi.setText("");
				
				String cevap = JOptionPane.showInputDialog("Kullanıcı İsmi");
				
				if(cevap != null) {
					
					if(cevap.trim().equals("")) {
						
						mesaj_yazisi.setText("Boş bir kullanıcı ismi girdiniz...");
					}
					else {
						
						model.addElement(cevap);
						mesaj_yazisi.setText("Kullanıcı başarılı bir şekilde eklendi...");
					}
				}
				else {
					
					mesaj_yazisi.setText("İşlem İptal Edildi...");
				}
			}
		});
		ekle.setBounds(53, 75, 149, 25);
		contentPane.add(ekle);
		
		JButton sil = new JButton("Kullanıcı Sil");
		sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mesaj_yazisi.setText("");
				
				int selectedindex = kullanici_listesi.getSelectedIndex();
				
				if(selectedindex == -1) {
					
					if(model.getSize() == 0) {
						
						mesaj_yazisi.setText("Liste şu anda boş...");
					}
					else {
						
						mesaj_yazisi.setText("Lütfen silinecek bir kullanıcı seçin...");
					}
				}
				else {
					
					Object silinecek = model.getElementAt(selectedindex);
					
					model.removeElement(silinecek);
				}
			}
		});
		sil.setBounds(596, 75, 149, 25);
		contentPane.add(sil);
	}
}
