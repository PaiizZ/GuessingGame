package ui;

import game.GuessingGame;

import java.util.Scanner;
/**
 * GameConsole has a play method, it control of application.
 *
 * @author Wanchanapon Thanwaranurak
 *
 * Created on 20/1/2017.
 */
public class GameConsole {
    /**
     * The play method plays a game using input from a user.
     * And play method is a main work of application.
     * @param game is a object from GuessingGame.
     * @return the solution of secret number.
     */
    public int play(GuessingGame game){
        String title = "Guessing Game";
        String prompt = "What is you guess? ";
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.println(title);

        do{
            System.out.println(game.getHint());
            System.out.print(prompt);
            number = input.nextInt();
        } while(game.guess(number));

        System.out.println(game.getHint());
        return number;
    }
}
