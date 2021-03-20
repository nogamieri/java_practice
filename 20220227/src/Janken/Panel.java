package Janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	public static void createPanel(JFrame frame) {
		// ヘッダーパネル表示
		Dimension headerPanelDimension = new Dimension(640, 50);
		JPanel headerPanel = setPanel(Color.BLACK, headerPanelDimension);
//		frame.add(headerPanel, BorderLayout.NORTH);
		JLabel headerLabel = new JLabel("じゃんけんで勝負");
		headerLabel = setFont(Color.WHITE, headerLabel, 24);
		headerPanel.add(headerLabel);
		frame.add(headerPanel, BorderLayout.NORTH);

		//コンテンツパネル
		Dimension contentsPanelDimension = new Dimension(640, 380);
		JPanel contentsPanel = setPanel(Color.WHITE, contentsPanelDimension);
		JLabel contentsLabel = new JLabel("じゃんけん・・・");
		contentsLabel = setFont(Color.BLACK, contentsLabel, 54);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel, BorderLayout.CENTER);

		//フッターパネル
		Dimension footerPanelDimension = new Dimension(640, 50);
		JPanel footerPanel = setPanel(Color.BLACK, footerPanelDimension);
//		frame.add(footerPanel, BorderLayout.SOUTH);

		//ボタンを表示
		JButton btnGu = new JButton("グー");
		btnGu = setButton(btnGu);
		footerPanel.add(btnGu, BorderLayout.WEST);

		JButton btnChoki = new JButton("チョキ");
		btnChoki = setButton(btnChoki);
		footerPanel.add(btnChoki, BorderLayout.CENTER);

		JButton btnPa = new JButton("パー");
		btnPa = setButton(btnPa);
		footerPanel.add(btnPa, BorderLayout.EAST);

		frame.add(footerPanel, BorderLayout.SOUTH);
	}

	public static JPanel setPanel(Color color, Dimension PanelDimension) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(PanelDimension);
		panel.setLayout(new BorderLayout());
		panel.setBackground(color);
		return (panel);
	}

	public static JLabel setFont(Color clr, JLabel label, int strSize) {
		label.setForeground(clr);
		Font labelFont = new Font("ＭＳ　ゴシック", Font.PLAIN, strSize);
		label.setFont(labelFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return (label);
	}
	public static JButton setButton(JButton button) {
		int buttonSizeX = (640 - 20)/3;
		Dimension buttonDimesion = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimesion);
		Font buttonFont = new Font("ＭＳ ゴシック",Font.PLAIN,24);
		button.setFont(buttonFont);
		return(button);
	}

}
