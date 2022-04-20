package Hermon;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMarcelo extends JFrame implements ActionListener {

    JLabel lblUsername = new JLabel("USERNAME");
    JLabel lblPassword = new JLabel("PASSWORD");

    JTextField txtUsername = new JTextField();
    JPasswordField txtPassword = new JPasswordField();

    JButton btnEntrar = new JButton("Entrar");
    JButton btnSair = new JButton("Sair");


    public SwingMarcelo(){

        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite fecharmos a tela
        setResizable(false); // Permite redimensionar a tela
        setSize(400, 300); // Permite definirmos dimensões da tela
        setVisible(true); // Permite fechar a tela
        setLocationRelativeTo(null); // Ele deixa a tela numa posição requisitada

    }


    public void gui(){

        setLayout(null); // setLayout serve para definir o layout da tela

        //setBounds é para colocar as dimensões das componentes na tela


        lblUsername.setBounds(50, 60, 100, 40);
        txtUsername.setBounds(200, 60, 150, 40);

        lblPassword.setBounds(50, 140, 100, 40);
        txtPassword.setBounds(200, 140, 150, 40);

        btnEntrar.setBounds(80, 220, 80, 40);
        btnSair.setBounds(240, 220, 80, 40);


        // add serve para adicionar as componentes na tela
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(btnEntrar);
        add(btnSair);


        //Serve para dar vida os botões, campos de texto, entre outros

        txtUsername.addActionListener(this);
        txtPassword.addActionListener(this);
        btnEntrar.addActionListener(this);
        btnSair.addActionListener(this);

    }

    //Este método permite manipularmos o fluxo de dados que acontece com as acções occoridas
    // Como saber o que fazer quando clicar num botão, podes saber o que está dentro de uma caixinha de texto

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnEntrar){

            if((txtUsername.getText().equals("1234")) && (txtPassword.getText().equals("12345"))){
                JOptionPane.showMessageDialog(null, "Bem vindo. Login feito com sucesso");
            }
            else{
                JOptionPane.showMessageDialog(null, "Preencha os dados correctamente");
            }

        }

        if(e.getSource() == btnSair){
            dispose();
        }

    }

    public static void main(String[] args) {
        new SwingMarcelo().gui();
    }






}
