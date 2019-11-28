package ar.edu.unahur.obj2.ejercicio2;

public class CafeExpresso {

    private boolean encendida;


    public void encender(){
        if(!isEncendida()){
            setEncendida(Boolean.TRUE);
            System.out.println("Máquina encendida");
        }else {
            System.out.println("La máquina ya está encendida");
        }
    }


    public void apagar(){
        if(isEncendida()){
            setEncendida(Boolean.FALSE);
            System.out.println("Máquina apagada");
        }else {
            System.out.println("La máquina ya está apagada");
        }
    }

    public void servirCafe(){
        if(isEncendida()){
            System.out.println("Sirviendo Café");
        }else
            System.out.println("La máquina está apagada");
    }

    public void darVapor(){
        if(isEncendida()){
            System.out.println("Generando vapor");
        }else
            System.out.println("La máquina está apagada");
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }


}
