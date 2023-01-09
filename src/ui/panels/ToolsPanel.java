package ui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ui.Window;

public class ToolsPanel extends JPanel {
	
	private JButton emptyButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton solveButton;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4432571170375056548L;

	public ToolsPanel(Window window) {
		setLayout(new GridLayout(4, 1));
		
		setPreferredSize(new Dimension(200, 600));
		setBackground(Color.red);
		
		add(emptyButton = new JButton("Empty Maze"));
		add(loadButton = new JButton("Load Maze"));
		add(saveButton = new JButton("Save Maze"));
		add(solveButton = new JButton("Solve Maze"));
		
		emptyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.getLaby().reset();
				window.repaint();
				
			}
		});
		
		loadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.getLaby().load();
				window.repaint();
			}
		});
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		solveButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				window.getLaby().solve();
				window.repaint();
			}
		});
	}

}
