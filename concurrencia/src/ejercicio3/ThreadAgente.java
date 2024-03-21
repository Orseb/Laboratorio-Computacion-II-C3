package ejercicio3;

// Este código demuestra cómo ejecutar una operación costosa
// en un hilo separado para evitar bloquear el hilo principal de la aplicación.

public class ThreadAgente {
    public void operacionCostosa() {
        System.out.println("Tarea dificil.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadAgente agente = new ThreadAgente();
                agente.operacionCostosa();
            }
        });
        thread.start();
        // Aqui se ejecutan las demas tareas.
    }
}

