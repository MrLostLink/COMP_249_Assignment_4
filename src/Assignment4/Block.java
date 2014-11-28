package Assignment4;

import java.io.Serializable;

public class Block implements Serializable{
	
<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numOfMinesAround=0;
=======
	private  int numOfMinesAround=0;
>>>>>>> origin/master
	private boolean alreadyChecked=false;
	


	public int getNumOfMinesAround() {
		
		return numOfMinesAround;
	}
	
	public void setNumOfMinesAround(int num) {
		numOfMinesAround = numOfMinesAround + num;
	}


	public boolean isAlreadyChecked() {
		return alreadyChecked;
	}



	public void setAlreadyChecked(boolean alreadyChecked) {
		this.alreadyChecked = alreadyChecked;
	}
	
}
