
package modelo;

public abstract class Archivo {
    protected String nombre;
    protected double tamanio;
    
   public abstract double getTamanio ();
   public abstract String getNombre ();
}
