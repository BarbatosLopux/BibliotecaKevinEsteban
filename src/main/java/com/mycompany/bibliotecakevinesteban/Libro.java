/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecakevinesteban;

/**
 *
 * @author user
 */
public class Libro extends Recurso {
    private String autor;

    public Libro(int id, String titulo, boolean disponible, String autor) {
        super(id, titulo, disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                "} " + super.toString();
    }
}