package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import views.ConstantsGUI;

public class MyUtils {
	
	public static void setFooterButtonsValues(JButton buttonToChange) {
		buttonToChange.setMaximumSize(new Dimension(300,260));
		buttonToChange.setFont(new Font(ConstantsGUI.FONT_LABEL_HEADER, Font.ITALIC, 15));
		buttonToChange.setForeground(Color.decode(ConstantsGUI.COLOR_GRAY_TWO_LETTER_FOOTER));
		buttonToChange.setBackground(null);
		buttonToChange.setBorder(null);
	}
}
