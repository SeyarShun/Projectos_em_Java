
package alineaA_recta;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
public class recta extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.black);
        
        // Desenhando uma recta
        
        g.setColor(Color.white);
        g.drawLine(100, 200, 600,200);  
    }
    
   
    
    
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        recta reta = new recta();
        frame.add(reta);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        
    }
}
