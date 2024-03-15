package modelos;

public class Avion {
    private int capacidad;
    private String empresa;
    public Avion() {
    }

    public Avion(int capacidad, String empresa) {
        this.capacidad = capacidad;
        this.empresa = empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}