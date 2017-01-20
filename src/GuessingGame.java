import java.util.Random;

/**
 * Game of guessing a secret number.
 *
 * @author Wanchanapon Thanwaranurak
 *
 * Created on 1/20/2017.
 */

public class GuessingGame {

    private int upperBound;
    private int secret;
    private String hint;

    GuessingGame(int upperBound){
        this.upperBound = upperBound;
        this.secret = getRandomNumber(upperBound) ;
        this.hint = "I'm thinking of a number between 1 and 30";
    }

    private int getRandomNumber(int limit){
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        return rand.nextInt(limit)+1 ;
    }

    public boolean guess (int number){
        if(this.secret == number){
            this.setHint("Correct. The secret is "+this.secret+".");
            return false;
        } else if (this.secret > number){
            this.setHint("Sorry, your guess is too small.");
            return true;
        } else {
            this.setHint("Sorry, your guess is too large.");
            return true;
        }
    }

    public void setHint(String hint){
        this.hint = hint ;
    }

    public String getHint(){
        return this.hint;
    }


}
