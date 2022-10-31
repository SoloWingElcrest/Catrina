
package mx.itson.catrina.entidades;

import java.util.Date;
import mx.itson.catrina.enumeradores.Tipo;

/**
 *
 * @author Xylan
 */
public class Movimiento {
    
    private double cantidad;
    private Date fecha;
    private String descripcion;
    private Tipo movimiento;
    
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the movimiento
     */
    public Tipo getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(Tipo movimiento) {
        this.movimiento = movimiento;
    }
    

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param monto the monto to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    
}
