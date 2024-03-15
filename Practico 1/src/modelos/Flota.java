package modelos;

public class Flota {

    private String nombre;
    private Avion[] aviones;

    public Flota() {
    }

    public Flota(String nombre, Avion[] aviones) {
        this.nombre = nombre;
        this.aviones = aviones;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Avion[] getAviones() {
        return aviones;
    }

    public void setAviones(Avion[] aviones) {
        this.aviones = aviones;
    }
}
