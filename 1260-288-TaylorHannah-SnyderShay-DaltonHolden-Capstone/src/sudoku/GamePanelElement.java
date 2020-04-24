/**
 * ---------------------------------------------------------------------------
 * File name: GamePanelElement.java
 * Project name: SudokuWars
 * ---------------------------------------------------------------------------
 * Creator's name and email: Shay Snyder, snyderse2@etsu.edu
  *							 Holden Dalton, daltonh@etsu.edu
 *							 Hannah Taylor, taylorhm1@mail.etsu.edu
 *
 * Course:  CSCI 1260-288
 * Creation Date: April 20, 2020
 * ---------------------------------------------------------------------------
 */

package sudoku;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * create a JButton class that will represent each
 * JButton element on the game panel
 *
 * <hr>
 * Date created: April 22, 2020
 * Last modified: April 22, 2020
 * 
 * <hr>
 * @author Shay Snyder
 * @author Holden Dalton 
 * @author Hannah Taylor 
 */
public class GamePanelElement extends JButton
{
    /**
     * randomly generated by compiler
     */
    private static final long serialVersionUID = 1L;

    // global variables
    protected char value; // to hold the value of a given element
    protected Settings settings; // to hold the game's settings
    protected Sudoku game; // to hold the game itself
    protected JFrame window; // to hold the game's main window

    /**
	 * arg constructor for the GamePanelElement class
     *
	 * <hr>
	 * Date created: April 22, 2020
	 */
    public GamePanelElement(Sudoku game, Settings settings, char value, JFrame window)
    {
        // initialize the global variables
        this.game = game;
        this.settings = settings;
        this.value = value;
        this.window = window;

        // make the button opaque
        this.setOpaque(true);

        // set the background color
        this.setBackground(Color.decode("#282C34"));

        // set the button's icon
        setIcon();
    } // END: GamePanelElement() arg constructor

    /**
	 * set the image on the button to the button's current value
     *
	 * <hr>
	 * Date created: April 13, 2020
	 */
    protected void setIcon()
    {
        this.setIcon(new ImageIcon(settings.getPathGridElementIcon(value)));
    } // END: setIcon() method
} // END: GamePanelElement class