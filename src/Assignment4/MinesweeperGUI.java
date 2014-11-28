package Assignment4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MinesweeperGUI extends JFrame {

	private JFrame gameGUI, signIN;
	private JPanel boardPanel;
	private JButton[][] boardButtons = new JButton[10][10];
	private Game gameBoard = new Game();
	private Block[][] blockBoard = gameBoard.createNewBoard();
<<<<<<< HEAD
	
	private String userName;
	

	public MinesweeperGUI() {
		
=======

	public MinesweeperGUI() {

>>>>>>> origin/master
		gameGUI = new JFrame("Enhanced Minesweeper"); // Title of the Window
		gameGUI.setSize(335, 450); // 400 550
		gameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close the frame when you press X.
		// ^ IMPORTANT
		gameGUI.setResizable(false); //Disables Resize
		gameGUI.getContentPane().setBackground(Color.CYAN);
		gameGUI.setLayout(null);
		

		JMenuBar menuBar = new JMenuBar();
		JMenu gameMenu = new JMenu("Game");

		gameMenu.setMnemonic(KeyEvent.VK_G);

		JMenuItem gameNew = new JMenuItem("New Game(N)");
		gameNew.setMnemonic(KeyEvent.VK_N);
		gameNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
<<<<<<< HEAD
				revealBoard();
=======
				// IMPLEMENT METHOD NEWBOARD
>>>>>>> origin/master
			}
		});
		JMenuItem gameLoad = new JMenuItem("Load Game(L)");
		gameLoad.setMnemonic(KeyEvent.VK_L);
		gameLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// Read existing file
			}
		});

		JMenuItem gameSave = new JMenuItem("Save Game(S)");
		gameSave.setMnemonic(KeyEvent.VK_S);
		gameLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// Print new file that overrides previous one IF it already
				// exists
			}
		});

		JMenuItem gameExit = new JMenuItem("Exit Game(E)");
		gameExit.setMnemonic(KeyEvent.VK_E);
		gameExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		JMenuItem gameHighScores = new JMenuItem("High Scores(H)");
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

		// Panel for Minesweeper board
		boardPanel = new JPanel();
		GridLayout experimentLayout = new GridLayout(10, 10);
		boardPanel.setLayout(experimentLayout);
<<<<<<< HEAD
		boardPanel.setLayout(new GridLayout(10,10));
		boardPanel.setBounds(10, 10, 300, 300);


		// Border border = new LineBorder(Color.BLACK,1);

=======
		// boardPanel.setLayout(new GridLayout(10,10));
		boardPanel.setBounds(10, 10, 300, 300);

		// Create game Board

		// Border border = new LineBorder(Color.BLACK,1);

>>>>>>> origin/master
		// Create GUI board
		for (int x = 0; x < boardButtons.length; x++) {
			for (int y = 0; y < boardButtons[x].length; y++) {

				boardButtons[x][y] = new JButton();
<<<<<<< HEAD

				
				// final because they will not change values
				final JButton clickedButton = boardButtons[x][y];
				final Block b = blockBoard[x][y];
				//final JTextArea c = new JTextArea();
=======
				boardButtons[x][y].setMargin(new Insets(0, 0, 0, 0));
				// final because they will not change values
				final JButton clickedButton = boardButtons[x][y];
				final Block b = blockBoard[x][y];
				// clickedButton.setBorder(border);
				final JTextArea c = new JTextArea();
>>>>>>> origin/master
				final int rows = x;
				final int column = y;

				boardButtons[x][y].addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
					@Override
>>>>>>> origin/master
					public void actionPerformed(ActionEvent event) {

						// case of blank
						if (b instanceof Blank) {

							if (b.getNumOfMinesAround() == 0) {
								clickedButton.setVisible(false);
								checkForWhite(rows, column);
								
							}
							else
							{
								displayNumberBlock(clickedButton ,b.getNumOfMinesAround());
<<<<<<< HEAD
								gameBoard.step(b);
							}
						
						}
						
						// case of mines
						if (b instanceof Mines) {
							gameBoard.step(b);
=======
							}
							// System.out.println("B");
							// c.setVisible(true);
							// clickedButton.

						}
						// case of mines
						if (b instanceof Mines) {
							System.out.println("M");
>>>>>>> origin/master
							ImageIcon mineIMG = new ImageIcon(this.getClass().getResource("img/mine.png"));
							clickedButton.setIcon(mineIMG);
							clickedButton.setDisabledIcon(mineIMG);
							clickedButton.setEnabled(false); 
<<<<<<< HEAD
							
							System.out.println(((Mines) b).getNumOfMines());
							    
						}
						
						// case of treasure
						if (b instanceof Treasure) {
							gameBoard.step(b);
							clickedButton.setBackground(Color.GREEN);
							clickedButton.setEnabled(false);
							
						}

		
=======
							    
						}
						// case of treasure
						if (b instanceof Treasure) {

							System.out.println("T");

						}

						// clickedButton.setBorderPainted(true);
>>>>>>> origin/master

					}
				});

				// Add buttons to panel
				boardPanel.add(boardButtons[x][y]);

			}

