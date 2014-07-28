package player;
import java.util.List;

import cards.*;


public class Player {

	private HandOfCards hand;
	private int score;
	private int numberOfGamesPlayed;
	private int numberOfGamesWon;
	private String name;
	private int yearsOfExperience;
	private List<String> knownGames;

	
	
	public Player(HandOfCards hand, int score, int numberOfGamesPlayed, int numberOfGamesWon, String name, int yearsOfExperience, List <String> knownGames){
		this.hand = hand;
		this.score = score;
		this.setNumberOfGamesPlayed(numberOfGamesPlayed);
		this.setNumberOfGamesWon(numberOfGamesWon);
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.knownGames = knownGames;
		
	}
	
	/**
	 * @return the hand
	 */
	public HandOfCards getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(HandOfCards hand) {
		this.hand = hand;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the yearsOfExperience
	 */
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	/**
	 * @param yearsOfExperience the yearsOfExperience to set
	 */
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	/**
	 * @return the knownGames
	 */
	public List<String> getKnownGames() {
		return knownGames;
	}

	/**
	 * @param knownGames the knownGames to set
	 */
	public void setKnownGames(List<String> knownGames) {
		this.knownGames = knownGames;
	}

	/**
	 * @return the numberOfGamesPlayed
	 */
	public int getNumberOfGamesPlayed() {
		return numberOfGamesPlayed;
	}

	/**
	 * @param numberOfGamesPlayed the numberOfGamesPlayed to set
	 */
	public void setNumberOfGamesPlayed(int numberOfGamesPlayed) {
		this.numberOfGamesPlayed = numberOfGamesPlayed;
	}

	/**
	 * @return the numberOfGamesWon
	 */
	public int getNumberOfGamesWon() {
		return numberOfGamesWon;
	}

	/**
	 * @param numberOfGamesWon the numberOfGamesWon to set
	 */
	public void setNumberOfGamesWon(int numberOfGamesWon) {
		this.numberOfGamesWon = numberOfGamesWon;
	}
}
