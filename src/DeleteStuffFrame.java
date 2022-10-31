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

public class DeleteStuffFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textDeleteId;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textGender;
	private JTextField textDate;
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
					DeleteStuffFrame frame = new DeleteStuffFrame();
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
	public DeleteStuffFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDeleteId = new JTextField();
		textDeleteId.setFont(new Font("Tahoma", Font.BOLD, 17));
		textDeleteId.setColumns(10);
		textDeleteId.setBounds(28, 84, 133, 35);
		contentPane.add(textDeleteId);
		
		JButton Show = new JButton("Show Data");
		Show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOperationsForStuff fs = new FileOperationsForStuff();
					
					if(textDeleteId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Stuff st = fs.search(textDeleteId.getText().trim());
					
					if(st.getId().equals(textDeleteId.getText().trim())){
						textName.setText(st.getName());
						textId.setText(st.getId());
						textAge.setText(st.getAge());
						textGender.setText(st.getGender());
						textDate.setText(st.getBirthDate());
						textAddress.setText(st.getAddress());
						textPhone.setText(st.getPhoneNumber());
						textEmail.setText(st.getGmail());
						textDesignation.setText(st.getDesignation());
						textSalary.setText(st.getSalary());
					}
					
				}catch(Exception x) {
					JOptionPane.showMessageDialog(null, "Enter ID.");
				}
			}
		});
		Show.setFont(new Font("Tahoma", Font.BOLD, 18));
		Show.setBounds(28, 161, 133, 25);
		contentPane.add(Show);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOperationsForStuff fs = new FileOperationsForStuff();
					
					if(textDeleteId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Stuff st = (Stuff)fs.delete(textDeleteId.getText().trim());
					
					if(st != null) {
						clear();
					}
				}catch(NullPointerException x) {
					JOptionPane.showMessageDialog(null, "Enter ID for deleting.");
				}
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 18));
		delete.setBounds(45, 250, 97, 25);
		contentPane.add(delete);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 18));
		back.setBounds(45, 332, 97, 25);
		contentPane.add(back);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(210, 13, 382, 551);
		contentPane.add(panel);
		
		JLabel lblStuffInformation = new JLabel("Stuff Information");
		lblStuffInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStuffInformation.setBounds(127, 13, 177, 16);
		panel.add(lblStuffInformation);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(30, 66, 56, 16);
		panel.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(168, 64, 177, 22);
		panel.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(30, 93, 56, 16);
		panel.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(168, 91, 114, 22);
		panel.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(30, 120, 56, 16);
		panel.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(168, 118, 41, 22);
		panel.add(textAge);
		
		JLabel label_4 = new JLabel("Gender:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(30, 148, 69, 16);
		panel.add(label_4);
		
		textGender = new JTextField();
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGender.setColumns(10);
		textGender.setBounds(168, 145, 63, 22);
		panel.add(textGender);
		
		JLabel label_5 = new JLabel("Date of Birth:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(30, 179, 114, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Address:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(30, 206, 100, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phone number:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(30, 233, 126, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(30, 260, 56, 16);
		panel.add(label_8);
		
		textDate = new JTextField();
		textDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDate.setColumns(10);
		textDate.setBounds(168, 176, 100, 22);
		panel.add(textDate);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(168, 203, 187, 22);
		panel.add(textAddress);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(168, 230, 116, 22);
		panel.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(168, 257, 163, 22);
		panel.add(textEmail);
		
		JLabel label_9 = new JLabel("Designation:");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(30, 290, 114, 16);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Salary:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(30, 317, 100, 16);
		panel.add(label_10);
		
		textDesignation = new JTextField();
		textDesignation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDesignation.setColumns(10);
		textDesignation.setBounds(168, 287, 136, 22);
		panel.add(textDesignation);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(168, 314, 100, 22);
		panel.add(textSalary);
		
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
		textName.setText("");
		textId.setText("");
		textAge.setText("");
		textGender.setText("");
		textDate.setText("");
		textAddress.setText("");
		textPhone.setText("");
		textEmail.setText("");
		textDesignation.setText("");
		textSalary.setText("");
	}
}
