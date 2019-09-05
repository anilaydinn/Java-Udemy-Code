import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SiparisUygulamasi extends JFrame {

	private JPanel contentPane;
	private JLabel lblMen;
	private JCheckBox iskender;
	private JCheckBox beyti;
	private JCheckBox salata;
	private JCheckBox ayran;
	private JButton siparis_goster;
	Map<String, Integer> siparisler = new LinkedHashMap<String, Integer>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SiparisUygulamasi frame = new SiparisUygulamasi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void siparisleriGoster() {
		
		String message = "";
		int tutar = 0;
		
		if(siparisler.isEmpty()) {
			
			message = "Siparişiniz Bulunmamaktadır";
		}
		else {
			
			message += "Siparişler\n";
			
			for(Map.Entry<String, Integer> entry : siparisler.entrySet()) {
				
				message += entry.getKey() + "\n";
				tutar += entry.getValue();
			}
			
			message += "Toplam Tutar : " + tutar + " TL";
		}
		
		JOptionPane.showMessageDialog(null, message);
	}

	/**
	 * Create the frame.
	 */
	public SiparisUygulamasi() {
		setTitle("Sipariş Uygulaması");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMen = new JLabel("MENÜ");
		lblMen.setBounds(176, 12, 66, 15);
		contentPane.add(lblMen);
		
		iskender = new JCheckBox("İskender - 15 TL");
		iskender.setBounds(138, 35, 149, 23);
		contentPane.add(iskender);
		
		beyti = new JCheckBox("Beyti - 12 TL");
		beyti.setBounds(138, 62, 121, 23);
		contentPane.add(beyti);
		
		salata = new JCheckBox("Salata - 5 TL");
		salata.setBounds(138, 87, 149, 23);
		contentPane.add(salata);
		
		ayran = new JCheckBox("Ayran - 2 TL");
		ayran.setBounds(138, 114, 149, 23);
		contentPane.add(ayran);
		
		siparis_goster = new JButton("Siparişleri Göster");
		siparis_goster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(iskender.isSelected()) {
					
					siparisler.put("İskender", 15);
				}
				else {
					
					siparisler.remove("İskender");
				}
				
				if(beyti.isSelected()) {
					
					siparisler.put("Beyti", 12);
				}
				else {
					
					siparisler.remove("Beyti");
				}
				
				if(salata.isSelected()) {
					
					siparisler.put("Salata", 5);
				}
				else {
					
					siparisler.remove("Salata");
				}
				
				if(ayran.isSelected()) {
					
					siparisler.put("Ayran", 2);
				}
				else {
					
					siparisler.remove("Ayran");
				}
				
				siparisleriGoster();
			}
		});
		siparis_goster.setBounds(138, 169, 165, 25);
		contentPane.add(siparis_goster);
	}
	
}
