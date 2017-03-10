package ui;

import game.GuessingGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by PaiizZ on 3/10/2017 AD.
 */
public class GameUI extends JFrame{
    private GuessingGame game;
    private JFrame frame;
    private JButton buttonEnter;
    private JButton buttonQuit;
    private JTextField inputField;
    private JLabel hint;
    private JLabel text;
    private JLabel counter;
    public GameUI(GuessingGame game){
        this.game = game;
        frame = new JFrame("Guess A Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    class ButtonListenerEnter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            game.guess(Integer.parseInt(inputField.getText()));
            hint.setText(game.getHint());
            counter.setText("You uesd "+game.getCount()+" guesses");
            if (game.getSecret() == Integer.parseInt(inputField.getText())){
                inputField.setEnabled(false);
            }
        }

    }


    private void initComponents() {
        JPanel panel = new JPanel();
        hint = new JLabel(game.getHint(),SwingConstants.CENTER);
        counter = new JLabel("You uesd 0 guesses");
        text = new JLabel("Enter your guess: ");
        inputField = new JTextField(10);
        buttonEnter = new JButton("Enter");
        ButtonListenerEnter buttonListener = new ButtonListenerEnter();
        buttonEnter.addActionListener(buttonListener);
        buttonQuit = new JButton("Give up");

        panel.add(text, BorderLayout.SOUTH);
        panel.add(inputField);
        panel.add(buttonEnter);
        panel.add(buttonQuit);

        frame.add(hint, BorderLayout.NORTH);
        frame.add(counter, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
    }
    public void run(){
        frame.setVisible(true);
    }



}


