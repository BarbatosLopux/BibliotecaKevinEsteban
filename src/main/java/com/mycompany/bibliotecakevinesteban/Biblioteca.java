/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecakevinesteban;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Biblioteca implements IBiblioteca {
    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    @Override
    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    @Override
    public void prestarRecurso(int id) {
        for (Recurso recurso : recursos) {
            if (recurso.getId() == id) {
                recurso.setDisponible(false);
                break;
            }
        }
    }

    @Override
    public List<Recurso> buscarRecursoPorTitulo(String titulo) {
        List<Recurso> result = new ArrayList<>();
        for (Recurso recurso : recursos) {
            if (recurso.getTitulo().equals(titulo)) {
                result.add(recurso);
            }
        }
        return result;
    }
}
