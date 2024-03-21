package ejercicio2;

// Similar al primer ejercicio, solo que esta vez se crean hilos en el main
// y el proceso de ejecucion ocurre en PingPong

public class Main {
    public static void main(String[] args) {
        PingPong r1 =new PingPong("PING",33);
        PingPong r2= new PingPong("PONG",10);
        // Se crean los threads
        Thread t1 = new Thread(r1);
        Thread t2= new Thread(r2);
        // Se activan los threads
        t1.start();
        t2.start();
    }
}