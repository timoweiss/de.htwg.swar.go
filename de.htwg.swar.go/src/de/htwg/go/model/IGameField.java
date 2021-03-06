package de.htwg.go.model;
/**
 * Represents the Gamefield of the Game.
 * Provides serveral methods for the general game functionality
 *
 */
public interface IGameField {
	
	/**
	 * returns which player is next (white or black)
	 * @return a string who is next
	 */
	String getNext();

	/**
	 * sets a stone at x,y
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @return true if setting the stone worked, false if not
	 */
	boolean setStone(int x, int y);

	/**
	 * sets a stone at x,y with a color
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @param color
	 */
	void setStone(int x, int y, int color);

	/**
	 * returns the cell status of a stone at x,y
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @return cell status in int (unplaced = 0, white = 1, black = 2)
	 */
	int getCellStatus(int x, int y);

	/**
	 * toString method of the gamefield for console output
	 * @return string of the gamefield
	 */
	String toString();

	/**
	 * checks whether a stone is surrounded or not
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @return boolean
	 */
	boolean fenced(int x, int y);

	/**
	 * returns the whitePlayer
	 * @return IPlayer
	 */
	IPlayer getwhitePlayer();

	/**
	 * returns the blackPlayer
	 * @return IPlayer
	 */
	IPlayer getblackPlayer();

	/**
	 * returns if a cell at x,y is already checked
	* @param x x-coordinate
	 * @param y y-coordinate
	 * @return boolean
	 */
	boolean checked(int x, int y);
	
	/**
	 * allows a player to pass
	 * @return true if both players passed, false if just one players passed
	 */
	boolean pass();
	
	/**
	 * returns the size of the gamefield x * x
	 * @return int
	 */
	int getGameFieldSize();

    boolean passed();
}
