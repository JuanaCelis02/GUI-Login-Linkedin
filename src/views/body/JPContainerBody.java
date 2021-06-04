package views.body;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import views.ConstantsGUI;
public class JPContainerBody extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPContainerBody(){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode(ConstantsGUI.COLOR_BOX_INFO));
		setBorder(BorderFactory.createMatteBorder(30, 470, 130, 470, Color.decode(ConstantsGUI.COLOR_BACKGROUND_PRINCIPAL)));
		//setBackground(null);
		initComponents();
	}

	private void initComponents() {
		JLabel jlEmail = new JLabel(ConstantsGUI.JLABEL_EMAIL);
		jlEmail.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.PLAIN, 15));
		jlEmail.setAlignmentX(CENTER_ALIGNMENT);
		jlEmail.setBorder(BorderFactory.createEmptyBorder(20,0,0,345));
		add(jlEmail);
		
		JTextField jtFEmail = new JTextField();
		jtFEmail.setMaximumSize(new Dimension(380,30));
		jtFEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(jtFEmail);
		
		JLabel jlPassword = new JLabel(ConstantsGUI.JLABEL_PASSWORD);
		jlPassword.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.PLAIN, 15));
		jlPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlPassword.setBorder(BorderFactory.createEmptyBorder(10,0,0,160));
		add(jlPassword);
		
		JTextField jtPassword = new JTextField();
		jtPassword.setMaximumSize(new Dimension(380,30));
		jtPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(jtPassword);
		
		JLabel jlTyC = new JLabel(ConstantsGUI.JLABEL_TYC);
		jlTyC.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.PLAIN, 15));
		jlTyC.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlTyC.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
		add(jlTyC);
		
		JButton jbAccept = new JButton(ConstantsGUI.ACCEPT_AND_JOIN);
		jbAccept.setMaximumSize(new Dimension(380,30));
		jbAccept.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.BOLD, 10));
		jbAccept.setForeground(Color.WHITE);
		jbAccept.setBackground(Color.decode(ConstantsGUI.COLOR_BLUE_BUTTON));
		jbAccept.setMaximumSize(new Dimension(380,30));
		jbAccept.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(jbAccept);
		
		JSeparator jseparator = new JSeparator();
		jseparator.setMaximumSize(new Dimension(380,30));
		jseparator.setAlignmentX(CENTER_ALIGNMENT);
		add(jseparator);
		
		JButton buttonGoogle = new JButton();
		buttonGoogle.setText(ConstantsGUI.JLABEL_LOGIN_GOOGLE);
		buttonGoogle.setMaximumSize(new Dimension(380,30));
		buttonGoogle.setBackground(null);
		buttonGoogle.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_GOOGLE)).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH)));
		buttonGoogle.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(buttonGoogle);
		
		
		JLabel jlLogIn = new JLabel(ConstantsGUI.JLABEL_INVITATION);
		jlLogIn.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.PLAIN,17));
		jlLogIn.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		jlLogIn.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(jlLogIn);
		
		JButton buttonLogIn = new JButton();
		buttonLogIn.setText(ConstantsGUI.JBUTTON_LOGIN);
		buttonLogIn.setMaximumSize(new Dimension(380,30));
		buttonLogIn.setForeground(Color.decode(ConstantsGUI.COLOR_BLUE_BUTTON));
		buttonLogIn.setBackground(null);
		buttonLogIn.setBorder(null);
		buttonLogIn.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(buttonLogIn);
		
	}
	
	
}
