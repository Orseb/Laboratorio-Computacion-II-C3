package ejercicio7;

// El código demuestra cómo utilizar isInterrupted() para verificar
// si un hilo ha sido interrumpido, y cómo interrumpir un hilo utilizando interrupt().

public class InterruptCheck {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("A:t.isInterrupted()=" + t.isInterrupted());
        t.interrupt();
        System.out.println("B:t.isInterrupted()=" + t.isInterrupted());
        System.out.println("C:t.isInterrupted()=" + t.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida");
        } catch (InterruptedException e) {
            System.out.println("Si ha sido interrumpida");
        }
        System.out.println("D:t.isInterrupted()=" + t.isInterrupted());
    }
}