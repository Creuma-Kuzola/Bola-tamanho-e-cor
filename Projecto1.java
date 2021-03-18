/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto1;

import javax.swing.JFrame;

/**
 *
 * @author creuma
 */
public class Projecto1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here

        JFrame frame = new JFrame("Projecto 1");
        PainelProj1 painelProj1 = new PainelProj1();
        frame.setSize(900, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painelProj1);
    }

}
