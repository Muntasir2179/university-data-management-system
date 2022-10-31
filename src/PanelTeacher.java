import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelTeacher extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTeacher() {
		setBackground(new Color(0, 128, 128));
		setBounds(0, 0, 775, 500);
		setLayout(null);
		
		JPanel panelAdd = new JPanel();
		panelAdd.addMouseListener(new PanelButtonMouseAdapter(panelAdd) {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddTeacherFrame add = new AddTeacherFrame();
				add.setVisible(true);
				dispose();
			}
		});
		panelAdd.setBackground(new Color(173, 216, 230));
		panelAdd.setBounds(93, 124, 157, 105);
		add(panelAdd);
		panelAdd.setLayout(null);
		
		JLabel lblAddTeacher = new JLabel("Add");
		lblAddTeacher.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAddTeacher.setBounds(51, 40, 54, 28);
		panelAdd.add(lblAddTeacher);
		
		JPanel panelSarch = new JPanel();
		panelSarch.addMouseListener(new PanelButtonMouseAdapter(panelSarch) {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchTeacherFrame search = new SearchTeacherFrame();
				search.setVisible(true);
				dispose();
			}
		});
		panelSarch.setBackground(new Color(173, 216, 230));
		panelSarch.setLayout(null);
		panelSarch.setBounds(309, 124, 157, 105);
		add(panelSarch);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSearch.setBounds(43, 37, 80, 28);
		panelSarch.add(lblSearch);
		
		JPanel panelEdit = new JPanel();
		panelEdit.addMouseListener(new PanelButtonMouseAdapter(panelEdit) {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditTeacherFrame edit = new EditTeacherFrame();
				edit.setVisible(true);
				dispose();
			}
		});
		panelEdit.setBackground(new Color(173, 216, 230));
		panelEdit.setLayout(null);
		panelEdit.setBounds(522, 124, 157, 105);
		add(panelEdit);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblEdit.setBounds(51, 36, 60, 28);
		panelEdit.add(lblEdit);
		
		JPanel panelDelete = new JPanel();
		panelDelete.addMouseListener(new PanelButtonMouseAdapter(panelDelete) {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteTeacherFrame delete = new DeleteTeacherFrame();
				delete.setVisible(true);
				dispose();
			}
		});
		panelDelete.setBackground(new Color(173, 216, 230));
		panelDelete.setLayout(null);
		panelDelete.setBounds(205, 269, 157, 105);
		add(panelDelete);
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblDelete.setBounds(36, 36, 98, 28);
		panelDelete.add(lblDelete);
		
		JPanel panelList = new JPanel();
		panelList.addMouseListener(new PanelButtonMouseAdapter(panelList) {
			@Override
			public void mouseClicked(MouseEvent e) {
				TeacherListFrame list = new TeacherListFrame();
				list.setVisible(true);
				dispose();
			}
		});
		panelList.setBackground(new Color(173, 216, 230));
		panelList.setLayout(null);
		panelList.setBounds(413, 269, 157, 105);
		add(panelList);
		
		JLabel lblList = new JLabel("List");
		lblList.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblList.setBounds(51, 35, 60, 28);
		panelList.add(lblList);
		
		JLabel lblTeacherPanel = new JLabel("Teacher Panel");
		lblTeacherPanel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTeacherPanel.setBounds(300, 26, 181, 28);
		add(lblTeacherPanel);
	}
	
	//for disposing this panel
	public void dispose() {
		JFrame parent = (JFrame) this.getTopLevelAncestor();
		parent.dispose();
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		
		//constructor
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(173, 216, 230));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60,179,133));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
	}
	
}
