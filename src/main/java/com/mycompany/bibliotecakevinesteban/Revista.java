/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecakevinesteban;

/**
 *
 * @author user
 */
public class Revista extends Recurso {
    private int numero;
    private TipoRevista tipo;

    public Revista(int id, String titulo, boolean disponible, int numero, TipoRevista tipo) {
        super(id, titulo, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public TipoRevista getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                ", tipo=" + tipo +
                "} " + super.toString();
    }
}
