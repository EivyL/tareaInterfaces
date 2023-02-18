
package pckModelos;

public class Ingreso {
    
    String marca;
    String modelo;
    String tipo;
    String problema;

    public Ingreso(String marca, String modelo, String tipo, String problema) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.problema = problema;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }


}
