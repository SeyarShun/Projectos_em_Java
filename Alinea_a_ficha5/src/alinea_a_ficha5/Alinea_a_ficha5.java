
package alinea_a_ficha5;
import javax.swing.JFrame;
public class Alinea_a_ficha5 {
    public static void main(String[] args) {
        // Criando objecto jframe
        
        JFrame frame = new JFrame();
        Graficos figuras = new Graficos();
        configuracao_interface f = new configuracao_interface();
        
        f.setVisible(true);
        frame.add(figuras);
        frame.setSize(800, 500);
        frame.setVisible(true);
        
        
        
    }
    
}
