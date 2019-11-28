package ar.edu.unahur.obj2.ejercicio5;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HostelTest {

    private Hostel hostel;
    private Habitacion habitacion;

    @BeforeMethod
    public void setUp() {
        hostel = new Hostel();
    }

    @Test
    public void costoTotalTest(){
        habitacion = new Habitacion(false,true,true);
        assertEquals(hostel.calculoCostoHabitacion(habitacion), 5600.0);
    }

}