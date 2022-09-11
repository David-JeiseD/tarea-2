package t2;
import java.lang.Math;

public class Ej1 {
    int n;
    int inv=0;
    int base;
 
    public void establecerN(int numA){
        n = numA;
    }
    public int obtenerN(){
        return n;
    }
    public void establecerBase(int numB){
        base = numB;
    }
    public int obtenerBase(){
        return base;
    }
   
    public void determinar(){
        while(n>0){
            inv=10*inv +n%base;
            n=n/base;
        }
        while(inv>0){
            n=10*n +inv%base;
            inv=inv/10;
        }
        System.out.println("la conversion es: "+n);
    }  
    
}