package Assignment4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Player {
	

	public Player(){
		
	}

	
	private static void writeToSerializedFile(File file, Player player) {
	    try {
	        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
	        output.writeObject(player);
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	private static Player readFromSerializedFile(File file) {
	    Player player = null;
	    try {
	        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
	        player = (Player) input.readObject();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	       e.printStackTrace();
	    }
	    return player;
	}

	
}
