package t1;

public class Main {

    public static void main(String args[])
    {
        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ecuacion.establecerA(2);
        ecuacion.establecerB(4);
        ecuacion.establecarC(-6);

        System.out.println("Valor A: "+ecuacion.obtenerA());
        System.out.println("Valor B: "+ecuacion.obtenerB());
        System.out.println("Valor C: "+ecuacion.obtenerC());

        ecuacion.discriminante();


    }
}
