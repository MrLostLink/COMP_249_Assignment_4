package Assignment4;

import java.io.Serializable;
import java.util.Random;

<<<<<<< HEAD
public class Mines extends Block implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private int  numOfMines;

=======
public class Mines extends Block{
	
>>>>>>> origin/master
	Random r = new Random();
	int start = 1;
	int end = 3;
	final int num = r.nextInt((end-start)+1)+start;


	public int getNumOfMines() {
		
		if(num==1)
			return 1;
	 
		if(num==2)
			return 2;
		else 
		{// num =3
			return 3;
		}
			
	
	}

	public void mineDamage(int lives){
		lives-=1;
	}



}
