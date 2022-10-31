import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class StuffListFrame extends JFrame {

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
					StuffListFrame frame = new StuffListFrame();
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
	public StuffListFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(162, 13, 971, 570);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		model = new DefaultTableModel();
		String[] columnsName= {"Name","Id","Age","Gender","Date of Birth","Address","Phone","Gmail","Designation","Salary"};
		model.setColumnIdentifiers(columnsName);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton loadData = new JButton("Load Data");
		loadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileOperationsForStuff fs = new FileOperationsForStuff();
				
				if(tableControler == 0) {
					try {
						ArrayList<Stuff> list = fs.display();
						if(list.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Data not found.");
						}else {
							for(int i=0; i<list.size(); i++) {
								String[] data = {list.get(i).getName(), list.get(i).getId(), list.get(i).getAge(), 
										list.get(i).getBirthDate(), list.get(i).getGender(), list.get(i).getAddress(), 
										list.get(i).getPhoneNumber(), list.get(i).getGmail(), list.get(i).getDesignation(), 
										list.get(i).getSalary()};
								
								model.addRow(data);
							}
							tableControler++;
						}
					}catch (NullPointerException x) {
						JOptionPane.showMessageDialog(null, "Invalid data encountered.");
					}
				}
			}
		});
		loadData.setFont(new Font("Tahoma", Font.BOLD, 17));
		loadData.setBounds(25, 55, 121, 25);
		contentPane.add(loadData);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 17));
		back.setBounds(37, 140, 97, 25);
		contentPane.add(back);
	}
}
