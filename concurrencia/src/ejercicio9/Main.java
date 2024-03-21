package ejercicio9;

// el código crea un hilo (MiThread) que imprime "Ejecuto" repetidamente
// en un bucle infinito y duerme durante 100 milisegundos en cada iteración.
// El hilo principal (Main) espera un segundo y luego interrumpe el hilo MiThread.
// Cuando se interrumpe, el hilo MiThread captura la excepción InterruptedException y muestra "Termino en sleep".

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
