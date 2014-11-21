package Assignment4;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MinesweeperGUI extends JFrame{

	private JFrame gameGUI,signIN;
	private JPanel boardPanel;
	private JButton[][] boardButtons = new JButton [10][10];

	public MinesweeperGUI(){
		
		

		gameGUI = new JFrame("Enhanced Minesweeper"); //Title of the Window
		gameGUI.setSize(335,450); //400 550
		gameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This will close the frame when you press X. IMPORTANT
		gameGUI.getContentPane().setBackground(Color.CYAN);
		gameGUI.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu gameMenu = new JMenu("Game");
		gameMenu.setMnemonic(KeyEvent.VK_G);
			
			JMenuItem gameNew = new JMenuItem("New Game");
	        gameNew.setMnemonic(KeyEvent.VK_N);
	        gameNew.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	               //IMPLEMENT METHOD NEWBOARD
	            }
	        });
	        JMenuItem gameLoad = new JMenuItem("Load Game");
	        gameLoad.setMnemonic(KeyEvent.VK_L);
	        gameLoad.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent event){
	        	 //SERIALIZABLE LOAD // PLAYER?
	        	}
	        });

	        JMenuItem gameSave = new JMenuItem("Save Game");
	        gameSave.setMnemonic(KeyEvent.VK_S);
	        gameLoad.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent event){
	        	//CALLING METHOD?
	        	}
	        });
	        
	        
	        JMenuItem gameExit = new JMenuItem("Exit Game");
	        gameExit.setMnemonic(KeyEvent.VK_E);
	        gameExit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	        
	        
	        JMenuItem gameHighScores = new JMenuItem("High Scores");
	        gameHighScores.setMnemonic(KeyEvent.VK_H);
	        
		gameMenu.add(gameNew);
		gameMenu.add(gameLoad);
		gameMenu.add(gameSave);
		gameMenu.addSeparator();
		gameMenu.add(gameHighScores);
		gameMenu.addSeparator();
		gameMenu.add(gameExit);
		
		menuBar.add(gameMenu);
		gameGUI.setJMenuBar(menuBar);
									
		//Panel for minesweeper board
		boardPanel = new JPanel();
		GridLayout experimentLayout = new GridLayout(10, 10);
		boardPanel.setLayout(experimentLayout);
		boardPanel.setBounds(10, 10, 300, 300);
		
		for(int x=0;x<boardButtons.length;x++){
			for(int y=0;y<boardButtons[x].length;y++){
				
				boardButtons[x][y] = new JButton();
				boardPanel.add(boardButtons[x][y]);
				}
		}
		gameGUI.add(boardPanel);
		
		//Sign In Window/Prompt
		signIN = new JFrame("Enhanced Minesweeper");
		signIN.setSize(350,100);
		signIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This will close the frame when you press X. IMPORTANT
		
		JLabel enterName = new JLabel("Enter your name:");
		final JTextField nameField = new JTextField(20);
		JPanel infoPanel = new JPanel();
		JButton submitName = new JButton("Enter");
			submitName.addActionListener(new ActionListener (){
				public void actionPerformed(ActionEvent event) {
					String nameFieldValue = nameField.getText();
					signIN.dispose();
					gameGUI.setVisible(true);
				}
			});
			
		infoPanel.add(enterName);
		infoPanel.add(nameField);
		infoPanel.add(submitName);
		signIN.add(infoPanel);
		signIN.setVisible(true);
	}
	
	
	
	/*
	public void revealBoard(Block[][] board){
		
		for(int x = 0; x<board.length;x++){
			for (int y = 0; y<board[].getSize(); y++){		
			if(board[x][y].?revealed? == false){
				boardButtons[x][y].doClick();
			}
		}
	}
		
	}
	*/
	public static void main(String[] args) {
		
		MinesweeperGUI mainInterface = new MinesweeperGUI();
		
	}
	
}
