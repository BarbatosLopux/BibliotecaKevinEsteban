/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bibliotecakevinesteban;

import java.util.List;

/**
 *
 * @author user
 */
public interface IBiblioteca {
    void agregarRecurso(Recurso recurso); 
    void prestarRecurso(int id); 
    List <Recurso> buscarRecursoPorTitulo(String titulo); 
    
}
