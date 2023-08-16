package alineaF;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
public class semaforo extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.white);
         ////////////////////////////////////////////////////////////////////////// Branch rectângulo equipe 1
        // rectangulo 
        g.setColor(Color.black);
        g.drawRect(150, 180, 200, 400);

        // rectangulo  novo
        g.setColor(Color.black);
        g.fillRect(450, 180, 200, 400);
  ////////////////////////////////////////////////////////////////////////// Branch círculo equipe 2      
        // circulo 1
        g.setColor(Color.red);
        g.fillOval(200, 200, 100, 100);
         ////////////////////////////////////////////////////////////////////////// Branch círculo equipe 3
        // circulo 2
        g.setColor(Color.orange);
        g.fillOval(200, 320, 100, 100);
        
        // circulo 3
        g.setColor(Color.green);
        g.fillOval(200, 440, 100, 100);
        
        // String
        g.setColor(Color.green);
        g.setFont(new Font("righteous", Font.BOLD, 25));
        g.drawString("Suma Suma", 200, 130);
        
        
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        semaforo figura = new semaforo();
        
        
        frame.add(figura);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }
    
}
