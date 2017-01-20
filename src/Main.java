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
        GuessingGame game = new GuessingGame( 30 );
        GameConsole ui = new GameConsole( );
        ui.play( game );
    }
}
