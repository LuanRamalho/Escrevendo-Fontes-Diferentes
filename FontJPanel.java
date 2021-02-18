package Escrevendo_com_Fontes;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel
{
    // exibe Strings em diferentes fontes e cores
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        // configura fonte com Serifa (Times), negrito, 12 pt e desenha uma string
        g.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        g.drawString("Programar em Java é tudo de bom.", 20, 30);
        
        // define a fonte como Monospaced (Courier), itálico, 24 pt e desenha uma string
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.drawString("Java é a melhor linguagem de programação que existe.", 20, 50);
        
        // define a fonte como SansSerif (Helvetica), simples, 14 pt e desenha uma string
        g.setFont(new Font("Script MT Bold", Font.BOLD, 20));
        g.drawString("É praticando que se aprende.", 20, 75);
        
        // configura fonte com Serifa (Times), 18 pt, negrito/itálico e desenha uma string
        
        g.setColor(Color.BLUE);
        g.setFont(new Font("ALGERIAN", Font.BOLD + Font.ITALIC, 18));
        g.drawString("Os recursos para programar são os melhoers.", 20, 100);
        
        g.setColor(Color.darkGray);
        g.setFont(new Font("Pristina", Font.BOLD, 20));
        g.drawString("TI é a melhor profissão que existe.",20,125);
    }
} // fim da classe FontJPanel
