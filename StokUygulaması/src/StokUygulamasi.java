import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StokUygulamasi extends JFrame {

	private JPanel contentPane;
	private JTextField tf_urun_ismi;
	private JTextField tf_fiyat;
	private JTable urun_tablosu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StokUygulamasi frame = new StokUygulamasi();
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
	public StokUygulamasi() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblrnIsmi = new JLabel("Ürün İsmi:");
		lblrnIsmi.setBounds(41, 47, 82, 15);
		contentPane.add(lblrnIsmi);
		
		JLabel lblKategori = new JLabel("Kategori:");
		lblKategori.setBounds(41, 79, 82, 15);
		contentPane.add(lblKategori);
		
		JLabel lblFiyat = new JLabel("Fiyat:");
		lblFiyat.setBounds(41, 108, 82, 15);
		contentPane.add(lblFiyat);
		
		tf_urun_ismi = new JTextField();
		tf_urun_ismi.setBounds(141, 45, 169, 19);
		contentPane.add(tf_urun_ismi);
		tf_urun_ismi.setColumns(10);
		
		JComboBox cb_kategori = new JComboBox();
		cb_kategori.setModel(new DefaultComboBoxModel(new String[] {"Kültür Sanat", "Yemek", "Elektronik"}));
		cb_kategori.setBounds(141, 74, 169, 24);
		contentPane.add(cb_kategori);
		
		tf_fiyat = new JTextField();
		tf_fiyat.setColumns(10);
		tf_fiyat.setBounds(141, 106, 169, 19);
		contentPane.add(tf_fiyat);
		
		JLabel mesaj_yazisi = new JLabel("");
		mesaj_yazisi.setForeground(Color.RED);
		mesaj_yazisi.setBounds(41, 137, 317, 15);
		contentPane.add(mesaj_yazisi);
		
		urun_tablosu = new JTable();
		urun_tablosu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
				
				int secili_row = urun_tablosu.getSelectedRow();
				
				tf_urun_ismi.setText(model.getValueAt(secili_row, 0).toString());
				cb_kategori.setSelectedItem(model.getValueAt(secili_row, 1).toString());
				tf_fiyat.setText(model.getValueAt(secili_row, 2).toString());
			}
		});
		urun_tablosu.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u00DCr\u00FCn \u0130smi", "Kategori", "Fiyat"
			}
		));
		urun_tablosu.setBounds(41, 176, 548, 286);
		contentPane.add(urun_tablosu);
		
		JButton ekle_butonu = new JButton("Ürün Ekle");
		ekle_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mesaj_yazisi.setText("");
				
				DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
				
				if(tf_urun_ismi.getText().trim().equals("")) {
					
					mesaj_yazisi.setText("Ürün ismi boş bırakılamaz...");
				}
				else {
					
					Object[] eklenecek = {tf_urun_ismi.getText(), cb_kategori.getSelectedItem(), tf_fiyat.getText()};
					model.addRow(eklenecek);
				}
			}
		});
		ekle_butonu.setBounds(368, 42, 160, 25);
		contentPane.add(ekle_butonu);
		
		JButton guncelle_butonu = new JButton("Ürün Güncelle");
		guncelle_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mesaj_yazisi.setText("");
				
				DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
				
				int secili_row = urun_tablosu.getSelectedRow();
				
				if(secili_row == -1) {
					
					if(urun_tablosu.getRowCount() == 0) {
						
						mesaj_yazisi.setText("Ürün tablosu şu anda boş....");
					}
					else {
						
						mesaj_yazisi.setText("Lütfen güncellenecek bir ürün seçin....");
					}
				}
				else {
					
					model.setValueAt(tf_urun_ismi.getText(), secili_row, 0);
					model.setValueAt(cb_kategori.getSelectedItem().toString(), secili_row, 1);
					model.setValueAt(tf_fiyat.getText(), secili_row, 2);
					
					mesaj_yazisi.setText("Ürün başarıyla güncellendi...");
				}
			}
		});
		guncelle_butonu.setBounds(368, 77, 160, 25);
		contentPane.add(guncelle_butonu);
		
		JButton sil_butonu = new JButton("Ürün Sil");
		sil_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mesaj_yazisi.setText("");
				
				DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
				
				int secili_row = urun_tablosu.getSelectedRow();
				
				if(secili_row == -1) {
					
					if(urun_tablosu.getRowCount() == 0) {
						
						mesaj_yazisi.setText("Ürün tablosu şu anda boş...");
					}
					else {
						
						mesaj_yazisi.setText("Lütfen silinecek bir ürün seçin...");
					}
				}
				else {
					
					model.removeRow(secili_row);
					
					mesaj_yazisi.setText("Ürün başarıyla silindi...");
				}
			}
		});
		sil_butonu.setBounds(368, 114, 160, 25);
		contentPane.add(sil_butonu);
	}
}
