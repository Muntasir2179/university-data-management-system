import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelStuff extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelStuff() {
		setBackground(new Color(0, 128, 128));
		setBounds(0, 0, 775, 500);
		setLayout(null);
		
		JLabel lblTeacherStuff = new JLabel("Teacher Stuff");
		lblTeacherStuff.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTeacherStuff.setBounds(299, 27, 181, 28);
		add(lblTeacherStuff);
		
		JPanel panelAdd = new JPanel();
		panelAdd.addMouseListener(new PanelButtonMouseAdapter(panelAdd) {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddStuffFrame add = new AddStuffFrame();
				add.setVisible(true);
				dispose();
			}
		});
		panelAdd.setLayout(null);
		panelAdd.setBackground(new Color(173, 216, 230));
		panelAdd.setBounds(92, 125, 157, 105);
		add(panelAdd);
		
		JLabel label_1 = new JLabel("Add");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_1.setBounds(51, 40, 54, 28);
		panelAdd.add(label_1);
		
		JPanel panelSearch = new JPanel();
		panelSearch.addMouseListener(new PanelButtonMouseAdapter(panelSearch) {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchStuffFrame search = new SearchStuffFrame();
				search.setVisible(true);
				dispose();
			}
		});
		panelSearch.setLayout(null);
		panelSearch.setBackground(new Color(173, 216, 230));
		panelSearch.setBounds(308, 125, 157, 105);
		add(panelSearch);
		
		JLabel label_2 = new JLabel("Search");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_2.setBounds(43, 37, 80, 28);
		panelSearch.add(label_2);
		
		JPanel panelEdit = new JPanel();
		panelEdit.addMouseListener(new PanelButtonMouseAdapter(panelEdit) {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditStuffFrame edit = new EditStuffFrame();
				edit.setVisible(true);
				dispose();
			}
		});
		panelEdit.setLayout(null);
		panelEdit.setBackground(new Color(173, 216, 230));
		panelEdit.setBounds(521, 125, 157, 105);
		add(panelEdit);
		
		JLabel label_3 = new JLabel("Edit");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_3.setBounds(51, 36, 60, 28);
		panelEdit.add(label_3);
		
		JPanel panelDelete = new JPanel();
		panelDelete.addMouseListener(new PanelButtonMouseAdapter(panelDelete) {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteStuffFrame delete = new DeleteStuffFrame();
				delete.setVisible(true);
				dispose();
			}
		});
		panelDelete.setLayout(null);
		panelDelete.setBackground(new Color(173, 216, 230));
		panelDelete.setBounds(204, 270, 157, 105);
		add(panelDelete);
		
		JLabel label_4 = new JLabel("Delete");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_4.setBounds(36, 36, 98, 28);
		panelDelete.add(label_4);
		
		JPanel panelList = new JPanel();
		panelList.addMouseListener(new PanelButtonMouseAdapter(panelList) {
			@Override
			public void mouseClicked(MouseEvent e) {
				StuffListFrame list= new StuffListFrame();
				list.setVisible(true);
				dispose();
			}
		});
		panelList.setLayout(null);
		panelList.setBackground(new Color(173, 216, 230));
		panelList.setBounds(412, 270, 157, 105);
		add(panelList);
		
		JLabel label_5 = new JLabel("List");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_5.setBounds(51, 35, 60, 28);
		panelList.add(label_5);
	}
	
	//for disposing this panel
	public void dispose() {
		JFrame parent = (JFrame) this.getTopLevelAncestor();
		parent.dispose();
	}
}
