package modelos;

public class Vuelo {

    private String origen;
    private String destino;
    private Avion avion;
    private Piloto piloto;
    private Reserva[] reservas;

    public Vuelo() {
    }

    public Vuelo(String origen, String destino, Avion avion, Piloto piloto) {
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
        this.piloto = piloto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }
}
