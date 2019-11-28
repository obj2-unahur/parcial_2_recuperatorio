package ar.edu.unahur.obj2.ejercicio5;

public class Hostel {



    public double calculoCostoHabitacion(Habitacion habitacion) {
        double costoTotal = 1300;

        if(habitacion.isCamaDoble()){
            costoTotal += 1000.0;
        }

        if(habitacion.isConToilletePrivado()){
            costoTotal += 500.0;
        }

        if(!habitacion.isCompartida()){
            costoTotal = costoTotal * 2;
        }

        return costoTotal;
    }


}