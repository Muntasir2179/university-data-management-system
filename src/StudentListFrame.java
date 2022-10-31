import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Font;

public class StudentListFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model;
	
	private int tableControler = 0;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentListFrame frame = new StudentListFrame();
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
	public StudentListFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Load Data");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileOperationsForStudent f = new FileOperationsForStudent();
				if(tableControler == 0) {
					try {
						ArrayList<Student> list = f.display();
						
						if(list.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Data not found.");
						}else {
							for(int i=0; i<list.size(); i++) {
								String[] data = {list.get(i).getName(), list.get(i).getId(), list.get(i).getAge() ,list.get(i).getAddress(), 
										list.get(i).getGender(), list.get(i).getPhoneNumber(), list.get(i).getGmail(), list.get(i).getBirthDate(), 
										list.get(i).getDepartment(), list.get(i).getCgpa(), list.get(i).getCredit()};
								
								model.addRow(data);
							}
							tableControler++;
						}
					} catch (IOException | ParseException e) {
						JOptionPane.showMessageDialog(null, "Invalid data encountered.");
					}
				}
			}
		});
		
		btnNewButton.setBounds(12, 37, 121, 25);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(145, 26, 988, 557);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.white);
		model = new DefaultTableModel();
		String[] columnsName= {"Name","Id","Age","Address","Gender","Phone","Gmail","Date of Birth","Dept","CGPA","Credit"};
		model.setColumnIdentifiers(columnsName);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBack.setBounds(24, 122, 97, 25);
		contentPane.add(btnBack);
	}
}
