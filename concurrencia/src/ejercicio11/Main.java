package ejercicio11;

// Este codigo ejecuta un hilo en SleepInterrupt que duerme 20s, despues de un segundo, el Main lo interrumpe
// y no termina el bucle.

public class Main {
    public static void main(String[] args) {
        SleepInterrupt si=new SleepInterrupt();
        Thread t=new Thread(si);
        t.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        System.out.println("in main(): Intterupo a t");
        t.interrupt();
        System.out.println("in main(): termina");
    }
}
