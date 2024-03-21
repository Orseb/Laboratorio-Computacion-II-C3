package ejercicio12;

// El código muestra cómo manejar una posible interrupción pendiente al inicio del programa.
// Si se proporcionan argumentos de línea de comandos, se interrumpe el hilo principal.

public class PendingInterrupt {
    public static void main(String[] args) {
        if (args.length>0){ Thread.currentThread().interrupt();}
        long tiempoInicial=System.currentTimeMillis();
        try{
            Thread.sleep(2000);
            System.out.println("No es interrumpida");
        }catch (InterruptedException e){
            System.out.println("Es interrumpida");
        }
        System.out.println("Tiempo gastado: "+
                (System.currentTimeMillis()-tiempoInicial));
    }
}