package ejercicio10;

// Este codigo inicia un hilo (MiThread) que muestra por pantalla "Ejecuto" y despues
// de 1 segundo, el Main usa interrupt() para detener el hilo.

public class Main {
    public static void main(String[] args) {
        Thread elThread= new MiThread();
        elThread.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        elThread.interrupt();
    }
}
