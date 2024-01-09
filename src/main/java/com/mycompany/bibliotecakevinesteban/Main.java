/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bibliotecakevinesteban;

import java.util.List;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro(1, "Cien años de soledad", true, "Gabriel Garcia Marquez");
        Libro libro2 = new Libro(2, "El principito", false , "Antoine de Saint");
        Libro libro3 = new Libro(3, "El señor de los anillos", true, "Tolkien");
        Libro libro4 = new Libro(4, "Don quijote de la mancha", true, "Miguel cervantes");
        Libro libro5 = new Libro(5, "El diario de ana Frank", false, "Ana Frank");
        Revista revista1 = new Revista(3, "People", true, 1, TipoRevista.FARANDULA);
        Revista revista2 = new Revista(4, "Qubo", true, 2, TipoRevista.CHISMES);

        biblioteca.agregarRecurso(libro1);
        biblioteca.agregarRecurso(libro2);
        biblioteca.agregarRecurso(revista1);
        biblioteca.agregarRecurso(revista2);

        biblioteca.prestarRecurso(1);

        List<Recurso> recursos = biblioteca.buscarRecursoPorTitulo("Cien años de soledad");
        for (Recurso recurso : recursos) {
            System.out.println(recurso);
        }
    }
}