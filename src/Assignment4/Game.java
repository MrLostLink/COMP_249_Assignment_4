package Assignment4;

import java.io.Serializable;
import java.util.Random;

public class Game implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int size=10;
	private int numOfProbs = 0;
	private int lives=3;
	private int Score;
	static private Block[][] board = new Block[size][size];
	
	
	
	
	
	public int getScore() {
		return Score;
	}



	public void setScore(int score) {
		Score = score;
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

	

	//WILL CREATE NEW BOARD(NEW GAME)
	public Block[][] createNewBoard(){
		board = new Block[size][size];
		
		Random r = new Random();
		int start = 1;
		int end = 18;
		
		
		
		for(int a = 0; a < size; a++){
			for(int b = 0; b<size;b++){
				
				int num = r.nextInt((end-start)+1)+start;
				
				if(num <=1 && num < 4){
					board[a][b] = new Treasure();
					//System.out.println("Treasure made");
				}
				if(num <=4 && num < 9){
					board[a][b] = new Mines();
					//System.out.println("Mines made");
				} 
				else {
					board[a][b] = new Blank();
					//System.out.println("Blank made");
				}
			}
		}
		addNumbers(board);
		
		return board;
	}

	
	//Reveals every block on board(Might have to put in GUI class)

	
	//Method click on block
	public void showBlock(Block b){
		if(b instanceof Mines){
			stepOnMine();
		}else if(b instanceof Treasure){
			stepOnTreasure();
		} else {
			//PROBLEM HERE, EMPTY(BLANK blocks are null)
			stepOnEmpty();
		}
			
	}
	
	//Create method land on mine(What game will do when player lands on mine(s))
	private void stepOnMine(){
		
		//((Mines) board).mineDamage(getLives());
		
		if(getLives() <= 0){
			//gameover
		}
	}

	//Create method land on treasure(What game will do if lands on treasure)
	private void stepOnTreasure(){
		Random r = new Random();
		int start = 1;
		int end = 30;
		
		int num = r.nextInt((end-start)+1)+start;
		
		if(num%2==0 && num<=10){
			
			//((Treasure) board).getProbe(getNumOfProbs());//(5/30)
			return;
			
		} else{
			if(num == 2){
				//((Treasure) board).immortal();//(1/30)
				return;
			
			} else if(num%2!=0 && num>=16 ){
				//((Treasure) board).getLives(3);//(8/30)
				return;
			} else {
				//((Treasure) board).bonusPoints(500);//(16/30)
				return;
			}
		}
		
	}
	
	/*
	 * If user step on neither mine nor treasure.
	 * This method will call method checkAround to determine whether it is blank or has a number associated to it
	 */
	private void stepOnEmpty(){
		Score+=100;
		
	}

	
	private void addNumbers(Block[][] block){
		for(int i =0;i<block.length;i++){
			for(int j = 0;j<block.length;j++){
				if(block[i][j] instanceof Mines){
					
					for(int a=i-1;a<=i+1;a++){
						for(int b=j-1;b<=j+1;b++){
							try{
							block[a][b].setNumOfMinesAround(1);
							} catch (Exception ArrayIndexOutOfBoundsException){
								
							}
						}
					}
					
				}
			}
		}
	}
	

	
}
