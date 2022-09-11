package t3;
import java.lang.Math;

public class Temp {
    int C;
    double F;
    double K;
    double R;
 
    public void establecerC(int numA){
        C = numA;
    }
    public int obtenerC(){
        return C;
    }
   
    public void determinarF(){
        F=((1.8)*C)+32;
        System.out.println("la conversion a farenheit es: "+F);
    }  
    public void determinarK(){
        K=C+273;
        System.out.println("la conversion a kelvin es: "+K);
    }  
    public void determinarR(){
        R=(C*(1.8))+491.67;
        System.out.println("la conversion a rankine es: "+R);
    }  
}