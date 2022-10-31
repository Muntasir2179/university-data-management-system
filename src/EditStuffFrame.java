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
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class EditStuffFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textSalary;

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
					EditStuffFrame frame = new EditStuffFrame();
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
	public EditStuffFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterValidInformation = new JLabel("Enter valid information for Stuff");
		lblEnterValidInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterValidInformation.setBounds(162, 32, 314, 21);
		contentPane.add(lblEnterValidInformation);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(124, 75, 76, 21);
		contentPane.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textName.setColumns(10);
		textName.setBounds(279, 75, 186, 22);
		contentPane.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(124, 112, 76, 21);
		contentPane.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textId.setColumns(10);
		textId.setBounds(279, 112, 139, 22);
		contentPane.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(124, 149, 76, 21);
		contentPane.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textAge.setColumns(10);
		textAge.setBounds(279, 149, 57, 22);
		contentPane.add(textAge);
		
		JLabel label_4 = new JLabel("Date Of Birth:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(124, 183, 127, 21);
		contentPane.add(label_4);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(278, 185, 100, 22);
		contentPane.add(dateChooser);
		
		JLabel label_5 = new JLabel("Address:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(124, 220, 93, 21);
		contentPane.add(label_5);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textAddress.setColumns(10);
		textAddress.setBounds(279, 220, 207, 22);
		contentPane.add(textAddress);
		
		JLabel label_6 = new JLabel("Gender:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(124, 254, 76, 21);
		contentPane.add(label_6);
		
		JRadioButton male = new JRadioButton("Male");
		male.setForeground(Color.WHITE);
		male.setFont(new Font("Tahoma", Font.BOLD, 13));
		male.setBackground(new Color(0, 128, 128));
		male.setBounds(276, 257, 60, 25);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setForeground(Color.WHITE);
		female.setFont(new Font("Tahoma", Font.BOLD, 13));
		female.setBackground(new Color(0, 128, 128));
		female.setBounds(340, 257, 76, 25);
		contentPane.add(female);
		
		JRadioButton others = new JRadioButton("Others");
		others.setForeground(Color.WHITE);
		others.setFont(new Font("Tahoma", Font.BOLD, 13));
		others.setBackground(new Color(0, 128, 128));
		others.setBounds(416, 257, 76, 25);
		contentPane.add(others);
		
		JLabel label_7 = new JLabel("Phone Number:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(124, 294, 139, 21);
		contentPane.add(label_7);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textPhone.setColumns(10);
		textPhone.setBounds(279, 294, 186, 22);
		contentPane.add(textPhone);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(124, 328, 139, 21);
		contentPane.add(label_8);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textEmail.setColumns(10);
		textEmail.setBounds(279, 328, 186, 22);
		contentPane.add(textEmail);
		
		JLabel label_9 = new JLabel("Salary:");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setBounds(123, 400, 127, 21);
		contentPane.add(label_9);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textSalary.setColumns(10);
		textSalary.setBounds(278, 400, 93, 22);
		contentPane.add(textSalary);
		
		JLabel label_11 = new JLabel("Designation:");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_11.setBounds(123, 363, 127, 21);
		contentPane.add(label_11);
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(278, 364, 167, 22);
		contentPane.add(comboBox);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 20));
		back.setBounds(123, 493, 97, 25);
		contentPane.add(back);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		clear.setBounds(258, 493, 97, 25);
		contentPane.add(clear);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				FileOperationsForStuff fs = new FileOperationsForStuff();
				
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
					
					Stuff st = new Stuff(name, id, age, address, gender, phoneNumber, gmail, date, designation, salary);
					fs.edit(st);
				} catch (ParseException e1) {
					JOptionPane.showMessageDialog(null, "Invalid data encountered.");
				}catch (NullPointerException x){
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
			}
		});
		edit.setFont(new Font("Tahoma", Font.BOLD, 20));
		edit.setBounds(389, 493, 97, 25);
		contentPane.add(edit);
	}
}
