package boletin.pkg9.pkg4;

import javax.swing.JOptionPane;

public class Numero {
    
    public void tablaMult(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número positivo para ver su tabla de multiplicar. \nIntroduce 0 para cerrar el programa"));
        
        while(num<0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número positivo para ver su tabla de multiplicar. \nIntroduce 0 para cerrar el programa"));
        }
        while(num>0){
            for(int mult = 1; mult<=10; mult++){
                JOptionPane.showMessageDialog(null,num + " * " + mult + " = " + num*mult);
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número positivo para ver su tabla de multiplicar. \nIntroduce 0 para cerrar el programa."));
        }
        if(num==0){
             JOptionPane.showMessageDialog(null, "Adios");
        }
    }
    
}
