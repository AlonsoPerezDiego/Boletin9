package boletin.pkg9.pkg5;
// @author Diego

import javax.swing.JOptionPane;

public class Boletin95 {

    public static void main(String[] args) {
        long seleccion = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para la sucesio de pares.\nIntroduce 2 para una sucesión que alterna entre positivos y negativos.\nIntroduce 3 para la sucesion de Fibonacci.\nIntroduce cualquier otro número para cerrar."));
        
        Pares par = new Pares();
        NegPos suces = new NegPos();
        Fibonacci aureo = new Fibonacci();
        
        while(seleccion==1){
            par.sucesionPares(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de digitos que quieres visualizar:")));
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para la sucesio de pares.\nIntroduce 2 para una sucesión que alterna entre positivos y negativos.\nIntroduce 3 para la sucesion de Fibonacci.\nIntroduce cualquier otro número para cerrar."));
        }
        while(seleccion==2){
            suces.sucesion(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de digitos que quieres visualizar:")));
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para la sucesio de pares.\nIntroduce 2 para una sucesión que alterna entre positivos y negativos.\nIntroduce 3 para la sucesion de Fibonacci.\nIntroduce cualquier otro número para cerrar."));
        }
        while(seleccion==3){
            aureo.sucesionFib(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de digitos que quieres visualizar:")));
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para la sucesio de pares.\nIntroduce 2 para una sucesión que alterna entre positivos y negativos.\nIntroduce 3 para la sucesion de Fibonacci.\nIntroduce cualquier otro número para cerrar."));
        if(seleccion<1&&seleccion>3){
            JOptionPane.showMessageDialog(null, "Adios.");
        }
    }
    
}
}
