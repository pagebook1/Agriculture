import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class request extends JFrame {
	currentDateTime dateTime = new currentDateTime();
	private JPanel contentPane;
	private JTextField name_text;
	private JTextField DateTime;
	String[] seeds = {};
	private JSpinner pechay_spinner;
	private JSpinner mustard_spinner;
	private JSpinner okra_spinner;
	private JSpinner tomato_spinner;
	private JSpinner squash_spinner;
	private JSpinner stringbeans_spinner;
	private JSpinner ampalaya_spinner;
	private JSpinner soybeans_spinner;
	private JSpinner radish_spinner;
	private JSpinner kangkong_spinner;
	private JSpinner bellpepper_spinner;
	private JSpinner siligreen_spinner;
	private JSpinner silired_spinner;
	private JSpinner upo_spinner;
	private JComboBox barangay_list;
	

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
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public request() throws SQLException, ClassNotFoundException {
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
		
		
		barangay_list = new JComboBox();
		barangay_list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		barangay_list.setModel(new DefaultComboBoxModel());
		barangay_list.setBounds(339, 150, 303, 23);
		contentPane.add(barangay_list);
//		dbCon.dbquery().sql = "SELECT * FROM `barangay_list`";
		dbcon.dbquery query = new dbcon.dbquery("SELECT * FROM `barangay_list`");
		int x = 0;
		while ( x < query.ar.size())
		{
			barangay_list.addItem(query.ar.get(x));
			x++;
		}
		
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
		
		 pechay_spinner = new JSpinner();
		pechay_spinner.setBounds(219, 253, 30, 20);
		contentPane.add(pechay_spinner);
		
		 mustard_spinner = new JSpinner();
		mustard_spinner.setBounds(219, 281, 30, 20);
		contentPane.add(mustard_spinner);
		
		 okra_spinner = new JSpinner();
		okra_spinner.setBounds(219, 309, 30, 20);
		contentPane.add(okra_spinner);
		
		 tomato_spinner = new JSpinner();
		tomato_spinner.setBounds(219, 337, 30, 20);
		contentPane.add(tomato_spinner);
		
		 squash_spinner = new JSpinner();
		squash_spinner.setBounds(219, 368, 30, 20);
		contentPane.add(squash_spinner);
		
		 stringbeans_spinner = new JSpinner();
		stringbeans_spinner.setBounds(219, 396, 30, 20);
		contentPane.add(stringbeans_spinner);
		
		 ampalaya_spinner = new JSpinner();
		ampalaya_spinner.setBounds(219, 424, 30, 20);
		contentPane.add(ampalaya_spinner);
		
		 soybeans_spinner = new JSpinner();
		soybeans_spinner.setBounds(380, 340, 30, 20);
		contentPane.add(soybeans_spinner);
		
		 radish_spinner = new JSpinner();
		radish_spinner.setBounds(380, 368, 30, 20);
		contentPane.add(radish_spinner);
		
		 kangkong_spinner = new JSpinner();
		kangkong_spinner.setBounds(380, 396, 30, 20);
		contentPane.add(kangkong_spinner);
		
		 bellpepper_spinner = new JSpinner();
		bellpepper_spinner.setBounds(380, 427, 30, 20);
		contentPane.add(bellpepper_spinner);
		
		 siligreen_spinner = new JSpinner();
		siligreen_spinner.setBounds(380, 253, 30, 20);
		contentPane.add(siligreen_spinner);
		
		JLabel lblNewLabel_1_12 = new JLabel("Sili Green");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_12.setBounds(420, 256, 63, 14);
		contentPane.add(lblNewLabel_1_12);
		
		 silired_spinner = new JSpinner();
		silired_spinner.setBounds(380, 281, 30, 20);
		contentPane.add(silired_spinner);
		
		JLabel lblNewLabel_1_13 = new JLabel("Sili Red");
		lblNewLabel_1_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_13.setBounds(430, 284, 46, 14);
		contentPane.add(lblNewLabel_1_13);
		
		 upo_spinner = new JSpinner();
		upo_spinner.setBounds(380, 309, 30, 20);
		contentPane.add(upo_spinner);
		
		JLabel lblNewLabel_1_14 = new JLabel("Upo");
		lblNewLabel_1_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_14.setBounds(420, 309, 46, 14);
		contentPane.add(lblNewLabel_1_14);
		JButton submit_button = new JButton("Request");
		submit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name_text.getText().equals(""))
				{
					
					JOptionPane.showMessageDialog(null,
						    "Do not leave blank on Name",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);

				}
				else if(barangay_list.getSelectedItem().toString() == "")
				{
					JOptionPane.showMessageDialog(null,
						    "Do not leave blank on Barangay",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);

				}
				else {
					seeds = new String[]{
							pechay_spinner.getValue().toString(),
							mustard_spinner.getValue().toString(),
							okra_spinner.getValue().toString(),
							tomato_spinner.getValue().toString(),
							squash_spinner.getValue().toString(),
							stringbeans_spinner.getValue().toString(),
							ampalaya_spinner.getValue().toString(),
							siligreen_spinner.getValue().toString(),
							silired_spinner.getValue().toString(),
							upo_spinner.getValue().toString(),
							soybeans_spinner.getValue().toString(),
							radish_spinner.getValue().toString(),
							kangkong_spinner.getValue().toString(),
							bellpepper_spinner.getValue().toString(),
							};
					String name = name_text.getText();
					String date = DateTime.getText();
					String barangay = barangay_list.getSelectedItem().toString();
					try {
						new dbcon().addData("INSERT INTO `acknowledgement_reciept` (`ID`, `date`, `name`, `barangay`, `pechay`, `mustard`, `okra`, `tomato`, `squash`, `string_beans`, `ampalaya`, `sili_green`, `sili_red`, `upo`, `soy_beans`, `radish`, `kangkong`, `bell_pepper`) VALUES (NULL, '"+date+"', '"+name+"', '"+barangay+"', '"+seeds[0]+"', '"+seeds[1]+"', '"+seeds[2]+"', '"+seeds[3]+"', '"+seeds[4]+"', '"+seeds[5]+"', '"+seeds[6]+"', '"+seeds[7]+"', '"+seeds[8]+"', '"+seeds[9]+"', '"+seeds[10]+"', '"+seeds[11]+"', '"+seeds[12]+"', '"+seeds[13]+"');");
						JOptionPane.showMessageDialog(null,
							    "Data Added",
							    "Inane Information",
							    JOptionPane.INFORMATION_MESSAGE);
						 seeds();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		submit_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		submit_button.setBounds(216, 505, 157, 45);
		contentPane.add(submit_button);
		
		JButton reset_btn = new JButton("reset");
		reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seeds();
			}
		});
		reset_btn.setFont(new Font("Tahoma", Font.BOLD, 20));
		reset_btn.setBounds(404, 505, 157, 45);
		contentPane.add(reset_btn);
		new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
//                String string = new SimpleDateFormat("HH:mm:ss").format(new Date());
//                label.setText(string);
            	DateTime.setText(dateTime.currentDateTime().toString());
            }
        }, 0, 1000);
	}
	public void seeds()
	{
		name_text.setText("");
		barangay_list.setSelectedIndex(0);
		pechay_spinner.setValue(0);
		mustard_spinner.setValue(0);
		okra_spinner.setValue(0);
		tomato_spinner.setValue(0);
		squash_spinner.setValue(0);
		stringbeans_spinner.setValue(0);
		soybeans_spinner.setValue(0);
		ampalaya_spinner.setValue(0);
		radish_spinner.setValue(0);
		kangkong_spinner.setValue(0);
		bellpepper_spinner.setValue(0);
		siligreen_spinner.setValue(0);
		silired_spinner.setValue(0);
		upo_spinner.setValue(0);
	}
}
