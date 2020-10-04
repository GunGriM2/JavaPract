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
        setSize(500,150);
        Container container = getContentPane();

        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        container.setBackground(new Color(r,g,b));

        container.setLayout(new BorderLayout());

        JButton realMadrid = new JButton("Real Madrid");
        JButton acMilan = new JButton("AC Milan");
        JLabel result = new JLabel("Result: "+score1+" X "+score2, SwingConstants.CENTER);
        JLabel Winner = new JLabel("Winner: "+winner, SwingConstants.CENTER);
        JLabel lastScore = new JLabel("Last scorer: "+lastScorer, SwingConstants.CENTER);

        container.add(realMadrid, BorderLayout.EAST);
        container.add(acMilan, BorderLayout.WEST);
        container.add(Winner, BorderLayout.SOUTH);
        container.add(result, BorderLayout.NORTH);
        container.add(lastScore, BorderLayout.CENTER);

        realMadrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                score2++;
                result.setText("Result: "+score1+" X "+score2);

                if (score2 > score1)
                    winner = "Real Madrid";
                else if (score1 > score2)
                    winner = "AC Milan";
                else
                    winner = "DRAW";

                lastScorer = "Real Madrid";

                Winner.setText("Winner: "+winner);
                lastScore.setText("Last scorer: "+lastScorer);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        acMilan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                score1++;
                result.setText("Result: "+score1+" X "+score2);

                if (score2 > score1)
                    winner = "Real Madrid";
                else if (score1 > score2)
                    winner = "AC Milan";
                else
                    winner = "DRAW";

                lastScorer = "AC Milan";

                Winner.setText("Winner: "+winner);
                lastScore.setText("Last scorer: "+lastScorer);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

    }
    public static void main(String[]args)
    {
        new FootballMatch().setVisible(true);
    }

}
