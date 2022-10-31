import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchStuffFrame extends JFrame {

	private JPanel contentPane;
	private JTextField searchId;
	private JTextField name;
	private JTextField id;
	private JTextField age;
	private JTextField gender;
	private JTextField dateOfBirth;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField designation;
	private JTextField salary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStuffFrame frame = new SearchStuffFrame();
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
	public SearchStuffFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchId = new JTextField();
		searchId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		searchId.setColumns(10);
		searchId.setBounds(46, 82, 133, 35);
		contentPane.add(searchId);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FileOperationsForStuff fs = new FileOperationsForStuff();
					
					if(searchId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Stuff st = fs.search(searchId.getText().trim());
					
					
					if(searchId.getText().equals(st.getId())) {
						name.setText(st.getName());
						id.setText(st.getId());
						age.setText(st.getAge());
						gender.setText(st.getGender());
						dateOfBirth.setText(st.getBirthDate());
						address.setText(st.getAddress());
						phone.setText(st.getPhoneNumber());
						email.setText(st.getGmail());
						designation.setText(st.getDesignation());
						salary.setText(st.getSalary());
					}else {
						clear();
					}
				}catch(NullPointerException x) {
					JOptionPane.showMessageDialog(null, "Enter ID for searching.");
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(67, 176, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(67, 281, 97, 25);
		contentPane.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(215, 13, 377, 539);
		contentPane.add(panel);
		
		JLabel lblStuffInformation = new JLabel("Stuff Information");
		lblStuffInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStuffInformation.setBounds(95, 13, 177, 16);
		panel.add(lblStuffInformation);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(30, 64, 56, 16);
		panel.add(label_1);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setColumns(10);
		name.setBounds(156, 62, 163, 22);
		panel.add(name);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(30, 91, 56, 16);
		panel.add(label_2);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		id.setColumns(10);
		id.setBounds(156, 89, 114, 22);
		panel.add(id);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(30, 118, 56, 16);
		panel.add(label_3);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		age.setColumns(10);
		age.setBounds(156, 116, 41, 22);
		panel.add(age);
		
		JLabel label_4 = new JLabel("Gender:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(30, 145, 69, 16);
		panel.add(label_4);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gender.setColumns(10);
		gender.setBounds(156, 143, 63, 22);
		panel.add(gender);
		
		JLabel label_5 = new JLabel("Date of Birth:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(30, 176, 114, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Address:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(30, 203, 100, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phone number:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(30, 230, 126, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(30, 257, 56, 16);
		panel.add(label_8);
		
		dateOfBirth = new JTextField();
		dateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dateOfBirth.setColumns(10);
		dateOfBirth.setBounds(156, 174, 163, 22);
		panel.add(dateOfBirth);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		address.setColumns(10);
		address.setBounds(156, 201, 187, 22);
		panel.add(address);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phone.setColumns(10);
		phone.setBounds(156, 228, 116, 22);
		panel.add(phone);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setColumns(10);
		email.setBounds(156, 255, 163, 22);
		panel.add(email);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesignation.setBounds(30, 287, 114, 16);
		panel.add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSalary.setBounds(30, 314, 100, 16);
		panel.add(lblSalary);
		
		designation = new JTextField();
		designation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		designation.setColumns(10);
		designation.setBounds(156, 285, 114, 22);
		panel.add(designation);
		
		salary = new JTextField();
		salary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		salary.setColumns(10);
		salary.setBounds(156, 312, 88, 22);
		panel.add(salary);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 18));
		clear.setBounds(133, 430, 97, 25);
		panel.add(clear);
	}
	
	public void clear() {
		name.setText("");
		id.setText("");
		age.setText("");
		gender.setText("");
		dateOfBirth.setText("");
		address.setText("");
		phone.setText("");
		email.setText("");
		designation.setText("");
		salary.setText("");
	}
}
