package Janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameMain {

	public static void main(String[] args) {
		// ウィンドウ設定
		JFrame frame = new JFrame("じゃんけんゲーム");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		// ヘッダーパネル表示
		Dimension headerPanelDimension = new Dimension(640, 50);
		JPanel headerPanel =  setPanel(Color.BLACK, headerPanelDimension);
		frame.add(headerPanel,BorderLayout.NORTH);
		JLabel headerLabel = new JLabel("じゃんけんで勝負");
		headerLabel = setFont(Color.WHITE,headerLabel,24);
		headerPanel.add(headerLabel);
		frame.add(headerPanel,BorderLayout.NORTH);

		//コンテンツパネル
		Dimension contentsPanelDimension = new Dimension(640, 380);
		JPanel contentsPanel = setPanel(Color.WHITE, contentsPanelDimension);
		JLabel contentsLabel = new JLabel("じゃんけん・・・");
		contentsLabel = setFont(Color.BLACK,contentsLabel,54);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel,BorderLayout.CENTER);

		//フッターパネル
		Dimension footerPanelDimension = new Dimension(640, 50);
		JPanel footerPanel = setPanel(Color.BLACK, footerPanelDimension);
		frame.add(footerPanel,BorderLayout.SOUTH);

		//ウインドウ表示
		frame.setVisible(true);
	}
	public static JPanel setPanel(Color color, Dimension PanelDimension) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(PanelDimension);
		panel.setLayout(new BorderLayout());
		panel.setBackground(color);
		return(panel);
	}
	public static JLabel setFont(Color clr,JLabel label,int strSize) {
		label.setForeground(clr);
		Font labelFont = new Font("ＭＳ　ゴシック",Font.PLAIN, strSize);
		label.setFont(labelFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return(label);
	}

}
