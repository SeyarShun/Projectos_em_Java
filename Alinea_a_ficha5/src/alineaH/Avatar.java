
package alineaH; 
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
public class Avatar extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.white);
        
        g.setColor(Color.black);
        g.drawOval(100, 100, 200, 200); // cabeça
        g.drawOval(150, 150, 30,30); // olho direito
        g.drawOval(230, 150, 30,30); // olho esquerdo
        g.drawLine(200, 190, 185,240); // narina
        g.drawLine(200, 190, 215,240);//narina
        g.drawArc(140,180,120,100,186,170); //boca
        g.drawLine(200, 300, 200,700); // corpo
        g.drawLine(200, 400, 300,500); // braço direito
        g.drawLine(200, 400, 100,500); // braço esquerdo
        g.drawLine(200, 700, 300,800); //perna direita
        g.drawLine(200, 700, 100,800); // perna esquerda
        // texto
        
        g.setColor(Color.black);
        g.setFont(new Font("righteous", Font.BOLD, 28));
        g.drawString("Tobias", 150, 80);
        
        
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        Avatar avatar = new Avatar();
        
        frame.add(avatar);
        frame.setSize(500,1000);
        frame.setVisible(true);
    }
}
