package views.footer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.MyUtils;
import views.ConstantsGUI;

public class JPContainerFooter extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPContainerFooter() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 15, 0));
		setBackground(Color.WHITE);
		initComponents();
	}

	private void initComponents() {
		
		JLabel jlImageFooter = new JLabel();
		jlImageFooter.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_MINI)));
		add(jlImageFooter);		
		
		JLabel jlYear = new JLabel(ConstantsGUI.JLABEL_YEAR);
		jlYear.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.PLAIN, 15));
		jlYear.setForeground(Color.decode(ConstantsGUI.COLOR_GRAY_TWO_LETTER_FOOTER));
		add(jlYear);
		
		JButton jbAcercaDe = new JButton(ConstantsGUI.TEXTBUTTON_ACERCA_DE);
		MyUtils.setFooterButtonsValues(jbAcercaDe);
		add(jbAcercaDe);
		
		JButton jbAccesiblidad = new JButton(ConstantsGUI.TEXTBUTTON_ACCESIBILIDAD);
		MyUtils.setFooterButtonsValues(jbAccesiblidad);
		add(jbAccesiblidad);
		
		JButton jbCondisiones = new JButton(ConstantsGUI.TEXTBUTTON_CONDICIONES_USO);
		MyUtils.setFooterButtonsValues(jbCondisiones);
		add(jbCondisiones);
		
		JButton jbPolPriv = new JButton(ConstantsGUI.TEXTBUTTON_POLITICA_PRIV);
		MyUtils.setFooterButtonsValues(jbPolPriv);
		add(jbPolPriv);
		
		JButton jbCookies = new JButton(ConstantsGUI.TEXTBUTTON_COOKIES);
		MyUtils.setFooterButtonsValues(jbCookies);
		add(jbCookies);
		
		JButton jbCopyRight = new JButton(ConstantsGUI.TEXTBUTTON_COPYRIGHT);
		MyUtils.setFooterButtonsValues(jbCopyRight);
		add(jbCopyRight);
		
		JButton jbPolMarca = new JButton(ConstantsGUI.TEXTBUTTON_POLITICA_MARCA);
		MyUtils.setFooterButtonsValues(jbPolMarca);
		add(jbPolMarca);
		
		JButton jbControl = new JButton(ConstantsGUI.TEXTBUTTON_CONTROLES);
		MyUtils.setFooterButtonsValues(jbControl);
		add(jbControl);
		
	}
}
