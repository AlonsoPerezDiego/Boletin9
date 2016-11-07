package boletin.pkg9.pkg2;

public class Metodo {
    
    public void calculos(){
        
        int n1;
        int n2;
        
        for(n1=10; n1<=90; n1++){
            n2 = 10;
            do{
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2) + " & " + n1 + " * " + n2 + " = " + (n1*n2));
                n2++;
            }while(n2<=90);
        }
    }
    
}
