import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
public class alineaD extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.black);
        
        g.setColor(Color.white);
        g.drawLine(200, 200, 500, 500);
        g.drawLine(300, 100, 600, 400);
        
         g.drawLine(200, 400, 500, 100);
        g.drawLine(300, 500, 600, 200);
        
        
    }
    
    
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        alineaD rectas = new alineaD();
    
        frame.add(rectas);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }
    
}
