package Bot;

public class Board {
	Tiles[] tiles; //array of tiles
	Player[] playerList; //list of players currently playing the game
	
	public Board(){
		tiles = new Tiles[41];
		playerList = new Player[4];
	}
	
	public Board(Tiles[] tileList, int[] players){
		tiles = tileList;
		playerList = players;
	}
	
	int[] getPlayerList(){ //returns the list of players
		return playerList;
	}
	
	void setPlayerList(int[] players){ //set the list of players
		playerList = players;
	}
		
	Tiles[] getTiles(){ //return the list of tiles that are used for the board
		return tiles;
	}	
		
	void setTiles(Tiles[] tileList){ //set the tiles used for the board
		tiles = tileList;
	}
	
	
	void printBoard() {
		
	}
	
}
