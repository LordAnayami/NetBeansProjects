/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

/**
 *
 * @author CIWEiI_A
 */
import java.awt.*;
import javax.swing.JTextField;


public class JText extends JTextField {
    
    public synchronized void paint(Graphics g){
        Dimension d = getSize();
        int szer = d.width -1;
        int wys = d.height -1;
        g.drawLine(0, 0, szer, wys);
        g.drawLine(0,wys,szer,0);
        
    }
    
}
