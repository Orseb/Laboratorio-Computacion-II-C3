package ejercicio6;

// El código crea un hilo (Obrera) que realiza un cálculo largo
// y luego espera a que este hilo termine antes de imprimir
// el resultado en el hilo principal (Main).

public class Main {
    public static void main(String[] args) {
        Obrera agente = new Obrera();
        agente.start();
        // Hace algo durante el cálculo.
        try { //Espera a que agente termine
            agente.join();
        }catch (InterruptedException e){};
        // Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}
