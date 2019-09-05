import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasitHesapMakinesi extends JFrame {

	private JPanel contentPane;
	private JTextField birinci_sayi;
	private JTextField ikinci_sayi;
	private JTextField sonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasitHesapMakinesi frame = new BasitHesapMakinesi();
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
	public BasitHesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBirinciSay = new JLabel("Birinci Sayı :");
		lblBirinciSay.setBounds(42, 39, 98, 15);
		contentPane.add(lblBirinciSay);
		
		JLabel lblIkinciSay = new JLabel("İkinci Sayı :");
		lblIkinciSay.setBounds(42, 66, 98, 15);
		contentPane.add(lblIkinciSay);
		
		JLabel lblSonu = new JLabel("Sonuç :");
		lblSonu.setBounds(42, 93, 98, 15);
		contentPane.add(lblSonu);
		
		birinci_sayi = new JTextField();
		birinci_sayi.setBounds(139, 37, 124, 19);
		contentPane.add(birinci_sayi);
		birinci_sayi.setColumns(10);
		
		ikinci_sayi = new JTextField();
		ikinci_sayi.setBounds(139, 66, 124, 19);
		contentPane.add(ikinci_sayi);
		ikinci_sayi.setColumns(10);
		
		sonuc = new JTextField();
		sonuc.setEditable(false);
		sonuc.setBounds(139, 91, 124, 19);
		contentPane.add(sonuc);
		sonuc.setColumns(10);
		
		JButton arti = new JButton("+");
		arti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sayi1 = Integer.valueOf(birinci_sayi.getText());
				int sayi2 = Integer.valueOf(ikinci_sayi.getText());
				
				sonuc.setText(String.valueOf(sayi1 + sayi2));
			}
		});
		arti.setBounds(54, 151, 114, 25);
		contentPane.add(arti);
		
		JButton carpi = new JButton("x");
		carpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sayi1 = Integer.valueOf(birinci_sayi.getText());
				int sayi2 = Integer.valueOf(ikinci_sayi.getText());
				
				sonuc.setText(String.valueOf(sayi1 * sayi2));
			}
		});
		carpi.setBounds(54, 195, 114, 25);
		contentPane.add(carpi);
		
		JButton bolme = new JButton("/");
		bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sayi1 = Integer.valueOf(birinci_sayi.getText());
				int sayi2 = Integer.valueOf(ikinci_sayi.getText());
				
				sonuc.setText(String.valueOf((double)sayi1 / sayi2));
			}
		});
		bolme.setBounds(240, 151, 114, 25);
		contentPane.add(bolme);
		
		JButton eksi = new JButton("-");
		eksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int sayi1 = Integer.valueOf(birinci_sayi.getText());
				int sayi2 = Integer.valueOf(ikinci_sayi.getText());
				
				sonuc.setText(String.valueOf(sayi1 - sayi2));
			}
		});
		eksi.setBounds(240, 195, 114, 25);
		contentPane.add(eksi);
	}

}
