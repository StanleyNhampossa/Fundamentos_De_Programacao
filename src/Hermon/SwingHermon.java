package Hermon;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingHermon extends JFrame implements ActionListener {

    JLabel lblUsername = new JLabel("USERNAME");
    JTextField txtUsername = new JTextField();

    JLabel lblPassword = new JLabel("Password");
    JPasswordField txtPassword = new JPasswordField();

    JButton btnEntrar = new JButton("Entrar");
    JButton btnSair = new JButton("Sair");



    public SwingHermon() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        setLocationRelativeTo(null);

    }

    public void gui(){

        setLayout(null);

        lblUsername.setBounds(50, 60, 100, 40);
        txtUsername.setBounds(200, 60, 150, 40);

        lblPassword.setBounds(50, 140, 100, 40);
        txtPassword.setBounds(200, 140, 150, 40);


        btnEntrar.setBounds(80, 220, 80, 40);
        btnSair.setBounds(240, 220, 80, 40);


        add(lblUsername);
        add(lblPassword);
        add(txtUsername);
        add(txtPassword);
        add(btnEntrar);
        add(btnSair);


        txtPassword.addActionListener(this);
        txtUsername.addActionListener(this);
        btnEntrar.addActionListener(this);
        btnSair.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == btnEntrar){

            if( (txtUsername.getText().toString().equals("1234")) && (txtPassword.getText().toString().equals("1234"))){
                JOptionPane.showMessageDialog(null, "Bem vindo");
                dispose();
                new WorldHello().hello();
            }
            else {
                JOptionPane.showMessageDialog(null, "Intruso");
            }

        }

        if(e.getSource() == btnSair){
            dispose();
        }


    }



    public static void main(String[] args) {

        new SwingHermon().gui();

    }

}
