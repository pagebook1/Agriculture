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
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(219, 253, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(219, 281, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(219, 309, 30, 20);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(219, 337, 30, 20);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(219, 368, 30, 20);
		contentPane.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(219, 396, 30, 20);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(219, 424, 30, 20);
		contentPane.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(380, 340, 30, 20);
		contentPane.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(380, 368, 30, 20);
		contentPane.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(380, 396, 30, 20);
		contentPane.add(spinner_9);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(380, 427, 30, 20);
		contentPane.add(spinner_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(380, 253, 30, 20);
		contentPane.add(spinner_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("Sili Green");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_12.setBounds(420, 256, 63, 14);
		contentPane.add(lblNewLabel_1_12);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(380, 281, 30, 20);
		contentPane.add(spinner_12);
		
		JLabel lblNewLabel_1_13 = new JLabel("Sili Red");
		lblNewLabel_1_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_13.setBounds(430, 284, 46, 14);
		contentPane.add(lblNewLabel_1_13);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setBounds(380, 309, 30, 20);
		contentPane.add(spinner_13);
		
		JLabel lblNewLabel_1_14 = new JLabel("Upo");
		lblNewLabel_1_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_14.setBounds(420, 309, 46, 14);
		contentPane.add(lblNewLabel_1_14);
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
