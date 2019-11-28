package ar.edu.unahur.obj2.ejercicio3;

import java.util.List;

import static ar.edu.unahur.obj2.ejercicio3.TipoMovimiento.EGRESO;
import static ar.edu.unahur.obj2.ejercicio3.TipoMovimiento.INGRESO;

public class CajaChica {

    private List<Movimiento> movimientos;
    private double saldo;

    public CajaChica(List<Movimiento> movimientos, double saldoInicial) {

        this.movimientos = movimientos;
        saldo = saldoInicial;
    }

    public double saldo(){
        for (Movimiento movimiento: movimientos) {
            if(INGRESO.equals(movimiento.getTipoMovimiento())){
                incrementarSaldo(movimiento.getMonto());
            }else if(EGRESO.equals(movimiento.getTipoMovimiento())){
                decrementarSaldo(movimiento.getMonto());
            }else
                throw new RuntimeException("Tipo de movimiento no permitido");
        }
        return getSaldo();
    }

    public void registrarMovimiento(Movimiento movimiento){
        movimientos.add(movimiento);
    }

    private double getSaldo() {
        return saldo;
    }

    private void incrementarSaldo(double monto) {
        this.saldo += monto;
    }

    private void decrementarSaldo(double monto) {
        this.saldo -= monto;
    }
}
