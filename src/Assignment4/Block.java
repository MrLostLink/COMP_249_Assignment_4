package Assignment4;

public class Block {
	
	private int numOfMinesAround=0;
	private boolean alreadyChecked;
	


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
