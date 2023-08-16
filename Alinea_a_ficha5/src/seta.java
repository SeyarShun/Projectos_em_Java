import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
public class seta extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.white);
        
        // Desenhando rectangulo no fundo
        g.setColor(Color.gray);
        g.fillRect(100, 100, 750, 400);
        
        
        // Desenhando o poligono
        g.setColor(Color.orange);
        int[] pontosX = {600,500,550,650,700};
        int[] pontosY = {200,300,400,400,300};
        g.fillPolygon(pontosX, pontosY, 5);
        
        // Desenhando circulo
        g.setColor(Color.green);
        g.fillOval(250, 200, 200, 200);
        
       // desenhando seta
        //   int[] pontosX1 = {500,500,300,500,800,700,980};
        //int[] pontosY1 = {400,600,600,800,400,600,600};
        g.setColor(Color.blue);
         //int[] pontosX1 = {800,800,700,850,1000,900,900};
        //int[] pontosY1 = {250,350,350,450,350,350,250};
        
        int[] pontosX1 = {800,800,700,850,1000,900,900};
        int[] pontosY1 = {200,300,300,400,300,300,200};
        g.fillPolygon(pontosX1, pontosY1, 7);
          
     /*     g.drawLine(500,100,500,300);// |
          g.drawLine(500,300,350,300);//- canto esquerdo inferior de |
          g.drawLine(500,100,600,100);// - canto esquerdo superior  de |
          g.drawLine(600,100,600,300);// 
          g.drawLine(600,300,750,300);
          g.drawLine(550,500,550,500);
          g.drawLine(350,300,550,500);
          g.drawLine(750,300,550,500);
          */     
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        seta figuras = new seta();
        
        frame.add(figuras);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
