/**
 * Game of guessing a secret number.
 *
 * @author Wanchanapon Thanwaranurak
 *
 * Created on 1/20/2017.
 */

public class Main {
    /** create objects and start the game */
    public static void main( String [] args ) {
        GuessingGame game = new GuessingGame( 30 );
        GameConsole ui = new GameConsole( );
        ui.play( game );
    }
}
