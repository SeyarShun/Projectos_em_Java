
package alinea_b_ficha5;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class alineab extends JPanel {
    
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        
        // desenhando triangulo
        
        int[] pontosX = {300,300,600};
        int[] pontosY = {200,500,300};
        
        g.setColor(Color.red);
        g.fillPolygon(pontosX, pontosY, 3);
        
        // Desenhando Estrela
        
        int[] pontosX1 = {300,250,150,230,200,300,400,370,450,350};
        int[] pontosY2 = {100,200,200,280,400,340,400,280,200,200};
        
        g.setColor(Color.blue);
        g.fillPolygon(pontosX1, pontosY2, 10);


//        int[] pontosX1 = {391,376};
//        int[] pontosY1 = {327,416};

        g.setColor(Color.green);
         g.fillOval(391, 327, 350, 350);
         //g.fillOval(WIDTH, WIDTH, WIDTH, HEIGHT);
         
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        alineab panel = new alineab();

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
