package boletin.pkg9.pkg1;

import javax.swing.JOptionPane;

public class Metodos {
    
    private int rep, pos, neg, cero;
    
    public Metodos(){
        rep = 0;
    }
    
    public Metodos(int p, int ne, int c){
        pos = p;
        neg = ne;
        cero = c;
    }
    
    public void calculos(){
        do{
                        
            double n = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero"));
            if(n<0){
                neg = neg + 1;
            }
            if(n==0){
                cero = cero + 1;
            }
            if(n>0){
                pos = pos + 1;
            }
            
            rep++;
            
        }while(rep<10);
    
        JOptionPane.showMessageDialog(null, "Hay " + neg + " números negativos, " + cero + " veces '0' y " + pos + " números positivos.");
    }
    
}
