package ejercicio13;

// El código muestra cómo establecer y utilizar prioridades de hilos en Java,
// así como realizar operaciones costosas en diferentes hilos con diferentes prioridades.

public class Main {
    public static void main(String[] args) {
        new SimplePriorities(Thread.MAX_PRIORITY);
        for(int i = 0; i < 5; i++)
            new SimplePriorities(Thread.MIN_PRIORITY);
    }
}
