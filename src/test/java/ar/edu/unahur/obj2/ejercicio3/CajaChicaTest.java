package ar.edu.unahur.obj2.ejercicio3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class CajaChicaTest {

    private Movimiento movimiento1;
    private Movimiento movimiento2;
    private Movimiento movimiento3;
    private CajaChica cajaChica;


    @BeforeMethod
    public void setUp() {
        cajaChica = new CajaChica(new ArrayList<>(), 100);
        movimiento1 = new Movimiento(TipoMovimiento.INGRESO, 15);
        movimiento2 = new Movimiento(TipoMovimiento.EGRESO, 30);
        movimiento3 = new Movimiento(TipoMovimiento.EGRESO, 10);
    }

    @Test
    public void testGetSaldo() {
        cajaChica.registrarMovimiento(movimiento1);
        cajaChica.registrarMovimiento(movimiento2);
        cajaChica.registrarMovimiento(movimiento3);
        assertEquals(cajaChica.saldo(), 75.0);
    }
}