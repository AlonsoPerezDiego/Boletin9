package boletin.pkg9.pkg6;

import javax.swing.JOptionPane;

public class Sueldos {
    
    public void trabajadores(){
        
        int mas = 0, entre = 0, menos = 0;
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce sueldo. \nIntroduce 0 para cerrar."));
        
        while(sueldo != 0){
            
            if(sueldo>=1000&&sueldo<=1750){
                entre++;
            }
            
            else{
                
                if(sueldo>1750){
                mas++;
                }
                
                else{
                    
                    if(sueldo<1000&&sueldo>0){
                        menos++;
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                        
                }
                
            }
            
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce sueldo. \nSi ya están todos pulsa 0."));
            
        }
        double total = (double)(mas + entre + menos);
        JOptionPane.showMessageDialog(null, mas + " trabajadores cobran entre 1000 y 1750€ y un " + (menos/total)*100 + "% de los " + (int)total + " trabajadores que hay en total cobran menos de 1000€.");
        
    }
}
