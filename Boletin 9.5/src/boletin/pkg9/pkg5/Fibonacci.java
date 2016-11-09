package boletin.pkg9.pkg5;

public class Fibonacci {
    
    public void sucesionFib(int rep){
        int n1 = 0;
        int n2 = 1;
        int num = 1;
        System.out.println("Sucesion de Fibonacci:");
        System.out.println(n1);
        num++;
        System.out.println(n2);
        num++;
        
        do{
            do{
                System.out.println(n2);
                n1 = n2 + n1;
                num++;
            }while(n2>n1);
            
            while(n1>n2){
                System.out.println(n1);
                n2 = n1+ n2;
                num++;
            }
            
        }while(num<=rep);
    }
}
