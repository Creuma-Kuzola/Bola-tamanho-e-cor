/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto1;

import java.awt.Color;

/**
 *
 * @author creuma
 */
public class Bola
{

    private Color cor;
    private int altura;
    private int largura;
    private int x;
    private int y;

    public Bola()
    {

    }

    public Bola(int altura, int largura, int x, int y)
    {
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
    }

    public Bola(Color cor, int altura, int largura, int x, int y)
    {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
    }

    public Color getCor()
    {
        return cor;
    }

    public void setCor(Color cor)
    {
        this.cor = cor;
    }

    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public int getLargura()
    {
        return largura;
    }

    public void setLargura(int largura)
    {
        this.largura = largura;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

}
