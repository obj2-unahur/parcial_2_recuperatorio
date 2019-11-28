package ar.edu.unahur.obj2.ejercicio3;

public class Movimiento {

    private TipoMovimiento tipoMovimiento;
    private double monto;

    public Movimiento(TipoMovimiento tipoMovimiento, double monto) {
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}

