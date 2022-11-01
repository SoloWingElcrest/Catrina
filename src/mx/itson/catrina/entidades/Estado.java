
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.List;
import mx.itson.catrina.enumeradores.Tipo;
import mx.itson.catrina.ui.Main;

/**
 *
 * @author Xylan
 */
public class Estado {

    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;
   
    /**
     * Convierte los datos Json a datos tipo objeto.
     * @param json es el Json a convertir
     * @return el objeto catrina con los datos del json.
     */
     public Estado deserializar(String json){
        Estado estado = new Estado();
        try{
            estado = new Gson().fromJson(json, Estado.class);
        }catch(JsonSyntaxException ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
        }
        return estado;
     }
 /**
  * Establece el valor para la suma de valores deposito.
  * @param listDeposito es la lista que almacena los datos tipo deposito.
  * @return un valor total de la suma de todos los valores deposito.
  */
     public double sumaDeposito(List<Movimiento> listDeposito){
         double totalDeposito = 0;
         
         for(Movimiento mov : listDeposito){
         if(mov.getTipo() == Tipo.DEPOSITO){
           totalDeposito += mov.getCantidad();
            }
            }
        return totalDeposito;
        }
     /**
      * Establece el valor para la suma de valores retiro.
      * @param listRetiro es la lista que almacena los datos de tipo retiro.
      * @return un valor total de la suma de todos los valores deposito.
      */
     public double sumaRetiro(List<Movimiento> listRetiro){
          double totalRetiro = 0;
            
          for(Movimiento mov : listRetiro){
          if(mov.getTipo() == Tipo.RETIRO){
            totalRetiro += mov.getCantidad();
            }
            }
        return totalRetiro;
        }
     
     /**
      * La operacion para calcular el saldo final entre los depositos y los retiros.
      * @param operacion la variable que almacena el metodo.
      * @return el resultado final de la operacion. 
      */
    public double operacion(Movimiento operacion){
        double resultado = sumaDeposito(movimientos) - sumaRetiro(movimientos);
        return resultado;
    }

      
    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}

