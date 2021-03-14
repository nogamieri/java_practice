package Janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameMain {

	public static void main(String[] args) {
		// ウィンドウ設定
		JFrame frame = new JFrame("じゃんけんゲーム");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		// パネル表示
		Dimension headerPanelDimension = new Dimension(640, 50);
		JPanel headerPanel =  setPanel(Color.BLACK, headerPanelDimension);
		frame.add(headerPanel,BorderLayout.NORTH);

		//コンテンツパネル
		Dimension contentsPanelDimension = new Dimension(640, 380);
		JPanel contentsPanel = setPanel(Color.WHITE, contentsPanelDimension);
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

}
