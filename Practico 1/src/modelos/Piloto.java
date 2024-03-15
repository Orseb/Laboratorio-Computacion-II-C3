package modelos;

public class Piloto extends Persona implements Volador{
    private int placa;

    public Piloto(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }

    public Piloto(String nombre, String apellido, int dni, int placa) {
        super(nombre, apellido, dni);
        this.placa = placa;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public void volar(Avion avion) {
        System.out.println("Partimos en el avion de la Empresa " + avion.getEmpresa() + "!");
    }

}
