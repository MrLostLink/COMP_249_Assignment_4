package Assignment4;

import java.io.Serializable;
import java.util.Random;

public class Mines extends Block implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private int  numOfMines;

	Random r = new Random();
	int start = 1;
	int end = 10;


	private int getNumOfMines() {

		int num = r.nextInt((end-start)+1)+start;
		
		if(num%2!=0 || num>5){
			if(num == 3){
				return 3;//(1/10)
			}
			return 2;//(2/10)
		}
		return 1;//(7/10)
	}

	public void mineDamage(int lives){
		lives-=getNumOfMines();
	}



}
