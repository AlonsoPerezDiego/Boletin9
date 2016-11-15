package boletin.pkg9.pkg5;

public class Pares {
    
    public void sucesionPares(double rep){
        int par= 2;
        int num = 1;
        System.out.println("Sucesio de pares:");
        do{
            num++;
            System.out.println(par);
            par = par + 2;
        }while(num <= rep);
        
    }
}
