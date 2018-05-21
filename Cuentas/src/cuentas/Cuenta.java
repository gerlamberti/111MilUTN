/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private String Titular;
    private float Cantidad;
    
    public Cuenta(String tit){
        Titular = tit;
    }
    public Cuenta(String tit, float cant){
        Titular = tit;
        Cantidad = cant;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Titular=" + Titular + ", Cantidad=" + Cantidad + "}";
    }
    
    public void Ingresar(float cant){
        this.Cantidad += cant;
    }
    
    public void Retirar(float cant){
        this.Cantidad -= cant;
        
    }
    
}
