package firstprac;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootClicker extends JFrame {
    private int clicker1;
    private int clicker2;
    private String someClick;
    private String someClick2;
    JButton firstTeambutton = new JButton("Real Madrid");
    JButton secondTeambutton = new JButton("AC Milano");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    TextField result = new TextField("Your result :");
    TextField winner = new TextField("Winner is");

    FootClicker(){
        super("FootClicker");
        setLayout(new FlowLayout());
        setSize(1024, 900);
        setLayout(null);
        firstTeambutton.setBounds(0, 0, 150, 20);
        secondTeambutton.setBounds(0, 20, 150, 20);
        result.setBounds(0, 40, 150, 20);
        winner.setBounds(0, 60, 150, 20);
        add(firstTeambutton);
        add(secondTeambutton);
        add(result);
        add(winner);

        setVisible(true);
        firstTeambutton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clicker1++;
                String someClick = String.valueOf(clicker1);
                String someClick2 = String.valueOf(clicker2);

                result.setText(someClick + "vs" + someClick2);
                if (clicker1 > clicker2) {
                    winner.setText("Madrid is winner");
                } else if (clicker1 == clicker2) {
                    winner.setText("Draw");
                } else {
                    winner.setText("Your winner is" + " ");
                }
            }
        });

        secondTeambutton.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicker2++;
                String someClick = String.valueOf(clicker1);
                String someClick2 = String.valueOf(clicker2);
                //result.setText(String.valueOf(clicker2));
                result.setText(someClick + "vs" + someClick2);
                if (clicker2 > clicker1) {
                    winner.setText("AC Milan is winner");
                } else if (clicker1 == clicker2) {
                    winner.setText("Draw");
                } else {
                    winner.setText("Your winner is" + " ");
                }
            }
        }));
        String someClick = String.valueOf(clicker1);
        String someClick2 = String.valueOf(clicker2);
    }



    // result.setText(someClick + "vs" + someClick2);


    public static void main(String[] args) {
        new FootClicker();
    }
}

