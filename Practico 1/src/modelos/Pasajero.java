package modelos;

public class Pasajero extends Persona {
    private int pasaporte;

    public Pasajero(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }

    public Pasajero(String nombre, String apellido, int dni, int pasaporte) {
        super(nombre, apellido, dni);
        this.pasaporte = pasaporte;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Reserva reservar(Vuelo vuelo) {
        System.out.println("El pasajero " + this.getNombre() + " " + this.getApellido() + " ha reservado el vuelo hacia " + vuelo.getDestino() + ".");
        return new Reserva(this, vuelo);
    }
}
