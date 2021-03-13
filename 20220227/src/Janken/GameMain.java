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
		JPanel headerPanel = new JPanel();

	headerPanel.setBackground(Color.BLACK);
		Dimension headerPanelDimension = new Dimension(640, 50);

	headerPanel.setPreferredSize(headerPanelDimension);
	frame.add(headerPanel,BorderLayout.NORTH);

		//コンテンツパネル
		JPanel contentsPanel = new JPanel();
		contentsPanel.setLayout(new BorderLayout());
		contentsPanel.setBackground(Color.WHITE);
		frame.add(contentsPanel,BorderLayout.CENTER);

		//フッターパネル
		JPanel footerPanel = new JPanel();
		footerPanel.setLayout(new BorderLayout());

	footerPanel.setBackground(Color.BLACK);
		Dimension footerPanelDimension = new Dimension(640, 50);

	footerPanel.setPreferredSize(footerPanelDimension);

		//ウインドウ表示
		frame.setVisible(true);

	}

}
