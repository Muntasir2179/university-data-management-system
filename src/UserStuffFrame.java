import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserStuffFrame extends JFrame {

	Stuff stu = null;
	
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textGender;
	private JTextField textDateOfBirth;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textDesignation;
	private JTextField textSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserStuffFrame frame = new UserStuffFrame();
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
	public UserStuffFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 603);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(12, 13, 377, 539);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Stuff Information");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(95, 13, 177, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(30, 64, 56, 16);
		panel.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(156, 62, 163, 22);
		panel.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(30, 91, 56, 16);
		panel.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(156, 89, 114, 22);
		panel.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(30, 118, 56, 16);
		panel.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(156, 116, 41, 22);
		panel.add(textAge);
		
		JLabel label_4 = new JLabel("Gender:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(30, 145, 69, 16);
		panel.add(label_4);
		
		textGender = new JTextField();
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGender.setColumns(10);
		textGender.setBounds(156, 143, 63, 22);
		panel.add(textGender);
		
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
		
		textDateOfBirth = new JTextField();
		textDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDateOfBirth.setColumns(10);
		textDateOfBirth.setBounds(156, 174, 163, 22);
		panel.add(textDateOfBirth);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(156, 201, 187, 22);
		panel.add(textAddress);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(156, 228, 116, 22);
		panel.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(156, 255, 163, 22);
		panel.add(textEmail);
		
		JLabel label_9 = new JLabel("Designation:");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(30, 287, 114, 16);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Salary:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(30, 314, 100, 16);
		panel.add(label_10);
		
		textDesignation = new JTextField();
		textDesignation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDesignation.setColumns(10);
		textDesignation.setBounds(156, 285, 114, 22);
		panel.add(textDesignation);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(156, 312, 88, 22);
		panel.add(textSalary);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.makeLoginVisible(true);
				dispose();
			}
		});
		btnLogout.setBounds(142, 426, 97, 25);
		panel.add(btnLogout);
	}

	public void setStu(Stuff stu) {
		this.stu = stu;
	}
	
	public void setInformation() {
		if(stu != null) {
			textName.setText(stu.getName());
			textId.setText(stu.getId());
			textAge.setText(stu.getAge());
			textGender.setText(stu.getGender());
			textDateOfBirth.setText(stu.getBirthDate());
			textAddress.setText(stu.getAddress());
			textPhone.setText(stu.getPhoneNumber());
			textEmail.setText(stu.getGmail());
			textDesignation.setText(stu.getDesignation());
			textSalary.setText(stu.getSalary());
		}
	}
}
