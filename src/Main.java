import game.GuessingGame;
import ui.GameUI;

/**
 * Main class for run application.
 *
 * @author Wanchanapon Thanwaranurak
 *
 * Created on 20/1/2017.
 */

public class Main {
    /** create objects and start the game */
    public static void main( String [] args ) {
            GuessingGame guessingGame = new GuessingGame( 100 );
            GameUI game = new GameUI(guessingGame);
            game.run();

    }
}
