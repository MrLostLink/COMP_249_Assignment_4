package Assignment4;

public class Treasure extends Block{
	
	
	//If player gets lives are reward
	public void getLives(int lives){
		lives+=3;
	}
	
	//Player gets prob
	public int getProbe(int numOfProb){
		return numOfProb++;
	}
	
	//Player gets points
	public void bonusPoints(int Points){
		Points++;
	}
	
	//Player becomes immortal
	public boolean immortal(){
		return true;
	}
	
}