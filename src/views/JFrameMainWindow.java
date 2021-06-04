package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JFrameMainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPMainPanel mainPanel;
	
	public JFrameMainWindow() {
		setExtendedState(MAXIMIZED_BOTH);
		setIconImage(new ImageIcon(getClass().getResource(ConstantsGUI.ICON_LINKEDIN)).getImage());
		setTitle(ConstantsGUI.TITLE_LINKEDIN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		mainPanel = new JPMainPanel();
		JScrollPane jsPMainPanel = new JScrollPane();
		jsPMainPanel.setViewportView(mainPanel);
		add(mainPanel);	
	}

	public static void main(String[] args) {
		new JFrameMainWindow();
	}

}
