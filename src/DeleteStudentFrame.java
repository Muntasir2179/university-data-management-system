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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField deleteId;
	private JTextField name;
	private JTextField id;
	private JTextField age;
	private JTextField gender;
	private JTextField dateOfBirth;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField department;
	private JTextField cgpa;
	private JTextField credit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudentFrame frame = new DeleteStudentFrame();
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
	public DeleteStudentFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(12, 94, 35, 16);
		contentPane.add(label);
		
		deleteId = new JTextField();
		deleteId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		deleteId.setColumns(10);
		deleteId.setBounds(59, 84, 133, 35);
		contentPane.add(deleteId);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(229, 13, 355, 539);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Student Information");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(95, 13, 177, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Name:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(30, 64, 56, 16);
		panel.add(label_2);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setColumns(10);
		name.setBounds(156, 62, 163, 22);
		panel.add(name);
		
		JLabel label_3 = new JLabel("ID:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(30, 91, 56, 16);
		panel.add(label_3);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		id.setColumns(10);
		id.setBounds(156, 89, 114, 22);
		panel.add(id);
		
		JLabel label_4 = new JLabel("Age:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(30, 118, 56, 16);
		panel.add(label_4);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		age.setColumns(10);
		age.setBounds(156, 116, 41, 22);
		panel.add(age);
		
		JLabel label_5 = new JLabel("Gender:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(30, 145, 69, 16);
		panel.add(label_5);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gender.setColumns(10);
		gender.setBounds(156, 143, 63, 22);
		panel.add(gender);
		
		JLabel label_6 = new JLabel("Date of Birth:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(30, 176, 114, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Address:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(30, 203, 100, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Phone number:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(30, 230, 126, 16);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Email:");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(30, 257, 56, 16);
		panel.add(label_9);
		
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
		
		JLabel label_10 = new JLabel("Department:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(30, 287, 114, 16);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("C.G.P.A:");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(30, 314, 100, 16);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Credit:");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_12.setBounds(30, 341, 100, 16);
		panel.add(label_12);
		
		department = new JTextField();
		department.setFont(new Font("Tahoma", Font.PLAIN, 15));
		department.setColumns(10);
		department.setBounds(156, 285, 56, 22);
		panel.add(department);
		
		cgpa = new JTextField();
		cgpa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cgpa.setColumns(10);
		cgpa.setBounds(156, 312, 56, 22);
		panel.add(cgpa);
		
		credit = new JTextField();
		credit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		credit.setColumns(10);
		credit.setBounds(156, 339, 56, 22);
		panel.add(credit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(133, 430, 97, 25);
		panel.add(btnClear);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOperationsForStudent fs = new FileOperationsForStudent();
					
					if(deleteId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Student std = fs.delete(deleteId.getText().trim());
					
					if(std != null) {
						clear();
					}
				}catch(NullPointerException x) {
					JOptionPane.showMessageDialog(null, "Enter ID for deleting.");
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(59, 250, 97, 25);
		contentPane.add(btnDelete);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 18));
		back.setBounds(59, 333, 97, 25);
		contentPane.add(back);
		
		JButton btnShowData = new JButton("Show Data");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FileOperationsForStudent fs = new FileOperationsForStudent();
					
					if(deleteId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Student std = fs.search(deleteId.getText().trim());
					
					name.setText(std.getName());
					id.setText(std.getId());
					age.setText(std.getAge());
					gender.setText(std.getGender());
					dateOfBirth.setText(std.getBirthDate());
					address.setText(std.getAddress());
					phone.setText(std.getPhoneNumber());
					email.setText(std.getGmail());
					department.setText(std.getDepartment());
					cgpa.setText(std.getCgpa());
					credit.setText(std.getCredit());
				}catch(NullPointerException e) {
					//JOptionPane.showMessageDialog(null, "Enter ID.");
				}
			}
		});
		btnShowData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnShowData.setBounds(45, 162, 133, 25);
		contentPane.add(btnShowData);
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
		department.setText("");
		cgpa.setText("");
		credit.setText("");
	}
}
