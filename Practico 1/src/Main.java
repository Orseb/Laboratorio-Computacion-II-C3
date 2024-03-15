import modelos.*;

public class Main {
    public static void main(String[] args) {

        // Creamos los pasajeros con sus datos de Persona y pasaporte de Pasajero
        Pasajero pasajero1 = new Pasajero("Matias", "Gomez", 45723945, 34545);
        Pasajero pasajero2 = new Pasajero("Pedro", "Miras", 44344879, 56753);

        // Creamos el piloto con sus datos de Persona y su placa de Piloto
        Piloto piloto = new Piloto("Simon", "Pulisich", 23456123, 12345);

        // Creamos los aviones
        Avion avion1 = new Avion(20, "Emirates");
        Avion avion2 = new Avion(100, "Qatar Airways");

        // Los insertamos en un array para despues agregarlos a una flota
        Avion[] aviones = {avion1, avion2};
        Flota flota = new Flota("Viajes Internacionales", aviones);

        // Creamos los datos del vuelo y les pasamos Avion y Piloto respectivamente
        Vuelo vuelo = new Vuelo("Buenos Aires", "Nueva York", avion1, piloto);

        // Creamos la reserva entre los pasajeros y el vuelo y agregamos las mismas a un array
        Reserva reserva1 = pasajero1.reservar(vuelo);
        Reserva reserva2 = pasajero2.reservar(vuelo);
        Reserva[] reservas = {reserva1, reserva2};

        // Le agregamos las reservas al vuelo
        vuelo.setReservas(reservas);

        // Mostramos la flota creada y sus respectivos aviones
        imprimirInformacionFlota(flota);

        // Mostramos los datos relacionados en el vuelo
        imprimirInformacionVuelo(vuelo);

        // Implementamos la funcion volar() y hacemos que el piloto vuele el avion
        volarAvion(piloto, vuelo.getAvion());
    }

    // Metodo que muestra las distintas relaciones realizadas en la clase Vuelo
    public static void imprimirInformacionVuelo(Vuelo vuelo) {
        System.out.println("\nEl vuelo va a hacer uso del avion de la empresa " + vuelo.getAvion().getEmpresa() + ".");
        System.out.println("El vuelo parte de " + vuelo.getOrigen() + " a " + vuelo.getDestino() + ".");
        System.out.println("El vuelo se realiza mediante un avion de la empresa " + vuelo.getAvion().getEmpresa() + ", este tiene una capacidad de " + vuelo.getAvion().getCapacidad() + " personas.");
        System.out.println("El vuelo es pilotado por " + vuelo.getPiloto().getNombre() + " " + vuelo.getPiloto().getApellido() + ", placa: " + vuelo.getPiloto().getPlaca() + ".\n");
    }

    public static void imprimirInformacionFlota(Flota flota) {
        System.out.println("\nLa flota " + flota.getNombre() + " contiene los siguientes aviones:");
        for (Avion avion : flota.getAviones()) {
            System.out.println("Avion de la empresa " + avion.getEmpresa() + ", con una capacidad de " + avion.getCapacidad() + " pasajeros.");
        }
    }

    // Metodo que usa el piloto para volar el avion del vuelo correspondiente
    public static void volarAvion(Piloto piloto, Avion avion) {
        piloto.volar(avion);
    }
}