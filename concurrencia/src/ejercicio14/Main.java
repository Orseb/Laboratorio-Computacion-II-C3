package ejercicio14;

// En este codigo, el hilo demonio simplemente ejecuta un bucle infinito
// y está diseñado para terminar cuando el programa principal termina o cuando el hilo es interrumpido.

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienza main()");
        Thread t=new Thread(new DaemondThread());
        t.setDaemon(true);
        t.start();
        try{Thread.sleep(2000);
        }catch (InterruptedException e){};
        System.out.println("Termina main()");
    }
}
