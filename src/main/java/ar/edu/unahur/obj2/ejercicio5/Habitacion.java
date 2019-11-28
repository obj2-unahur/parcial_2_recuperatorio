package ar.edu.unahur.obj2.ejercicio5;

public class Habitacion {

    private boolean compartida;
    private boolean conToilletePrivado;
    private boolean camaDoble;


    public Habitacion(boolean compartida, boolean conToilletePrivado, boolean camaDoble) {
        this.compartida = compartida;
        this.conToilletePrivado = conToilletePrivado;
        this.camaDoble = camaDoble;
    }

    public boolean isCompartida() {
        return compartida;
    }

    public void setCompartida(boolean compartida) {
        this.compartida = compartida;
    }

    public boolean isConToilletePrivado() {
        return conToilletePrivado;
    }

    public void setConToilletePrivado(boolean conToilletePrivado) {
        this.conToilletePrivado = conToilletePrivado;
    }

    public boolean isCamaDoble() {
        return camaDoble;
    }

    public void setCamaDoble(boolean camaDoble) {
        this.camaDoble = camaDoble;
    }
}


