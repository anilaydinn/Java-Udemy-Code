import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RadioveCombobox extends JFrame {

	Set<String> diller = new LinkedHashSet<String>();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioveCombobox frame = new RadioveCombobox();
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
	public RadioveCombobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cb_diller = new JComboBox();
		cb_diller.setModel(new DefaultComboBoxModel(new String[] {"Python", "Java", "C++", "Php"}));
		cb_diller.setBounds(112, 78, 183, 24);
		contentPane.add(cb_diller);
		
		JButton goster = new JButton("Göster");
		goster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String message = "Şu dil seçildi : " + cb_diller.getSelectedItem();
				
				JOptionPane.showMessageDialog(null, message);
			}
		});
		goster.setBounds(148, 187, 114, 25);
		contentPane.add(goster);
		
		ButtonGroup bg = new ButtonGroup();
	}
}
