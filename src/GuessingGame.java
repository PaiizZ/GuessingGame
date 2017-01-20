import java.util.Random;
/**
 * Game of guessing a secret number.
 *
 * @author Wanchanapon Thanwaranurak
 *
 * Created on 20/1/2017.
 */

public class GuessingGame {
    /** properties of a guessing game */
    private int upperBound;
    private int secret;
    private String hint;
    private int count;

    /**
     * Initialize a new game.
     * @param upperbound is the max value for the secret number (>1).
     */
    GuessingGame(int upperBound){
        this.upperBound = upperBound;
        this.secret = getRandomNumber(upperBound) ;
        this.hint = "I'm thinking of a number between 1 and "+upperBound;
    }

    /**
     * Create a random number between 1 and limit.
     * @param limit is the upper limit for random number
     * @return a random number between 1 and limit (inclusive)
     */
    private int getRandomNumber(int limit){
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        return rand.nextInt(limit)+1 ;
    }

    /**
     *
     * @param number is a number that input to check with the secret number.
     * @return false, when the secret number equal with the number that input
     *         true, when the secret number not equal with number that input
     */
    public boolean guess (int number){
        if(this.secret == number){
            this.setHint("Correct. The secret number is "+this.secret+".\nYou used "+this.getCount()+" guesses.");
            return false;
        } else if (this.secret > number){
            this.setHint("Sorry, your guess is too small.");
            return true;
        } else {
            this.setHint("Sorry, your guess is too large.");
            return true;
        }
    }

    /**
     * Set a hint based to tell about number that too small or too large.
     * @param hint
     */
    public void setHint(String hint){
        this.hint = hint ;
    }

    /**
     * Return a hint based on the most recent guess.
     * @return hint based on most recent guess
     */
    public String getHint(){
        return this.hint;
    }

    /**
     * Return a count of guess.
     * @return count is time to guess.
     */
    public int getCount() {
        return count;
    }

    /**
     * count method is count time of guess.
     */
    public void count() {
        this.count++;
    }
}
