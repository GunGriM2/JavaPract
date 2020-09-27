package ru.mirea.practs.pract4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FootballMatch extends JFrame{

    private int score1 = 0;
    private int score2 = 0;
    private String lastScorer = "N/A";
    private String winner = "DRAW";

    public FootballMatch()
    {
        super("Practice 4");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(300,150);
        Container container = getContentPane();

        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        container.setBackground(new Color(r,g,b));

        container.setLayout(new BorderLayout());

        JButton realMadrid = new JButton("Real Madrid");
        JButton mcMilan = new JButton("AC Milan");

        container.add(realMadrid, BorderLayout.EAST);
        container.add(mcMilan, BorderLayout.WEST);
        container.add(new JLabel("Winner: DRAW", SwingConstants.CENTER),BorderLayout.SOUTH);
        container.add(new JLabel("Result: "+score1+" X "+score2, SwingConstants.CENTER),BorderLayout.NORTH);
        container.add(new JLabel("Last scorer: "+lastScorer, SwingConstants.CENTER),BorderLayout.CENTER);

    }
    public static void main(String[]args)
    {
        new FootballMatch().setVisible(true);
    }

}
