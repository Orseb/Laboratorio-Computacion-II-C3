package ejercicio1;
import static java.lang.Thread.sleep;

// Este código demuestra un ejemplo básico de multihilos en Java,
// donde dos hilos ("PING" y "PONG") imprimen sus nombres en la consola alternativamente
// con intervalos de tiempo específicos, y luego se detienen después de 5 segundos.

public class Main {
    public static void main(String[] args) {
        PingPong t1 =new PingPong("PING",33);
        PingPong t2= new PingPong("PONG",10);
// Activación
        t1.start();
        t2.start();
// Espera 2 segundos
        try{ sleep(5000);
        }catch (InterruptedException e){};
// Finaliza la ejecución de los threads
        t1.stop();
        t2.stop();
    }
}