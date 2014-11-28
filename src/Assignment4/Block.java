package Assignment4;

import java.io.Serializable;

public class Block implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numOfMinesAround=0;
	private boolean alreadyChecked=false;
	


	public int getNumOfMinesAround() {
		
		return numOfMinesAround;
	}
	
	
	

	public void setNumOfMinesAround(int numOfMinesAround) {
		this.numOfMinesAround += numOfMinesAround;
	}




	public boolean isAlreadyChecked() {
		return alreadyChecked;
	}



	public void setAlreadyChecked(boolean alreadyChecked) {
		this.alreadyChecked = alreadyChecked;
	}
	
}
