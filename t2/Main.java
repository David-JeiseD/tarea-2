package t2;

public class Main {

    public static void main(String args[])
    {
        Ej1 conver = new Ej1();
        conver.establecerN(194);
        conver.establecerBase(5);
        System.out.println("\nValor n es: "+conver.obtenerN());
        System.out.println("Valor de la Base es: "+conver.obtenerBase());
        conver.determinar();
    }
}
