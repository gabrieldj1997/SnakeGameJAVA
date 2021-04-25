
package testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Testes {
    public static void main(String[] args) {
        
        Objeto obj = new Objeto();
        
        JOptionPane.showMessageDialog(null, obj.hello);
    }
    
    public static class Objeto extends Object{
        public String hello = "aqui ";
    }
}
