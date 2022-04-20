package Hermon;

import javax.swing.*;
import java.awt.*;

public class Tets extends JFrame {

    JLabel lblTeste = new JLabel("Hello World");
    JLabel lblzteste2 = new JLabel("Helli 2");


    /*public Tets(){

        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.h)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

     */

    public void umaParte(){
        /*setLayout(null);

        setSize(800, 600);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.h)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lblTeste.setBounds(0, 0, 100, 50);
        add(lblTeste);


         */


    }



    public static void main(String[] args) {

        //new Tets().umaParte();

        Func [] e = new Func[5];
        e[0] = new Func("Julio", "De informatica", "Director",
                "Activo", 2000);
        System.out.println(e[0].getNome());
        /*e[1].setNome("António");
        e[4].setNome("");

         */
        System.out.println(e[0].getSalario());
        /*{("Julio", "De informatica", "Director",
                "Activo", 2000), ("Julio", "De informatica", "Director",
                "Activo", 2000)};

         */
    }


}