<<<<<<< HEAD
		}//end of buttons
		
		
=======
		}
>>>>>>> origin/master

		gameGUI.add(boardPanel);
		
		// Sign In Window/Prompt
		signIN = new JFrame("Enhanced Minesweeper");
		signIN.setSize(350, 100);
		signIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will
		// close the
		// frame when
		// you press X.
		// IMPORTANT
<<<<<<< HEAD
		
		
=======

>>>>>>> origin/master
		JLabel enterName = new JLabel("Enter your name:");
		final JTextField nameField = new JTextField(20);
		JPanel infoPanel = new JPanel();
		JButton submitName = new JButton("Enter");
<<<<<<< HEAD
		submitName.addActionListener(new ActionListener() {	
=======
		submitName.addActionListener(new ActionListener() {
>>>>>>> origin/master
			public void actionPerformed(ActionEvent event) {
				userName = nameField.getText();
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

	protected void displayNumberBlock(JButton clickedButton, int numOfMinesAround) {
		StringBuilder filePath = new StringBuilder();
		filePath.append("img/").append(String.valueOf(numOfMinesAround)).append(".png");
		ImageIcon numIMG = new ImageIcon(this.getClass().getResource(filePath.toString()));
		clickedButton.setIcon(numIMG);
		clickedButton.setDisabledIcon(numIMG);
		clickedButton.setEnabled(false); 
		
	}

<<<<<<< HEAD
=======
	private void doCheckAround(Block b) {
		// b = new Block[10][10];

	}
>>>>>>> origin/master

	// THE MAJESTIC RECURSION METHOD
	private void checkForWhite(int i, int j) {

<<<<<<< HEAD
		gameBoard.step(blockBoard[i][j]);
=======
		
>>>>>>> origin/master
		// Checks that block is blank & 0
		if (blockBoard[i][j] instanceof Blank) {
			boardButtons[i][j].setVisible(false);
			blockBoard[i][j].setAlreadyChecked(true);
			for (int a = i - 1; a <= i + 1; a++) {
				for (int b = j - 1; b <= j + 1; b++) {
<<<<<<< HEAD

					try {

						if (!blockBoard[a][b].isAlreadyChecked()) {


							if (blockBoard[a][b] instanceof Blank) {
								if (blockBoard[a][b].getNumOfMinesAround() == 0) {
									checkForWhite(a, b);

								} else {	
									boardButtons[a][b].doClick();
									blockBoard[a][b].setAlreadyChecked(true);

								}
							}
							if(blockBoard[a][b] instanceof Treasure){
								boardButtons[a][b].doClick();
							}

						}
					} catch (Exception ArrayIndexOutOfBoundsException) {

					}

				}
			}
		}

	}

	
	  public void revealBoard(){
	  for (int x = 0; x <= 9;x++){
		  for (int y = 0; y<= 9; y++){
			  boardButtons[x][y].doClick();
		  }
		  
	  }
		  
	  
	  }
	  
	  /*
	   * For developing purpose, this will display answer
	   */
=======

					try {

						if (!blockBoard[a][b].isAlreadyChecked()) {


							if (blockBoard[a][b] instanceof Blank) {
								if (blockBoard[a][b].getNumOfMinesAround() == 0) {
									checkForWhite(a, b);

								} else {	
									boardButtons[a][b].doClick();
									blockBoard[a][b].setAlreadyChecked(true);

								}
							}

						}
					} catch (Exception ArrayIndexOutOfBoundsException) {

					}

				}
			}
		}

	}

	/*
	 * public void revealBoard(Block[][] board){
	 * 
	 * for(int x = 0; x<board.length;x++){ for (int y = 0; y<board[].getSize();
	 * y++){ if(board[x][y].?revealed? == false){ boardButtons[x][y].doClick();
	 * } } }
	 * 
	 * }
	 */

>>>>>>> origin/master
	public void gameboard() {
		for (int x = 0; x <= 9; x++) {
			for (int y = 0; y <= 9; y++) {
				if (blockBoard[x][y] instanceof Blank) {

					int ss = blockBoard[x][y].getNumOfMinesAround();
					System.out.print(ss);

				}
				if (blockBoard[x][y] instanceof Mines) {
					System.out.print("*");
				}
				if (blockBoard[x][y] instanceof Treasure) {
					System.out.print("T");
				}

			}
			System.out.println("");
		}
	}
<<<<<<< HEAD
	
	
=======

>>>>>>> origin/master
	public static void main(String[] args) {
		
		MinesweeperGUI mainInterface = new MinesweeperGUI();
		mainInterface.gameboard();
		
		
	}

}
