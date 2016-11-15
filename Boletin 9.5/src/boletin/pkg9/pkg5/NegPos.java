package boletin.pkg9.pkg5;

public class NegPos {
    
    public void sucesion(double rep){
        int n = -1;
        int num = 1;
        System.out.println("Sucesión que alterna entre positivos y negativos:");
        do{
            if(n==-1){
                System.out.println(n);
                n = n * -1 + 1;
                num++;
            }
            while(n<0){
                 System.out.println(n);
                n = n * -1 + 1;
                num++;
            }
            while(n>0){
                 System.out.println(n);
                n = n * -1 - 1;
                num++;
            }
        }while(num<=rep);
        
    }
}
