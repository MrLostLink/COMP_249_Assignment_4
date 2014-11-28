package Assignment4;

import java.io.Serializable;

<<<<<<< HEAD
public class Block  implements Serializable{
=======
public class Block implements Serializable{
>>>>>>> origin/master
	
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
	
	public Block(){
		this.alreadyChecked = isAlreadyChecked();
		
	}
	


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
