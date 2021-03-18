/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author creuma
 */
public class PainelProj1 extends JPanel implements ActionListener, ChangeListener
{

    Bola bola = new Bola(10, 10, 10, 10);
    JButton botaoCor = new JButton();
    Color cor = new Color(0, 51, 255);
    SpinnerModel spinnerModel = new SpinnerNumberModel(1, 0, 410, 10);
    JSpinner spinner = new JSpinner(spinnerModel);
    int raioSpinner;
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
    JPanel painelIcones = new JPanel(new GridLayout(10, 0, 20, 0));
    JLabel labelTamanho = new JLabel("Tamanho");

    public PainelProj1()
    {
        this.setBackground(new Color(255, 255, 255));
        this.setLayout(new BorderLayout());
        adicionarPainelIcones();

    }

    @Override
    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(cor);
        g2d.fillOval(bola.getX(), bola.getY(), bola.getLargura(), bola.getAltura());
        repaint();

    }

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == botaoCor)
        {
            System.out.println("Entrei");
            cor = JColorChooser.showDialog(this, "Escolha uma cor", Color.BLACK);
            System.out.println("Cor: " + cor);

        }
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        raioSpinner = (int) ((JSpinner) e.getSource()).getValue();
        bola.setAltura(raioSpinner);
        bola.setLargura(raioSpinner);

    }

    public void fazerBotaoParecerLabel(JButton botao)
    {
        botao.setFocusPainted(false);
        botao.setMargin(new Insets(0, 0, 0, 0));
        botao.setContentAreaFilled(false);
        botao.setBorderPainted(false);
        botao.setOpaque(false);
        botao.addActionListener(this);
    }

    public void efeitoHoverDoBotao(JButton botao)
    {

        botao.addMouseListener(new MouseAdapter()
        {

            @Override
            public void mouseEntered(MouseEvent arg0)
            {

                botao.setOpaque(true);
                botao.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent arg0)
            {

                botao.setBackground(new Color(211, 211, 211));

            }

        });

    }

    public void adicionarPainelIcones()
    {
        painelIcones.setBackground(new Color(211, 211, 211));
        painelIcones.setPreferredSize(new Dimension(80, 500));
        botaoCor.setIcon(new ImageIcon("/home/creuma/NetBeansProjects/Projecto1/src/projecto1/paint-bucket1.png"));
        botaoCor.setCursor(cursor);
        fazerBotaoParecerLabel(botaoCor);
        efeitoHoverDoBotao(botaoCor);
        spinner.addChangeListener(this);
        spinner.setCursor(cursor);
        painelIcones.add(botaoCor);
        painelIcones.add(labelTamanho);
        painelIcones.add(spinner);
        this.add(painelIcones, BorderLayout.EAST);
    }

}
