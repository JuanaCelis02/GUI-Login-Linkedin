package views.header;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import views.ConstantsGUI;

public class JPContainerHeader extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPContainerHeader() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(null);
		initComponents();
		
	}

	private void initComponents() {
		addHeaderIcon();		
		
		addHeaderLabel();
		
	}

	private void addHeaderLabel() {
		JLabel jlHeader = new JLabel(ConstantsGUI.JLABOL_HEADER);
		jlHeader.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.BOLD, 30));
		jlHeader.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
		jlHeader.setForeground(Color.WHITE);
		jlHeader.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(jlHeader);
	}

	private void addHeaderIcon() {
		JLabel jlImage = new JLabel();
		jlImage.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LINKEDIN_HEADER)));
		jlImage.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));
		jlImage.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(jlImage);
	}

}
