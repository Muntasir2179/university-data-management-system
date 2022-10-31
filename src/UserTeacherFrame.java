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

public class UserTeacherFrame extends JFrame {

	Teacher tea = null;
	
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textSalary;
	private JTextField textCourse;
	private JTextField textDateOfBirth;
	private JTextField textGender;
	private JTextField textDesignation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserTeacherFrame frame = new UserTeacherFrame();
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
	public UserTeacherFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(12, 13, 459, 570);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Name:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(65, 78, 76, 21);
		panel.add(label);
		
		textName = new JTextField();
		textName.setForeground(Color.BLACK);
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(220, 78, 186, 22);
		panel.add(textName);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(65, 115, 76, 21);
		panel.add(label_1);
		
		textId = new JTextField();
		textId.setForeground(Color.BLACK);
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(220, 115, 139, 22);
		panel.add(textId);
		
		JLabel label_2 = new JLabel("Age:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(65, 152, 76, 21);
		panel.add(label_2);
		
		textAge = new JTextField();
		textAge.setForeground(Color.BLACK);
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(220, 152, 57, 22);
		panel.add(textAge);
		
		JLabel label_3 = new JLabel("Date Of Birth:");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(65, 186, 127, 21);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Address:");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(65, 223, 93, 21);
		panel.add(label_4);
		
		textAddress = new JTextField();
		textAddress.setForeground(Color.BLACK);
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(220, 223, 207, 22);
		panel.add(textAddress);
		
		JLabel label_5 = new JLabel("Phone Number:");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(65, 297, 139, 21);
		panel.add(label_5);
		
		textPhone = new JTextField();
		textPhone.setForeground(Color.BLACK);
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(220, 297, 186, 22);
		panel.add(textPhone);
		
		JLabel label_6 = new JLabel("Email:");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(65, 331, 139, 21);
		panel.add(label_6);
		
		textEmail = new JTextField();
		textEmail.setForeground(Color.BLACK);
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(220, 331, 186, 22);
		panel.add(textEmail);
		
		JLabel label_7 = new JLabel("Gender:");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(65, 257, 76, 21);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Designation:");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(64, 366, 127, 21);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Salary:");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setBounds(64, 403, 127, 21);
		panel.add(label_9);
		
		textSalary = new JTextField();
		textSalary.setForeground(Color.BLACK);
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(219, 403, 93, 22);
		panel.add(textSalary);
		
		JLabel label_10 = new JLabel("Course Teaches:");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setBounds(64, 437, 143, 21);
		panel.add(label_10);
		
		textCourse = new JTextField();
		textCourse.setForeground(Color.BLACK);
		textCourse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCourse.setColumns(10);
		textCourse.setBounds(219, 437, 139, 22);
		panel.add(textCourse);
		
		textDateOfBirth = new JTextField();
		textDateOfBirth.setForeground(Color.BLACK);
		textDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDateOfBirth.setColumns(10);
		textDateOfBirth.setBounds(220, 187, 139, 22);
		panel.add(textDateOfBirth);
		
		textGender = new JTextField();
		textGender.setForeground(Color.BLACK);
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGender.setColumns(10);
		textGender.setBounds(220, 258, 57, 22);
		panel.add(textGender);
		
		textDesignation = new JTextField();
		textDesignation.setForeground(Color.BLACK);
		textDesignation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDesignation.setColumns(10);
		textDesignation.setBounds(220, 367, 139, 22);
		panel.add(textDesignation);
		
		JLabel label_11 = new JLabel("Teacher Information");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_11.setBounds(140, 13, 186, 21);
		panel.add(label_11);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log = new Login();
				log.makeLoginVisible(true);
				dispose();
			}
		});
		btnLogout.setBounds(191, 500, 86, 25);
		panel.add(btnLogout);
	}
	
	public void setTea(Teacher tea) {
		this.tea = tea;
	}

	public void setInformation() {
		if(tea != null) {
			textName.setText(tea.getName());
			textId.setText(tea.getId());
			textAge.setText(tea.getAge());
			textDateOfBirth.setText(tea.getBirthDate());
			textAddress.setText(tea.getAddress());
			textGender.setText(tea.getGender());
			textPhone.setText(tea.getPhoneNumber());
			textEmail.setText(tea.getGmail());
			textDesignation.setText(tea.getDesignation());
			textSalary.setText(tea.getSalary());
			textCourse.setText(tea.getCourseTeaches());
		}
	}
}
