/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

/**
 *
 * @author umg
 */
class Usuarios {
    
    String marca;
    String modelo;
    String tipo;
    String problem;

    public Usuarios(String marca, String modelo, String tipo, String problem) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.problem = problem;
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

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    
    
            
    
}
