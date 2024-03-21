package ejercicio5;

// Este codigo crea clientes, y dentro de la clase cliente se llama al recurso
// que hace un hilo por cliente, mostrando su nombre

public class Main {
    public static void main(String[] args) {
        Cliente juan= new Cliente();
        juan.setName("Juan López");
                Cliente ines= new Cliente();
        ines.setName("Inés García");
                juan.start();
        ines.start();
    }
}
