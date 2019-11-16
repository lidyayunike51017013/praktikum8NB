/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textditengah;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author User
 */
public class Textditengah extends Panel{
    Textditengah() {
        setBackground(Color.GRAY);
    }
    public void paint(Graphics g) {
        Font f = new Font ("Helvetica", Font.BOLD,48);
        FontMetrics fm = getFontMetrics(f);
        g.setFont(f);
        
        String S = "teks ini tampil ditengah";
        int xpos = (this.size().width - fm.stringWidth(S)) / 2 ;
        int ypos = (this.size().height)/2;
        g.drawString(S, xpos, ypos);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Textditengah gp = new Textditengah();
        f.add(gp);
        f.setSize(600, 300);
        f.setVisible(true);
    }
    
}
