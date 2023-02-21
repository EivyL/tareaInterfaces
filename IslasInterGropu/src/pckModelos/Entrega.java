
package pckModelos;

public class Entrega {
 String codigo;
 String nombre;
 String fecha;
 String descripcion;

    public  Entrega(String codigo, String nombre, String fecha, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

 
}
