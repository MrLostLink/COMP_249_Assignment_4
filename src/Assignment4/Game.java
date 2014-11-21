package Assignment4;

import java.util.Random;

public class Game extends Player{

	private int size=10;
	private int numOfProbs = 0;
	private int lives=3;
	private int Score;
	private Block[][] board = new Block[size][size];

	
	public Game(){

	}
	
	public int getNumOfProbs() {
		return numOfProbs;
	}

	public void setNumOfProbs(int numOfProbs) {
		this.numOfProbs = numOfProbs;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	
	//WILL CREATE NEW BOARD(NEW GAME)
	public void createNewBoard(){
		board = new Block[size][size];
		
		Random r = new Random();
		int start = 1;
		int end = 18;
		
		
		
		for(int a = 0; a < size; a++){
			for(int b = 0; b<size;b++){
				
				int num = r.nextInt((end-start)+1)+start;
				
				if(num <=1 && num < 4){
					board[a][b] = new Treasure();
				}
				if(num <=4 && num < 9){
					board[a][b] = new Mines();
				} 
				else {
					board[a][b] = null; //no blank/empty class so we cannot define it as anything when we add it to the game
				}
			}
		}
	}

	//Reveals every block on board(Might have to put in GUI class)
	
	
	//Method click on block
	public void showBlock(int i, int j){
		if(board[i][j].checkBlock() instanceof Mines){
			stepOnMine(i,j);
		}else if(board[i][j].checkBlock() instanceof Treasure){
			stepOnTreasure(i,j);
		} else {
			//PROBLEM HERE, EMPTY(BLANK blocks are null)
			stepOnEmpty(i,j);
		}
			
	}
	
	//Create method land on mine(What game will do when player lands on mine(s))
	private void stepOnMine(int i, int j){
		
		((Mines) board[i][j]).mineDamage(lives);
		
		if(lives <= 0){
			//gameover
		}
	}

	//Create method land on treasure(What game will do if lands on treasure)
	private void stepOnTreasure(int i, int j){
		Random r = new Random();
		int start = 1;
		int end = 30;
		
		int num = r.nextInt((end-start)+1)+start;
		
		if(num%2==0 && num<=10){
			
			((Treasure) board[i][j]).getProbe(numOfProbs);//(5/30)
			return;
			
		} else{
			if(num == 2){
				((Treasure) board[i][j]).immortal();//(1/30)
				return;
			
			} else if(num%2!=0 && num>=16 ){
				((Treasure) board[i][j]).getLives(3);//(8/30)
				return;
			} else {
				((Treasure) board[i][j]).bonusPoints(500);//(16/30)
				return;
			}
		}
		
	}
	
	/*
	 * If user step on neither mine nor treasure.
	 * This method will call method checkAround to determine whether it is blank or has a number associated to it
	 */
	private void stepOnEmpty(int i,int j){
		Score+=100;
		checkAround(i,j);
		
	}

	/*
	 * Check around a specific block and return # of mines found (can only be used for blank blocks)
	 * 
	 * If int are returned, the GUI should reveal its value.
	 */
	private Object checkAround(int i,int j){

		int blockOfMines = 0;
		int numOfTreasuresFound =0;
		boolean alreadyChecked = false;

		for (int p = i - 1; p <= i + 1; p++)
		{
			for (int q = j - 1; q <= j + 1; q++)
			{	
				if(alreadyChecked == false){
				if (board[p][q] !=null && board[p][q] instanceof Mines)
					blockOfMines++;
					alreadyChecked = true;
				if (board[p][q] !=null && board[p][q] instanceof Treasure)
					numOfTreasuresFound++;
					alreadyChecked = true;
				}
			}
		}
		
		//Should system out a warning that a treasure is close
		System.out.println("Treasure nearby");

		if(blockOfMines==0){
			
			Score+=100;
			return 0;
		}
		else{
			return null;
		}
	}

	//Recursion method(only when empty space is blank)
	private static void revealAllNearbyBlank(int i,int j){
		
	}
}
