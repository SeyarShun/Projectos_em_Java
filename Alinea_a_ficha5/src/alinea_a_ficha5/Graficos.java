  
package alinea_a_ficha5;
import javax.swing.JPanel;
import java.awt.*;
public class Graficos extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        
        g.setColor(Color.black);
        g.drawOval(150, 50, 120, 100);
        
        g.setColor(Color.black);
        g.drawRect(370, 50, 150,100);
        

        
     /*   // Desenhando triangulo
        
        int[] pontosX = {300,100,500};
        int[] pontosY = {100,300,300};
        g.drawPolygon(pontosX, pontosY, 3);
        */
        
    }
}
