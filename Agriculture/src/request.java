import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JSpinner;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class request extends JFrame {
	currentDateTime dateTime = new currentDateTime();
	private JPanel contentPane;
	private JTextField name_text;
	private JTextField DateTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					request frame = new request();
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
	public request() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel seed_req_lbl = new JLabel("Seed Request");
		seed_req_lbl.setEnabled(true);
		seed_req_lbl.setFont(new Font("Candara", Font.PLAIN, 25));
		seed_req_lbl.setBounds(476, 11, 166, 63);
		contentPane.add(seed_req_lbl);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		lblNewLabel.setBounds(177, 105, 94, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblBarangay = new JLabel("Barangay");
		lblBarangay.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		lblBarangay.setBounds(177, 145, 94, 29);
		contentPane.add(lblBarangay);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date & Time");
		lblNewLabel_1_1.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(177, 185, 128, 29);
		contentPane.add(lblNewLabel_1_1);
		
		name_text = new JTextField();
		name_text.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name_text.setBounds(339, 111, 303, 23);
		contentPane.add(name_text);
		name_text.setColumns(10);
		
		JComboBox barangay_list = new JComboBox();
		barangay_list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		barangay_list.setModel(new DefaultComboBoxModel(new String[] {"Mapagmahal", "Bagong-Pagasa", "Bagong Silang", "Pagkakaisa", "Villamanzano Sur", "Villamanzano Norte", "Pambuhan"}));
		barangay_list.setBounds(339, 150, 303, 23);
		contentPane.add(barangay_list);
		
		DateTime = new JTextField();
		DateTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DateTime.setEditable(false);
		DateTime.setBounds(339, 191, 303, 23);
		contentPane.add(DateTime);
		DateTime.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pechay");
		lblNewLabel_1.setBounds(259, 256, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mustard");
		lblNewLabel_1_2.setBounds(259, 284, 58, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Okra");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setBounds(259, 312, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tomato");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setBounds(259, 340, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Squash");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setBounds(259, 371, 46, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("String Beans");
		lblNewLabel_1_6.setBounds(259, 399, 77, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Ampalaya");
		lblNewLabel_1_7.setBounds(259, 427, 77, 14);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Soy Beans");
		lblNewLabel_1_8.setBounds(420, 343, 77, 14);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Radish");
		lblNewLabel_1_9.setBounds(420, 371, 77, 14);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Kangkong");
		lblNewLabel_1_10.setBounds(420, 399, 77, 14);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("Bell Pepper");
		lblNewLabel_1_11.setBounds(420, 430, 77, 14);
		contentPane.add(lblNewLabel_1_11);
		
		JSpinner pechay_spinner = new JSpinner();
		pechay_spinner.setBounds(219, 253, 30, 20);
		contentPane.add(pechay_spinner);
		
		JSpinner mustard_spinner = new JSpinner();
		mustard_spinner.setBounds(219, 281, 30, 20);
		contentPane.add(mustard_spinner);
		
		JSpinner okra_spinner = new JSpinner();
		okra_spinner.setBounds(219, 309, 30, 20);
		contentPane.add(okra_spinner);
		
		JSpinner tomato_spinner = new JSpinner();
		tomato_spinner.setBounds(219, 337, 30, 20);
		contentPane.add(tomato_spinner);
		
		JSpinner squash_spinner = new JSpinner();
		squash_spinner.setBounds(219, 368, 30, 20);
		contentPane.add(squash_spinner);
		
		JSpinner stringbeans_spinner = new JSpinner();
		stringbeans_spinner.setBounds(219, 396, 30, 20);
		contentPane.add(stringbeans_spinner);
		
		JSpinner ampalaya_spinner = new JSpinner();
		ampalaya_spinner.setBounds(219, 424, 30, 20);
		contentPane.add(ampalaya_spinner);
		
		JSpinner soybeans_spinner = new JSpinner();
		soybeans_spinner.setBounds(380, 340, 30, 20);
		contentPane.add(soybeans_spinner);
		
		JSpinner radish_spinner = new JSpinner();
		radish_spinner.setBounds(380, 368, 30, 20);
		contentPane.add(radish_spinner);
		
		JSpinner kangkong_spinner = new JSpinner();
		kangkong_spinner.setBounds(380, 396, 30, 20);
		contentPane.add(kangkong_spinner);
		
		JSpinner bellpepper_spinner = new JSpinner();
		bellpepper_spinner.setBounds(380, 427, 30, 20);
		contentPane.add(bellpepper_spinner);
		
		JSpinner siligreen_spinner = new JSpinner();
		siligreen_spinner.setBounds(380, 253, 30, 20);
		contentPane.add(siligreen_spinner);
		
		JLabel lblNewLabel_1_12 = new JLabel("Sili Green");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_12.setBounds(420, 256, 63, 14);
		contentPane.add(lblNewLabel_1_12);
		
		JSpinner silired_spinner = new JSpinner();
		silired_spinner.setBounds(380, 281, 30, 20);
		contentPane.add(silired_spinner);
		
		JLabel lblNewLabel_1_13 = new JLabel("Sili Red");
		lblNewLabel_1_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_13.setBounds(430, 284, 46, 14);
		contentPane.add(lblNewLabel_1_13);
		
		JSpinner upo_spinner = new JSpinner();
		upo_spinner.setBounds(380, 309, 30, 20);
		contentPane.add(upo_spinner);
		
		JLabel lblNewLabel_1_14 = new JLabel("Upo");
		lblNewLabel_1_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_14.setBounds(420, 309, 46, 14);
		contentPane.add(lblNewLabel_1_14);
		
		JButton submit_button = new JButton("Request");
		submit_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		submit_button.setBounds(216, 505, 157, 45);
		contentPane.add(submit_button);
		new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
//                String string = new SimpleDateFormat("HH:mm:ss").format(new Date());
//                label.setText(string);
            	DateTime.setText(dateTime.currentDateTime().toString());
            }
        }, 0, 1000);
	}
}
