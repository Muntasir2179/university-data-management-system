import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AddStuffFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textSalary;
	private JComboBox comboBox;
	
	JDateChooser dateChooser;
	JRadioButton male;
	JRadioButton female;
	JRadioButton others;
	
	
	private String name;
	private String id;
	private String age;
	private String address;
	private String phoneNumber;
	private String gmail;
	private String designation;
	private String salary;
	private String gender;
	private String date;
	private String[] options = {"Accountent", "Receptionist", "Guard"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStuffFrame frame = new AddStuffFrame();
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
	public AddStuffFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterValidInformation = new JLabel("Enter valid information for stuff");
		lblEnterValidInformation.setForeground(Color.WHITE);
		lblEnterValidInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterValidInformation.setBounds(155, 13, 286, 22);
		contentPane.add(lblEnterValidInformation);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(115, 73, 56, 16);
		contentPane.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(275, 73, 205, 22);
		contentPane.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(115, 110, 56, 16);
		contentPane.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(275, 110, 205, 22);
		contentPane.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(115, 145, 56, 22);
		contentPane.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(275, 145, 44, 22);
		contentPane.add(textAge);
		
		JLabel label_4 = new JLabel("Gander:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(115, 182, 68, 22);
		contentPane.add(label_4);
		
		male = new JRadioButton("Male");
		male.setForeground(Color.WHITE);
		male.setFont(new Font("Tahoma", Font.BOLD, 13));
		male.setBackground(new Color(0, 128, 128));
		male.setBounds(275, 181, 68, 25);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		female.setForeground(Color.WHITE);
		female.setFont(new Font("Tahoma", Font.BOLD, 13));
		female.setBackground(new Color(0, 128, 128));
		female.setBounds(338, 181, 75, 25);
		contentPane.add(female);
		
		others = new JRadioButton("Others");
		others.setForeground(Color.WHITE);
		others.setFont(new Font("Tahoma", Font.BOLD, 13));
		others.setBackground(new Color(0, 128, 128));
		others.setBounds(413, 181, 76, 25);
		contentPane.add(others);
		
		JLabel label_5 = new JLabel("Address:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(115, 217, 76, 16);
		contentPane.add(label_5);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(275, 215, 205, 22);
		contentPane.add(textAddress);
		
		JLabel label_6 = new JLabel("Date of Birth:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(115, 253, 122, 16);
		contentPane.add(label_6);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 15));
		dateChooser.setBounds(275, 250, 100, 22);
		contentPane.add(dateChooser);
		
		JLabel label_7 = new JLabel("Phone Number:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(115, 284, 133, 16);
		contentPane.add(label_7);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(275, 282, 205, 22);
		contentPane.add(textPhone);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(115, 315, 114, 16);
		contentPane.add(label_8);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(275, 313, 205, 22);
		contentPane.add(textEmail);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBounds(112, 471, 79, 25);
		contentPane.add(back);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					if(male.isSelected())
						gender = "Male";
					if(female.isSelected())
						gender = "Female";
					if(others.isSelected())
						gender = "Others";
					
					name = textName.getText();
					id = textId.getText();
					age = textAge.getText();
					date = sdf.format(dateChooser.getDate());
					address = textAddress.getText();
					phoneNumber = textPhone.getText();
					gmail = textEmail.getText();
					designation = comboBox.getSelectedItem().toString();
					salary = textSalary.getText();
					
					Stuff s = new Stuff(name, id, age, address, gender, phoneNumber, gmail, date, designation, salary);
					FileOperationsForStuff fs = new FileOperationsForStuff();
					fs.add(s);
					
				} catch (NullPointerException x){
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				} catch (ParseException e) {
					JOptionPane.showMessageDialog(null, "Invalid data encountered.");
				}
				clear();
			}
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 15));
		add.setBounds(383, 471, 97, 25);
		contentPane.add(add);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSalary.setBounds(115, 378, 114, 22);
		contentPane.add(lblSalary);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(275, 380, 100, 22);
		contentPane.add(textSalary);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setForeground(Color.WHITE);
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDesignation.setBounds(115, 347, 133, 20);
		contentPane.add(lblDesignation);
		
		comboBox = new JComboBox(options);
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(274, 348, 167, 22);
		contentPane.add(comboBox);
	}
	
	public void clear() {
		textName.setText("");
		textId.setText("");
		textAge.setText("");
		dateChooser.setCalendar(null);
		textAddress.setText("");
		textPhone.setText("");
		textEmail.setText("");
		comboBox.setSelectedItem(null);
		textSalary.setText("");
		male.setSelected(false);
		female.setSelected(false);
		others.setSelected(false);
	}
}
