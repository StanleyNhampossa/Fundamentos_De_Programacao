package Hermon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Tetse extends JFrame implements ActionListener {

    JLabel question = new JLabel("ARE YOU DUMB?");
    JButton yes = new JButton("YES");
    JButton no = new JButton("NO");

    public Tetse(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Are you dumb?");
        setResizable(false);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public void testeTela(){

        setLayout(null);

        question.setBounds(150, 100, 100, 50);
        yes.setBounds(50, 200, 100, 50);
        no.setBounds(200, 200, 100, 50);

        add(question);
        add(yes);
        add(no);

        yes.addActionListener(this);
        no.addActionListener(this);

    }

    public static void main(String[] args) {
        new Tetse().testeTela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        if(e.getSource() == yes){
            JOptionPane.showMessageDialog(null, "Sabia");
            dispose();
        }

        if(e.getSource() == no){
            int x = random.nextInt(50, 275);
            int y = random.nextInt(50, 175);
            no.setBounds(x, y, 100, 50);
        }
    }
}
