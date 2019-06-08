package collection;

public class PlayerClass {
	String  playerName;
	int playerAge;
	String gameName;
	
	
	public PlayerClass(String playerName, int playerAge, String gameName) {
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.gameName = gameName;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getPlayerAge() {
		return playerAge;
	}


	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
	
}
