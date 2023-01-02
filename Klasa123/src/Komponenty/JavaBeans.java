/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponenty;
import java.awt.*;
import static java.awt.Color.blue;
import javax.swing.*;
 
/**
 *
 * @author CIWEiI_A
 */
public class JavaBeans  extends JComponent {
    
    private int mMouthWidth = 90;
    private boolean mSmile = true;
    private int szerokosc = 2;
    private Color kolor = new Color (255,255,255);
    private boolean Maseczka = false;

    private boolean Oczy = true;
     
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        // Face
        int w = getWidth();
        int h = getHeight();
        int pad = 12;
        int cw = w - pad * 2;
        int ch = h - pad * 2;
        g2.setColor(kolor);
        g2.fillArc(pad, pad, cw, ch, 0, 360);
        g2.setColor(getForeground());
        g2.drawArc(pad, pad, cw, ch, 0, 360);
        // Mouth
        int sw = cw / szerokosc;
        int sh = ch / szerokosc;
        if (mSmile == true)
            g2.drawArc(w / 2 - sw / 2, h / 2 - sh / 2, sw, sh, 270 - mMouthWidth / 2, mMouthWidth);
        else if (Maseczka == true)
            g2.drawRect(w/3, h/2, cw/2, ch/3);
        else
            g2.drawArc(w / 2 - sw / 2, h / 2 + sh / 3, sw, sh, 90 - mMouthWidth / 2, mMouthWidth);
        // Eyes
        if (Oczy == true)
        {
            g2.fillArc(w / 2 - cw * 1 / 8 - 4 / 2, h / 2 - ch / 4 - 4, 4, 4, 0, 360);
            g2.fillArc(w / 2 + cw * 1 / 8 - 4 / 2, h / 2 - ch / 4 - 4, 4, 4, 0, 360);
        }
        else 
        {
            g2.fillArc(w / 2 - cw * 1 / 8 - 2 / 2, h / 2 - ch / 4 - 4, 2, 2, 0, 360);
            g2.fillArc(w / 2 + cw * 1 / 8 - 2 / 2, h / 2 - ch / 4 - 4, 2, 2, 0, 360);   
        }
        
        
    }
     
    public int getMouthWidth() {
        return mMouthWidth;
    }
     
    public void setMouthWidth(int mw) {
        mMouthWidth = mw;
        repaint();
    }
     
    public void smile() {
        mSmile = true;
        
        repaint();
    }
     
    public void frown() {
        mSmile = false;
        Maseczka =false;
        szerokosc = 2;
        mMouthWidth = 90;
        repaint();
    }
    
    public void malyusmiech(){
        szerokosc = 4;
        mSmile = true;
        repaint();
    }
    
     public void duzyusmiech(){
        mMouthWidth = 160;
        szerokosc = 2;
        mSmile = true;
        repaint();
    }
    
    public void czerwony()
    {
        kolor = new Color(255,0,0);
        repaint();
    }
    
    public void reset()
    {
        mMouthWidth = 90;
        szerokosc = 2;
        mSmile = true;
        Oczy = true;
        kolor = new Color (255,255,255);
        repaint();
    }

    public void niebieski()
    {
        kolor = new Color(0,0,255);
        repaint();
    }      

    public void zielony()
    {
        kolor = new Color(0,255,0);
        repaint();
    }    

    public void nalozmaseczke()
    {   mSmile = false;
        Maseczka =true;
        repaint();
    }
    
    public void oczka()
    {
        Oczy = false;
        repaint();
    }
            
}