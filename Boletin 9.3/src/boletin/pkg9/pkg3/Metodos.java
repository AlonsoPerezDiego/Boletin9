package boletin.pkg9.pkg3;

import javax.swing.JOptionPane;

public class Metodos {
    private double base, altura;
    
    public Metodos(){    
    }
    
    public Metodos(double b, double h){
        base = b;
        altura = h;
    }
    
    public void calculos(){
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base."));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura."));
        
        while(base<=0|altura<=0){
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base otra vez.\nEsta vez mayor que cero."));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la alturaotra vez.\nEsta vez mayor que cero."));
        }
        
        JOptionPane.showMessageDialog(null, "El area del rectangulo de base " + base + "cm y altura " + altura + "cm es igual a " + base*altura + "cm^2");
    }
    
}
