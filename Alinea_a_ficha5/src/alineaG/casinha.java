package alineaG;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
public class casinha extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.white);

        // chapa da casa
        
        int[] pontosX = {300,500,550,250};
        int[] pontosY = {380,380,430,430};
        g.setColor(Color.red);
        g.fillPolygon(pontosX, pontosY, 4);
        g.setColor(Color.blue);
        g.fillRect(300, 430, 200, 100);
        g.setColor(Color.cyan);
        g.fillRect(330, 460, 30, 70);
        g.fillRect(440, 450, 40, 30);
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        casinha panel = new casinha();
        
        frame.add(panel);
        frame.setSize(500,600);
        frame.setVisible(true);
    }
}
